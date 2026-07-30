package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Value;

/* loaded from: classes3.dex */
public class Analyzer<V extends Value> implements Opcodes {
    private Frame<V>[] frames;
    private List<TryCatchBlockNode>[] handlers;
    private boolean[] inInstructionsToProcess;
    private InsnList insnList;
    private int insnListSize;
    private int[] instructionsToProcess;
    private final Interpreter<V> interpreter;
    private int numInstructionsToProcess;
    private Subroutine[] subroutines;

    protected void init(String str, MethodNode methodNode) throws AnalyzerException {
    }

    protected void newControlFlowEdge(int i, int i2) {
    }

    protected boolean newControlFlowExceptionEdge(int i, int i2) {
        return true;
    }

    public Analyzer(Interpreter<V> interpreter) {
        this.interpreter = interpreter;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Frame<V>[] analyze(String str, MethodNode methodNode) throws AnalyzerException {
        List<TryCatchBlockNode> list;
        Type objectType;
        if ((methodNode.access & 1280) != 0) {
            Frame<V>[] frameArr = new Frame[0];
            this.frames = frameArr;
            return frameArr;
        }
        InsnList insnList = methodNode.instructions;
        this.insnList = insnList;
        int size = insnList.size();
        this.insnListSize = size;
        this.handlers = new List[size];
        this.frames = new Frame[size];
        this.subroutines = new Subroutine[size];
        this.inInstructionsToProcess = new boolean[size];
        this.instructionsToProcess = new int[size];
        this.numInstructionsToProcess = 0;
        for (int i = 0; i < methodNode.tryCatchBlocks.size(); i++) {
            TryCatchBlockNode tryCatchBlockNode = methodNode.tryCatchBlocks.get(i);
            int indexOf = this.insnList.indexOf(tryCatchBlockNode.end);
            for (int indexOf2 = this.insnList.indexOf(tryCatchBlockNode.start); indexOf2 < indexOf; indexOf2++) {
                List<TryCatchBlockNode> list2 = this.handlers[indexOf2];
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.handlers[indexOf2] = list2;
                }
                list2.add(tryCatchBlockNode);
            }
        }
        AbstractInsnNode abstractInsnNode = null;
        Subroutine subroutine = new Subroutine(null, methodNode.maxLocals, null);
        List<AbstractInsnNode> arrayList = new ArrayList<>();
        findSubroutine(0, subroutine, arrayList);
        HashMap hashMap = new HashMap();
        while (!arrayList.isEmpty()) {
            JumpInsnNode jumpInsnNode = (JumpInsnNode) arrayList.remove(0);
            Subroutine subroutine2 = (Subroutine) hashMap.get(jumpInsnNode.label);
            if (subroutine2 == null) {
                Subroutine subroutine3 = new Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                hashMap.put(jumpInsnNode.label, subroutine3);
                findSubroutine(this.insnList.indexOf(jumpInsnNode.label), subroutine3, arrayList);
            } else {
                subroutine2.callers.add(jumpInsnNode);
            }
        }
        for (int i2 = 0; i2 < this.insnListSize; i2++) {
            Subroutine subroutine4 = this.subroutines[i2];
            if (subroutine4 != null && subroutine4.start == null) {
                this.subroutines[i2] = null;
            }
        }
        Frame<V> computeInitialFrame = computeInitialFrame(str, methodNode);
        merge(0, computeInitialFrame, null);
        init(str, methodNode);
        while (true) {
            int i3 = this.numInstructionsToProcess;
            if (i3 > 0) {
                int[] iArr = this.instructionsToProcess;
                int i4 = i3 - 1;
                this.numInstructionsToProcess = i4;
                int i5 = iArr[i4];
                Frame<V> frame = this.frames[i5];
                Subroutine subroutine5 = this.subroutines[i5];
                this.inInstructionsToProcess[i5] = false;
                try {
                    try {
                        AbstractInsnNode abstractInsnNode2 = methodNode.instructions.get(i5);
                        try {
                            int opcode = abstractInsnNode2.getOpcode();
                            int type = abstractInsnNode2.getType();
                            if (type != 8 && type != 15 && type != 14) {
                                computeInitialFrame.init(frame).execute(abstractInsnNode2, this.interpreter);
                                Subroutine subroutine6 = subroutine5 == null ? null : new Subroutine(subroutine5);
                                if (abstractInsnNode2 instanceof JumpInsnNode) {
                                    JumpInsnNode jumpInsnNode2 = (JumpInsnNode) abstractInsnNode2;
                                    if (opcode != 167 && opcode != 168) {
                                        computeInitialFrame.initJumpTarget(opcode, null);
                                        int i6 = i5 + 1;
                                        merge(i6, computeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, i6);
                                    }
                                    int indexOf3 = this.insnList.indexOf(jumpInsnNode2.label);
                                    computeInitialFrame.initJumpTarget(opcode, jumpInsnNode2.label);
                                    if (opcode == 168) {
                                        merge(indexOf3, computeInitialFrame, new Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                                    } else {
                                        merge(indexOf3, computeInitialFrame, subroutine6);
                                    }
                                    newControlFlowEdge(i5, indexOf3);
                                } else if (abstractInsnNode2 instanceof LookupSwitchInsnNode) {
                                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode2;
                                    int indexOf4 = this.insnList.indexOf(lookupSwitchInsnNode.dflt);
                                    computeInitialFrame.initJumpTarget(opcode, lookupSwitchInsnNode.dflt);
                                    merge(indexOf4, computeInitialFrame, subroutine6);
                                    newControlFlowEdge(i5, indexOf4);
                                    for (int i7 = 0; i7 < lookupSwitchInsnNode.labels.size(); i7++) {
                                        LabelNode labelNode = lookupSwitchInsnNode.labels.get(i7);
                                        int indexOf5 = this.insnList.indexOf(labelNode);
                                        computeInitialFrame.initJumpTarget(opcode, labelNode);
                                        merge(indexOf5, computeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, indexOf5);
                                    }
                                } else if (abstractInsnNode2 instanceof TableSwitchInsnNode) {
                                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode2;
                                    int indexOf6 = this.insnList.indexOf(tableSwitchInsnNode.dflt);
                                    computeInitialFrame.initJumpTarget(opcode, tableSwitchInsnNode.dflt);
                                    merge(indexOf6, computeInitialFrame, subroutine6);
                                    newControlFlowEdge(i5, indexOf6);
                                    for (int i8 = 0; i8 < tableSwitchInsnNode.labels.size(); i8++) {
                                        LabelNode labelNode2 = tableSwitchInsnNode.labels.get(i8);
                                        computeInitialFrame.initJumpTarget(opcode, labelNode2);
                                        int indexOf7 = this.insnList.indexOf(labelNode2);
                                        merge(indexOf7, computeInitialFrame, subroutine6);
                                        newControlFlowEdge(i5, indexOf7);
                                    }
                                } else if (opcode == 169) {
                                    if (subroutine6 == null) {
                                        throw new AnalyzerException(abstractInsnNode2, "RET instruction outside of a subroutine");
                                    }
                                    for (int i9 = 0; i9 < subroutine6.callers.size(); i9++) {
                                        int indexOf8 = this.insnList.indexOf(subroutine6.callers.get(i9));
                                        Frame<V> frame2 = this.frames[indexOf8];
                                        if (frame2 != null) {
                                            int i10 = indexOf8 + 1;
                                            merge(i10, frame2, computeInitialFrame, this.subroutines[indexOf8], subroutine6.localsUsed);
                                            newControlFlowEdge(i5, i10);
                                        }
                                    }
                                } else if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                                    if (subroutine6 != null) {
                                        if (abstractInsnNode2 instanceof VarInsnNode) {
                                            int i11 = ((VarInsnNode) abstractInsnNode2).var;
                                            subroutine6.localsUsed[i11] = true;
                                            if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                                subroutine6.localsUsed[i11 + 1] = true;
                                            }
                                        } else if (abstractInsnNode2 instanceof IincInsnNode) {
                                            subroutine6.localsUsed[((IincInsnNode) abstractInsnNode2).var] = true;
                                        }
                                    }
                                    int i12 = i5 + 1;
                                    merge(i12, computeInitialFrame, subroutine6);
                                    newControlFlowEdge(i5, i12);
                                }
                                subroutine5 = subroutine6;
                                list = this.handlers[i5];
                                if (list == null) {
                                    for (TryCatchBlockNode tryCatchBlockNode2 : list) {
                                        if (tryCatchBlockNode2.type == null) {
                                            objectType = Type.getObjectType("java/lang/Throwable");
                                        } else {
                                            objectType = Type.getObjectType(tryCatchBlockNode2.type);
                                        }
                                        if (newControlFlowExceptionEdge(i5, tryCatchBlockNode2)) {
                                            Frame<V> newFrame = newFrame(frame);
                                            newFrame.clearStack();
                                            newFrame.push(this.interpreter.newExceptionValue(tryCatchBlockNode2, newFrame, objectType));
                                            merge(this.insnList.indexOf(tryCatchBlockNode2.handler), newFrame, subroutine5);
                                        }
                                    }
                                }
                            }
                            int i13 = i5 + 1;
                            merge(i13, frame, subroutine5);
                            newControlFlowEdge(i5, i13);
                            list = this.handlers[i5];
                            if (list == null) {
                            }
                        } catch (RuntimeException e) {
                            e = e;
                            abstractInsnNode = abstractInsnNode2;
                            throw new AnalyzerException(abstractInsnNode, "Error at instruction " + i5 + ": " + e.getMessage(), e);
                        }
                    } catch (AnalyzerException e2) {
                        throw new AnalyzerException(e2.node, "Error at instruction " + i5 + ": " + e2.getMessage(), e2);
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } else {
                return this.frames;
            }
        }
    }

    public Frame<V>[] analyzeAndComputeMaxs(String str, MethodNode methodNode) throws AnalyzerException {
        methodNode.maxLocals = computeMaxLocals(methodNode);
        methodNode.maxStack = -1;
        analyze(str, methodNode);
        methodNode.maxStack = computeMaxStack(this.frames);
        return this.frames;
    }

    private static int computeMaxLocals(MethodNode methodNode) {
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(methodNode.desc) >> 2;
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode next = it.next();
            if (next instanceof VarInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((VarInsnNode) next).var + ((next.getOpcode() == 22 || next.getOpcode() == 24 || next.getOpcode() == 55 || next.getOpcode() == 57) ? 2 : 1));
            } else if (next instanceof IincInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((IincInsnNode) next).var + 1);
            }
        }
        return argumentsAndReturnSizes;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [org.objectweb.asm.tree.analysis.Value] */
    private static int computeMaxStack(Frame<?>[] frameArr) {
        int i = 0;
        for (Frame<?> frame : frameArr) {
            if (frame != null) {
                int i2 = 0;
                for (int i3 = 0; i3 < frame.getStackSize(); i3++) {
                    i2 += frame.getStack(i3).getSize();
                }
                i = Math.max(i, i2);
            }
        }
        return i;
    }

    private void findSubroutine(int i, Subroutine subroutine, List<AbstractInsnNode> list) throws AnalyzerException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        while (!arrayList.isEmpty()) {
            int intValue = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
            if (intValue < 0 || intValue >= this.insnListSize) {
                throw new AnalyzerException(null, "Execution can fall off the end of the code");
            }
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[intValue] == null) {
                subroutineArr[intValue] = new Subroutine(subroutine);
                AbstractInsnNode abstractInsnNode = this.insnList.get(intValue);
                if (abstractInsnNode instanceof JumpInsnNode) {
                    if (abstractInsnNode.getOpcode() == 168) {
                        list.add(abstractInsnNode);
                    } else {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(((JumpInsnNode) abstractInsnNode).label)));
                    }
                } else if (abstractInsnNode instanceof TableSwitchInsnNode) {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(tableSwitchInsnNode.labels.get(size))));
                    }
                } else if (abstractInsnNode instanceof LookupSwitchInsnNode) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(lookupSwitchInsnNode.labels.get(size2))));
                    }
                }
                List<TryCatchBlockNode> list2 = this.handlers[intValue];
                if (list2 != null) {
                    Iterator<TryCatchBlockNode> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(it.next().handler)));
                    }
                }
                int opcode = abstractInsnNode.getOpcode();
                if (opcode != 167 && opcode != 191) {
                    switch (opcode) {
                        case Opcodes.RET /* 169 */:
                        case Opcodes.TABLESWITCH /* 170 */:
                        case Opcodes.LOOKUPSWITCH /* 171 */:
                        case Opcodes.IRETURN /* 172 */:
                        case Opcodes.LRETURN /* 173 */:
                        case Opcodes.FRETURN /* 174 */:
                        case Opcodes.DRETURN /* 175 */:
                        case Opcodes.ARETURN /* 176 */:
                        case Opcodes.RETURN /* 177 */:
                            break;
                        default:
                            arrayList.add(Integer.valueOf(intValue + 1));
                            break;
                    }
                }
            }
        }
    }

    private Frame<V> computeInitialFrame(String str, MethodNode methodNode) {
        Frame<V> newFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        int i = 1;
        boolean z = (methodNode.access & 8) == 0;
        if (z) {
            newFrame.setLocal(0, this.interpreter.newParameterValue(z, 0, Type.getObjectType(str)));
        } else {
            i = 0;
        }
        for (Type type : Type.getArgumentTypes(methodNode.desc)) {
            newFrame.setLocal(i, this.interpreter.newParameterValue(z, i, type));
            int i2 = i + 1;
            if (type.getSize() == 2) {
                newFrame.setLocal(i2, this.interpreter.newEmptyValue(i2));
                i += 2;
            } else {
                i = i2;
            }
        }
        while (i < methodNode.maxLocals) {
            newFrame.setLocal(i, this.interpreter.newEmptyValue(i));
            i++;
        }
        newFrame.setReturn(this.interpreter.newReturnTypeValue(Type.getReturnType(methodNode.desc)));
        return newFrame;
    }

    public Frame<V>[] getFrames() {
        return this.frames;
    }

    public List<TryCatchBlockNode> getHandlers(int i) {
        return this.handlers[i];
    }

    protected Frame<V> newFrame(int i, int i2) {
        return new Frame<>(i, i2);
    }

    protected Frame<V> newFrame(Frame<? extends V> frame) {
        return new Frame<>(frame);
    }

    protected boolean newControlFlowExceptionEdge(int i, TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i, this.insnList.indexOf(tryCatchBlockNode.handler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Subroutine subroutine) throws AnalyzerException {
        boolean merge;
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame2 = frameArr[i];
        if (frame2 == null) {
            frameArr[i] = newFrame(frame);
            merge = true;
        } else {
            merge = frame2.merge(frame, this.interpreter);
        }
        Subroutine[] subroutineArr = this.subroutines;
        Subroutine subroutine2 = subroutineArr[i];
        if (subroutine2 == null) {
            if (subroutine != null) {
                subroutineArr[i] = new Subroutine(subroutine);
                merge = true;
            }
        } else if (subroutine != null) {
            merge |= subroutine2.merge(subroutine);
        }
        if (merge) {
            boolean[] zArr = this.inInstructionsToProcess;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Frame<V> frame2, Subroutine subroutine, boolean[] zArr) throws AnalyzerException {
        boolean merge;
        frame2.merge(frame, zArr);
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame3 = frameArr[i];
        if (frame3 == null) {
            frameArr[i] = newFrame(frame2);
            merge = true;
        } else {
            merge = frame3.merge(frame2, this.interpreter);
        }
        Subroutine subroutine2 = this.subroutines[i];
        if (subroutine2 != null && subroutine != null) {
            merge |= subroutine2.merge(subroutine);
        }
        if (merge) {
            boolean[] zArr2 = this.inInstructionsToProcess;
            if (zArr2[i]) {
                return;
            }
            zArr2[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }
}
