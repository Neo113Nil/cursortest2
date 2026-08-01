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

/* loaded from: classes.dex */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0285 A[Catch: RuntimeException -> 0x02cc, AnalyzerException -> 0x02f0, TryCatch #0 {AnalyzerException -> 0x02f0, blocks: (B:51:0x00f2, B:54:0x00f8, B:61:0x010e, B:64:0x0121, B:66:0x0125, B:69:0x0130, B:70:0x013b, B:72:0x014a, B:73:0x015a, B:76:0x027f, B:78:0x0285, B:79:0x0289, B:81:0x028f, B:83:0x0299, B:84:0x02a6, B:87:0x02ac, B:91:0x02a0, B:95:0x0157, B:96:0x015f, B:98:0x0163, B:99:0x017a, B:101:0x0182, B:103:0x019c, B:105:0x01a0, B:106:0x01b7, B:108:0x01bf, B:114:0x01e0, B:116:0x01e8, B:118:0x01fc, B:120:0x021c, B:125:0x0224, B:126:0x022b, B:135:0x023b, B:137:0x0240, B:145:0x0259, B:146:0x0260, B:148:0x0264, B:149:0x026d, B:150:0x011b, B:151:0x0277), top: B:50:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.objectweb.asm.tree.analysis.Analyzer, org.objectweb.asm.tree.analysis.Analyzer<V extends org.objectweb.asm.tree.analysis.Value>] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Frame<V>[] analyze(String str, MethodNode methodNode) throws AnalyzerException {
        AbstractInsnNode abstractInsnNode;
        AbstractInsnNode abstractInsnNode2;
        List<TryCatchBlockNode> list;
        Type objectType;
        Subroutine subroutine;
        int i;
        Object obj;
        boolean z = false;
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
        for (int i2 = 0; i2 < methodNode.tryCatchBlocks.size(); i2++) {
            TryCatchBlockNode tryCatchBlockNode = methodNode.tryCatchBlocks.get(i2);
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
        LabelNode labelNode = null;
        Subroutine subroutine2 = new Subroutine(null, methodNode.maxLocals, null);
        ArrayList arrayList = new ArrayList();
        findSubroutine(0, subroutine2, arrayList);
        HashMap hashMap = new HashMap();
        while (!arrayList.isEmpty()) {
            JumpInsnNode jumpInsnNode = (JumpInsnNode) arrayList.remove(0);
            Subroutine subroutine3 = (Subroutine) hashMap.get(jumpInsnNode.label);
            if (subroutine3 == null) {
                Subroutine subroutine4 = new Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                hashMap.put(jumpInsnNode.label, subroutine4);
                findSubroutine(this.insnList.indexOf(jumpInsnNode.label), subroutine4, arrayList);
            } else {
                subroutine3.callers.add(jumpInsnNode);
            }
        }
        for (int i3 = 0; i3 < this.insnListSize; i3++) {
            Subroutine subroutine5 = this.subroutines[i3];
            if (subroutine5 != null && subroutine5.start == null) {
                this.subroutines[i3] = null;
            }
        }
        Frame computeInitialFrame = computeInitialFrame(str, methodNode);
        merge(0, computeInitialFrame, null);
        init(str, methodNode);
        while (true) {
            int i4 = this.numInstructionsToProcess;
            if (i4 > 0) {
                int[] iArr = this.instructionsToProcess;
                int i5 = i4 - 1;
                this.numInstructionsToProcess = i5;
                int i6 = iArr[i5];
                Frame<V> frame = this.frames[i6];
                Subroutine subroutine6 = this.subroutines[i6];
                this.inInstructionsToProcess[i6] = z;
                try {
                    try {
                        abstractInsnNode2 = methodNode.instructions.get(i6);
                    } catch (AnalyzerException e) {
                        throw new AnalyzerException(e.node, "Error at instruction " + i6 + ": " + e.getMessage(), e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    abstractInsnNode = null;
                }
                try {
                    int opcode = abstractInsnNode2.getOpcode();
                    int type = abstractInsnNode2.getType();
                    if (type != 8 && type != 15 && type != 14) {
                        computeInitialFrame.init(frame).execute(abstractInsnNode2, this.interpreter);
                        ?? subroutine7 = subroutine6 == null ? labelNode : new Subroutine(subroutine6);
                        if (abstractInsnNode2 instanceof JumpInsnNode) {
                            JumpInsnNode jumpInsnNode2 = (JumpInsnNode) abstractInsnNode2;
                            if (opcode != 167 && opcode != 168) {
                                computeInitialFrame.initJumpTarget(opcode, labelNode);
                                int i7 = i6 + 1;
                                merge(i7, computeInitialFrame, subroutine7);
                                newControlFlowEdge(i6, i7);
                            }
                            int indexOf3 = this.insnList.indexOf(jumpInsnNode2.label);
                            computeInitialFrame.initJumpTarget(opcode, jumpInsnNode2.label);
                            if (opcode == 168) {
                                merge(indexOf3, computeInitialFrame, new Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                            } else {
                                merge(indexOf3, computeInitialFrame, subroutine7);
                            }
                            newControlFlowEdge(i6, indexOf3);
                        } else if (abstractInsnNode2 instanceof LookupSwitchInsnNode) {
                            LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode2;
                            int indexOf4 = this.insnList.indexOf(lookupSwitchInsnNode.dflt);
                            computeInitialFrame.initJumpTarget(opcode, lookupSwitchInsnNode.dflt);
                            merge(indexOf4, computeInitialFrame, subroutine7);
                            newControlFlowEdge(i6, indexOf4);
                            for (?? r3 = z; r3 < lookupSwitchInsnNode.labels.size(); r3++) {
                                LabelNode labelNode2 = lookupSwitchInsnNode.labels.get(r3);
                                int indexOf5 = this.insnList.indexOf(labelNode2);
                                computeInitialFrame.initJumpTarget(opcode, labelNode2);
                                merge(indexOf5, computeInitialFrame, subroutine7);
                                newControlFlowEdge(i6, indexOf5);
                            }
                        } else if (abstractInsnNode2 instanceof TableSwitchInsnNode) {
                            TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode2;
                            int indexOf6 = this.insnList.indexOf(tableSwitchInsnNode.dflt);
                            computeInitialFrame.initJumpTarget(opcode, tableSwitchInsnNode.dflt);
                            merge(indexOf6, computeInitialFrame, subroutine7);
                            newControlFlowEdge(i6, indexOf6);
                            for (?? r32 = z; r32 < tableSwitchInsnNode.labels.size(); r32++) {
                                LabelNode labelNode3 = tableSwitchInsnNode.labels.get(r32);
                                computeInitialFrame.initJumpTarget(opcode, labelNode3);
                                int indexOf7 = this.insnList.indexOf(labelNode3);
                                merge(indexOf7, computeInitialFrame, subroutine7);
                                newControlFlowEdge(i6, indexOf7);
                            }
                        } else if (opcode == 169) {
                            if (subroutine7 == 0) {
                                throw new AnalyzerException(abstractInsnNode2, "RET instruction outside of a subroutine");
                            }
                            ?? r5 = z;
                            subroutine7 = subroutine7;
                            while (r5 < subroutine7.callers.size()) {
                                int indexOf8 = this.insnList.indexOf(subroutine7.callers.get(r5));
                                Frame<V> frame2 = this.frames[indexOf8];
                                if (frame2 != null) {
                                    int i8 = indexOf8 + 1;
                                    i = r5;
                                    obj = subroutine7;
                                    merge(i8, frame2, computeInitialFrame, this.subroutines[indexOf8], subroutine7.localsUsed);
                                    newControlFlowEdge(i6, i8);
                                } else {
                                    i = r5;
                                    obj = subroutine7;
                                }
                                subroutine7 = obj;
                                r5 = i + 1;
                            }
                        } else {
                            subroutine = subroutine7;
                            if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                                if (subroutine != null) {
                                    if (abstractInsnNode2 instanceof VarInsnNode) {
                                        int i9 = ((VarInsnNode) abstractInsnNode2).var;
                                        subroutine.localsUsed[i9] = true;
                                        if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                            subroutine.localsUsed[i9 + 1] = true;
                                        }
                                    } else if (abstractInsnNode2 instanceof IincInsnNode) {
                                        subroutine.localsUsed[((IincInsnNode) abstractInsnNode2).var] = true;
                                    }
                                }
                                int i10 = i6 + 1;
                                merge(i10, computeInitialFrame, subroutine);
                                newControlFlowEdge(i6, i10);
                            }
                            subroutine6 = subroutine;
                            list = this.handlers[i6];
                            if (list != null) {
                                for (TryCatchBlockNode tryCatchBlockNode2 : list) {
                                    if (tryCatchBlockNode2.type == null) {
                                        objectType = Type.getObjectType("java/lang/Throwable");
                                    } else {
                                        objectType = Type.getObjectType(tryCatchBlockNode2.type);
                                    }
                                    if (newControlFlowExceptionEdge(i6, tryCatchBlockNode2)) {
                                        Frame<V> newFrame = newFrame(frame);
                                        newFrame.clearStack();
                                        newFrame.push(this.interpreter.newExceptionValue(tryCatchBlockNode2, newFrame, objectType));
                                        merge(this.insnList.indexOf(tryCatchBlockNode2.handler), newFrame, subroutine6);
                                    }
                                }
                            }
                            z = false;
                            labelNode = null;
                        }
                        subroutine = subroutine7;
                        subroutine6 = subroutine;
                        list = this.handlers[i6];
                        if (list != null) {
                        }
                        z = false;
                        labelNode = null;
                    }
                    int i11 = i6 + 1;
                    merge(i11, frame, subroutine6);
                    newControlFlowEdge(i6, i11);
                    list = this.handlers[i6];
                    if (list != null) {
                    }
                    z = false;
                    labelNode = null;
                } catch (RuntimeException e3) {
                    e = e3;
                    abstractInsnNode = abstractInsnNode2;
                    throw new AnalyzerException(abstractInsnNode, "Error at instruction " + i6 + ": " + e.getMessage(), e);
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
            i++;
            if (type.getSize() == 2) {
                newFrame.setLocal(i, this.interpreter.newEmptyValue(i));
                i++;
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
