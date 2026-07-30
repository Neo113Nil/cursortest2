package org.objectweb.asm.tree.analysis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* loaded from: classes3.dex */
public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes {
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
    }

    public SourceInterpreter() {
        super(589824);
        if (getClass() != SourceInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    protected SourceInterpreter(int i) {
        super(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue newValue(Type type) {
        if (type == Type.VOID_TYPE) {
            return null;
        }
        return new SourceValue(type == null ? 1 : type.getSize());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r0 instanceof java.lang.Double) == false) goto L14;
     */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SourceValue newOperation(AbstractInsnNode abstractInsnNode) {
        int opcode = abstractInsnNode.getOpcode();
        int i = 2;
        if (opcode != 9 && opcode != 10 && opcode != 14 && opcode != 15) {
            if (opcode != 18) {
                if (opcode == 178) {
                    i = Type.getType(((FieldInsnNode) abstractInsnNode).desc).getSize();
                }
                i = 1;
            } else {
                Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                if (!(obj instanceof Long)) {
                }
            }
        }
        return new SourceValue(i, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue copyOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        return new SourceValue(sourceValue.getSize(), abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue unaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        int i;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 117 && opcode != 119 && opcode != 133 && opcode != 135 && opcode != 138 && opcode != 143) {
            if (opcode == 180) {
                i = Type.getType(((FieldInsnNode) abstractInsnNode).desc).getSize();
            } else if (opcode != 140 && opcode != 141) {
                i = 1;
            }
            return new SourceValue(i, abstractInsnNode);
        }
        i = 2;
        return new SourceValue(i, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue binaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
        int i;
        switch (abstractInsnNode.getOpcode()) {
            case 47:
            case 49:
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
            case Opcodes.LSHL /* 121 */:
            case Opcodes.LSHR /* 123 */:
            case Opcodes.LUSHR /* 125 */:
            case 127:
            case Opcodes.LOR /* 129 */:
            case Opcodes.LXOR /* 131 */:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        return new SourceValue(i, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue ternaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2, SourceValue sourceValue3) {
        return new SourceValue(1, abstractInsnNode);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends SourceValue> list) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            size = 1;
        } else if (opcode == 186) {
            size = Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc).getSize();
        } else {
            size = Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc).getSize();
        }
        return new SourceValue(size, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue merge(SourceValue sourceValue, SourceValue sourceValue2) {
        if ((sourceValue.insns instanceof SmallSet) && (sourceValue2.insns instanceof SmallSet)) {
            Set<AbstractInsnNode> union = ((SmallSet) sourceValue.insns).union((SmallSet) sourceValue2.insns);
            if (union != sourceValue.insns || sourceValue.size != sourceValue2.size) {
                return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), union);
            }
        } else if (sourceValue.size != sourceValue2.size || !containsAll(sourceValue.insns, sourceValue2.insns)) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(sourceValue.insns);
            hashSet.addAll(sourceValue2.insns);
            return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), hashSet);
        }
        return sourceValue;
    }

    private static <E> boolean containsAll(Set<E> set, Set<E> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }
}
