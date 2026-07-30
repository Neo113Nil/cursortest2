package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* loaded from: classes3.dex */
public abstract class AdviceAdapter extends GeneratorAdapter implements Opcodes {
    private static final String INVALID_OPCODE = "Invalid opcode ";
    private Map<Label, List<Object>> forwardJumpStackFrames;
    private final boolean isConstructor;
    protected int methodAccess;
    protected String methodDesc;
    private List<Object> stackFrame;
    private boolean superClassConstructorCalled;
    private static final Object UNINITIALIZED_THIS = new Object();
    private static final Object OTHER = new Object();

    protected void onMethodEnter() {
    }

    protected void onMethodExit(int i) {
    }

    protected AdviceAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2) {
        super(i, methodVisitor, i2, str, str2);
        this.methodAccess = i2;
        this.methodDesc = str2;
        this.isConstructor = "<init>".equals(str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        super.visitCode();
        if (this.isConstructor) {
            this.stackFrame = new ArrayList();
            this.forwardJumpStackFrames = new HashMap();
        } else {
            onMethodEnter();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        Map<Label, List<Object>> map;
        List<Object> list;
        super.visitLabel(label);
        if (!this.isConstructor || (map = this.forwardJumpStackFrames) == null || (list = map.get(label)) == null) {
            return;
        }
        this.stackFrame = list;
        this.superClassConstructorCalled = false;
        this.forwardJumpStackFrames.remove(label);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    @Override // org.objectweb.asm.MethodVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void visitInsn(int i) {
        if (!this.isConstructor || this.superClassConstructorCalled) {
            if (i != 191) {
                switch (i) {
                }
            }
            onMethodExit(i);
        } else if (i != 190) {
            if (i == 191) {
                popValue();
                onMethodExit(i);
                endConstructorBasicBlockWithoutSuccessor();
            } else {
                if (i != 194 && i != 195) {
                    switch (i) {
                        case 0:
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                            pushValue(OTHER);
                            break;
                        case 9:
                        case 10:
                        case 14:
                        case 15:
                            Object obj = OTHER;
                            pushValue(obj);
                            pushValue(obj);
                            break;
                        default:
                            switch (i) {
                                case 46:
                                case 48:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                case 47:
                                case 49:
                                    break;
                                default:
                                    switch (i) {
                                        case Opcodes.IASTORE /* 79 */:
                                        case Opcodes.FASTORE /* 81 */:
                                        case Opcodes.AASTORE /* 83 */:
                                        case Opcodes.BASTORE /* 84 */:
                                        case Opcodes.CASTORE /* 85 */:
                                        case Opcodes.SASTORE /* 86 */:
                                            popValue();
                                            popValue();
                                            popValue();
                                            break;
                                        case Opcodes.LASTORE /* 80 */:
                                        case Opcodes.DASTORE /* 82 */:
                                            popValue();
                                            popValue();
                                            popValue();
                                            popValue();
                                            break;
                                        case Opcodes.POP /* 87 */:
                                        case 96:
                                        case Opcodes.FADD /* 98 */:
                                        case 100:
                                        case 102:
                                        case 104:
                                        case 106:
                                        case 108:
                                        case 110:
                                        case 112:
                                        case Opcodes.FREM /* 114 */:
                                        case 120:
                                        case Opcodes.LSHL /* 121 */:
                                        case 122:
                                        case Opcodes.LSHR /* 123 */:
                                        case 124:
                                        case Opcodes.LUSHR /* 125 */:
                                        case 126:
                                        case 128:
                                        case 130:
                                            break;
                                        case Opcodes.POP2 /* 88 */:
                                        case Opcodes.LADD /* 97 */:
                                        case Opcodes.DADD /* 99 */:
                                        case 101:
                                        case 103:
                                        case 105:
                                        case 107:
                                        case 109:
                                        case 111:
                                        case Opcodes.LREM /* 113 */:
                                        case Opcodes.DREM /* 115 */:
                                        case 127:
                                        case Opcodes.LOR /* 129 */:
                                        case Opcodes.LXOR /* 131 */:
                                            popValue();
                                            popValue();
                                            break;
                                        case 89:
                                            pushValue(peekValue());
                                            break;
                                        case 90:
                                            int size = this.stackFrame.size();
                                            List<Object> list = this.stackFrame;
                                            list.add(size - 2, list.get(size - 1));
                                            break;
                                        case Opcodes.DUP_X2 /* 91 */:
                                            int size2 = this.stackFrame.size();
                                            List<Object> list2 = this.stackFrame;
                                            list2.add(size2 - 3, list2.get(size2 - 1));
                                            break;
                                        case Opcodes.DUP2 /* 92 */:
                                            int size3 = this.stackFrame.size();
                                            List<Object> list3 = this.stackFrame;
                                            int i2 = size3 - 2;
                                            int i3 = size3 - 1;
                                            list3.add(i2, list3.get(i3));
                                            List<Object> list4 = this.stackFrame;
                                            list4.add(i2, list4.get(i3));
                                            break;
                                        case Opcodes.DUP2_X1 /* 93 */:
                                            int size4 = this.stackFrame.size();
                                            List<Object> list5 = this.stackFrame;
                                            int i4 = size4 - 3;
                                            int i5 = size4 - 1;
                                            list5.add(i4, list5.get(i5));
                                            List<Object> list6 = this.stackFrame;
                                            list6.add(i4, list6.get(i5));
                                            break;
                                        case Opcodes.DUP2_X2 /* 94 */:
                                            int size5 = this.stackFrame.size();
                                            List<Object> list7 = this.stackFrame;
                                            int i6 = size5 - 4;
                                            int i7 = size5 - 1;
                                            list7.add(i6, list7.get(i7));
                                            List<Object> list8 = this.stackFrame;
                                            list8.add(i6, list8.get(i7));
                                            break;
                                        case Opcodes.SWAP /* 95 */:
                                            int size6 = this.stackFrame.size();
                                            List<Object> list9 = this.stackFrame;
                                            list9.add(size6 - 2, list9.get(size6 - 1));
                                            this.stackFrame.remove(size6);
                                            break;
                                        case 116:
                                        case Opcodes.LNEG /* 117 */:
                                        case Opcodes.FNEG /* 118 */:
                                        case Opcodes.DNEG /* 119 */:
                                            break;
                                        default:
                                            switch (i) {
                                                case Opcodes.I2L /* 133 */:
                                                case Opcodes.I2D /* 135 */:
                                                case Opcodes.F2L /* 140 */:
                                                case Opcodes.F2D /* 141 */:
                                                    break;
                                                case Opcodes.I2F /* 134 */:
                                                case Opcodes.L2D /* 138 */:
                                                case Opcodes.F2I /* 139 */:
                                                case Opcodes.D2L /* 143 */:
                                                case Opcodes.I2B /* 145 */:
                                                case Opcodes.I2C /* 146 */:
                                                case Opcodes.I2S /* 147 */:
                                                    break;
                                                case Opcodes.L2I /* 136 */:
                                                case Opcodes.L2F /* 137 */:
                                                case Opcodes.D2I /* 142 */:
                                                case Opcodes.D2F /* 144 */:
                                                case Opcodes.FCMPL /* 149 */:
                                                case Opcodes.FCMPG /* 150 */:
                                                    break;
                                                case Opcodes.LCMP /* 148 */:
                                                case Opcodes.DCMPL /* 151 */:
                                                case Opcodes.DCMPG /* 152 */:
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case Opcodes.IRETURN /* 172 */:
                                                        case Opcodes.LRETURN /* 173 */:
                                                        case Opcodes.FRETURN /* 174 */:
                                                        case Opcodes.DRETURN /* 175 */:
                                                        case Opcodes.ARETURN /* 176 */:
                                                            throw new IllegalArgumentException("Invalid return in constructor");
                                                        case Opcodes.RETURN /* 177 */:
                                                            onMethodExit(i);
                                                            endConstructorBasicBlockWithoutSuccessor();
                                                            break;
                                                        default:
                                                            throw new IllegalArgumentException(INVALID_OPCODE + i);
                                                    }
                                            }
                                    }
                            }
                    }
                }
                popValue();
            }
        }
        super.visitInsn(i);
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter, org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        if (i != 169) {
            switch (i) {
                case 21:
                case 23:
                    pushValue(OTHER);
                    return;
                case 22:
                case 24:
                    Object obj = OTHER;
                    pushValue(obj);
                    pushValue(obj);
                    return;
                case 25:
                    pushValue(i2 == 0 ? UNINITIALIZED_THIS : OTHER);
                    return;
                default:
                    switch (i) {
                        case 54:
                        case 56:
                        case 58:
                            popValue();
                            return;
                        case 55:
                        case 57:
                            popValue();
                            popValue();
                            return;
                        default:
                            throw new IllegalArgumentException(INVALID_OPCODE + i);
                    }
            }
        }
        endConstructorBasicBlockWithoutSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, str, str2, str3);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        char charAt = str3.charAt(0);
        boolean z = charAt == 'J' || charAt == 'D';
        switch (i) {
            case Opcodes.GETSTATIC /* 178 */:
                Object obj = OTHER;
                pushValue(obj);
                if (z) {
                    pushValue(obj);
                    return;
                }
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                popValue();
                if (z) {
                    popValue();
                    return;
                }
                return;
            case Opcodes.GETFIELD /* 180 */:
                if (z) {
                    pushValue(OTHER);
                    return;
                }
                return;
            case Opcodes.PUTFIELD /* 181 */:
                popValue();
                popValue();
                if (z) {
                    popValue();
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(INVALID_OPCODE + i);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        super.visitIntInsn(i, i2);
        if (!this.isConstructor || this.superClassConstructorCalled || i == 188) {
            return;
        }
        pushValue(OTHER);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        Object obj2 = OTHER;
        pushValue(obj2);
        if ((obj instanceof Double) || (obj instanceof Long) || ((obj instanceof ConstantDynamic) && ((ConstantDynamic) obj).getSize() == 2)) {
            pushValue(obj2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(str, i);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            popValue();
        }
        pushValue(OTHER);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        super.visitTypeInsn(i, str);
        if (this.isConstructor && !this.superClassConstructorCalled && i == 187) {
            pushValue(OTHER);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            super.visitMethodInsn(i, str, str2, str3, z);
            doVisitMethodInsn(i & (-257), str2, str3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r6 != 185) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doVisitMethodInsn(int i, String str, String str2) {
        Type returnType;
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        for (Type type : Type.getArgumentTypes(str2)) {
            popValue();
            if (type.getSize() == 2) {
                popValue();
            }
        }
        if (i != 182) {
            if (i == 183) {
                if (popValue() == UNINITIALIZED_THIS && !this.superClassConstructorCalled && str.equals("<init>")) {
                    this.superClassConstructorCalled = true;
                    onMethodEnter();
                }
            }
            returnType = Type.getReturnType(str2);
            if (returnType == Type.VOID_TYPE) {
                Object obj = OTHER;
                pushValue(obj);
                if (returnType.getSize() == 2) {
                    pushValue(obj);
                    return;
                }
                return;
            }
            return;
        }
        popValue();
        returnType = Type.getReturnType(str2);
        if (returnType == Type.VOID_TYPE) {
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        doVisitMethodInsn(Opcodes.INVOKEDYNAMIC, str, str2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        if (i != 198 && i != 199) {
            switch (i) {
                case Opcodes.IF_ICMPEQ /* 159 */:
                case Opcodes.IF_ICMPNE /* 160 */:
                case Opcodes.IF_ICMPLT /* 161 */:
                case Opcodes.IF_ICMPGE /* 162 */:
                case Opcodes.IF_ICMPGT /* 163 */:
                case Opcodes.IF_ICMPLE /* 164 */:
                case Opcodes.IF_ACMPEQ /* 165 */:
                case Opcodes.IF_ACMPNE /* 166 */:
                    popValue();
                    popValue();
                    break;
                case Opcodes.GOTO /* 167 */:
                    endConstructorBasicBlockWithoutSuccessor();
                    break;
                case Opcodes.JSR /* 168 */:
                    pushValue(OTHER);
                    break;
            }
            addForwardJump(label);
        }
        popValue();
        addForwardJump(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        popValue();
        addForwardJumps(label, labelArr);
        endConstructorBasicBlockWithoutSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        popValue();
        addForwardJumps(label, labelArr);
        endConstructorBasicBlockWithoutSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str);
        if (!this.isConstructor || this.forwardJumpStackFrames.containsKey(label3)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(OTHER);
        this.forwardJumpStackFrames.put(label3, arrayList);
    }

    private void addForwardJumps(Label label, Label[] labelArr) {
        addForwardJump(label);
        for (Label label2 : labelArr) {
            addForwardJump(label2);
        }
    }

    private void addForwardJump(Label label) {
        if (this.forwardJumpStackFrames.containsKey(label)) {
            return;
        }
        this.forwardJumpStackFrames.put(label, new ArrayList(this.stackFrame));
    }

    private void endConstructorBasicBlockWithoutSuccessor() {
        this.superClassConstructorCalled = true;
    }

    private Object popValue() {
        return this.stackFrame.remove(r0.size() - 1);
    }

    private Object peekValue() {
        return this.stackFrame.get(r0.size() - 1);
    }

    private void pushValue(Object obj) {
        this.stackFrame.add(obj);
    }
}
