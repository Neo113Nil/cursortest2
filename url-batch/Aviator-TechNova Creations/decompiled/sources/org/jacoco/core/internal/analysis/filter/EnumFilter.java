package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes3.dex */
public final class EnumFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (isMethodFiltered(iFilterContext.getClassName(), iFilterContext.getSuperClassName(), methodNode.name, methodNode.desc)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }

    private boolean isMethodFiltered(String str, String str2, String str3, String str4) {
        if (!"java/lang/Enum".equals(str2)) {
            return false;
        }
        if ("values".equals(str3) && ("()[L" + str + ";").equals(str4)) {
            return true;
        }
        return "valueOf".equals(str3) && new StringBuilder("(Ljava/lang/String;)L").append(str).append(";").toString().equals(str4);
    }
}
