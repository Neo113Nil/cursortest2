package org.jacoco.core.internal.instr;

import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
class ClassFieldProbeArrayStrategy implements IProbeArrayStrategy {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final long classId;
    private final String className;
    private final boolean withFrames;
    private static final Object[] FRAME_STACK_ARRZ = {InstrSupport.DATAFIELD_DESC};
    private static final Object[] FRAME_LOCALS_EMPTY = new Object[0];

    ClassFieldProbeArrayStrategy(String str, long j, boolean z, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.className = str;
        this.classId = j;
        this.withFrames = z;
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public int storeInstance(MethodVisitor methodVisitor, boolean z, int i) {
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.className, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, false);
        methodVisitor.visitVarInsn(58, i);
        return 1;
    }

    @Override // org.jacoco.core.internal.instr.IProbeArrayStrategy
    public void addMembers(ClassVisitor classVisitor, int i) {
        createDataField(classVisitor);
        createInitMethod(classVisitor, i);
    }

    private void createDataField(ClassVisitor classVisitor) {
        classVisitor.visitField(InstrSupport.DATAFIELD_ACC, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC, null, null);
    }

    private void createInitMethod(ClassVisitor classVisitor, int i) {
        MethodVisitor visitMethod = classVisitor.visitMethod(InstrSupport.INITMETHOD_ACC, InstrSupport.INITMETHOD_NAME, InstrSupport.INITMETHOD_DESC, null, null);
        visitMethod.visitCode();
        visitMethod.visitFieldInsn(Opcodes.GETSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        visitMethod.visitInsn(89);
        Label label = new Label();
        visitMethod.visitJumpInsn(Opcodes.IFNONNULL, label);
        visitMethod.visitInsn(87);
        int genInitializeDataField = genInitializeDataField(visitMethod, i);
        if (this.withFrames) {
            visitMethod.visitFrame(-1, 0, FRAME_LOCALS_EMPTY, 1, FRAME_STACK_ARRZ);
        }
        visitMethod.visitLabel(label);
        visitMethod.visitInsn(Opcodes.ARETURN);
        visitMethod.visitMaxs(Math.max(genInitializeDataField, 2), 0);
        visitMethod.visitEnd();
    }

    private int genInitializeDataField(MethodVisitor methodVisitor, int i) {
        int generateDataAccessor = this.accessorGenerator.generateDataAccessor(this.classId, this.className, i, methodVisitor);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC, this.className, InstrSupport.DATAFIELD_NAME, InstrSupport.DATAFIELD_DESC);
        return Math.max(generateDataAccessor, 2);
    }
}
