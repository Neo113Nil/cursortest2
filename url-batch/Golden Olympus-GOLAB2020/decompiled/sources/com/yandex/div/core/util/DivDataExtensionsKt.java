package com.yandex.div.core.util;

import O1.A8;
import O1.Aa;
import O1.AbstractC0849ha;
import O1.AbstractC1130x5;
import O1.C0713a0;
import O1.C0735b4;
import O1.C0754c5;
import O1.C0765cg;
import O1.C0860i3;
import O1.C0925lf;
import O1.C1060t7;
import O1.C1081ua;
import O1.Ib;
import O1.J4;
import O1.Na;
import O1.Nb;
import O1.Qc;
import O1.S5;
import O1.X2;
import O1.X4;
import O1.Yb;
import W1.m;
import Z1.a;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivDataExtensionsKt {
    public static final boolean equalsToConstant(@Nullable Yb yb, @Nullable Yb yb2) {
        if (yb == null) {
            return yb2 == null;
        }
        if (yb instanceof Yb.c) {
            if (yb2 instanceof Yb.c) {
                Yb.c cVar = (Yb.c) yb;
                Yb.c cVar2 = (Yb.c) yb2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f4715b, cVar2.c().f4715b) && ExpressionsKt.equalsToConstant(cVar.c().f4714a, cVar2.c().f4714a)) {
                    return true;
                }
            }
            return false;
        }
        if (yb instanceof Yb.d) {
            return (yb2 instanceof Yb.d) && ExpressionsKt.equalsToConstant(((Yb.d) yb).c().f3146a, ((Yb.d) yb2).c().f3146a);
        }
        if (!(yb instanceof Yb.e)) {
            throw new m();
        }
        if (yb2 instanceof Yb.e) {
            Yb.e eVar = (Yb.e) yb;
            Yb.e eVar2 = (Yb.e) yb2;
            if (ExpressionsKt.equalsToConstant(eVar.c().f5970a, eVar2.c().f5970a)) {
                C0765cg.c cVar3 = eVar.c().f5972c;
                Expression expression = cVar3 != null ? cVar3.f5979b : null;
                C0765cg.c cVar4 = eVar2.c().f5972c;
                if (ExpressionsKt.equalsToConstant(expression, cVar4 != null ? cVar4.f5979b : null)) {
                    C0765cg.c cVar5 = eVar.c().f5972c;
                    Expression expression2 = cVar5 != null ? cVar5.f5978a : null;
                    C0765cg.c cVar6 = eVar2.c().f5972c;
                    if (ExpressionsKt.equalsToConstant(expression2, cVar6 != null ? cVar6.f5978a : null)) {
                        C0765cg.c cVar7 = eVar.c().f5971b;
                        Expression expression3 = cVar7 != null ? cVar7.f5979b : null;
                        C0765cg.c cVar8 = eVar2.c().f5971b;
                        if (ExpressionsKt.equalsToConstant(expression3, cVar8 != null ? cVar8.f5979b : null)) {
                            C0765cg.c cVar9 = eVar.c().f5971b;
                            Expression expression4 = cVar9 != null ? cVar9.f5978a : null;
                            C0765cg.c cVar10 = eVar2.c().f5971b;
                            if (ExpressionsKt.equalsToConstant(expression4, cVar10 != null ? cVar10.f5978a : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable Yb yb) {
        if (yb == null) {
            return true;
        }
        if (yb instanceof Yb.c) {
            Yb.c cVar = (Yb.c) yb;
            return ExpressionsKt.isConstant(cVar.c().f4715b) && ExpressionsKt.isConstant(cVar.c().f4714a);
        }
        if (yb instanceof Yb.d) {
            return ExpressionsKt.isConstantOrNull(((Yb.d) yb).c().f3146a);
        }
        if (!(yb instanceof Yb.e)) {
            throw new m();
        }
        Yb.e eVar = (Yb.e) yb;
        if (ExpressionsKt.isConstantOrNull(eVar.c().f5970a)) {
            C0765cg.c cVar2 = eVar.c().f5972c;
            if (ExpressionsKt.isConstantOrNull(cVar2 != null ? cVar2.f5979b : null)) {
                C0765cg.c cVar3 = eVar.c().f5972c;
                if (ExpressionsKt.isConstantOrNull(cVar3 != null ? cVar3.f5978a : null)) {
                    C0765cg.c cVar4 = eVar.c().f5971b;
                    if (ExpressionsKt.isConstantOrNull(cVar4 != null ? cVar4.f5979b : null)) {
                        C0765cg.c cVar5 = eVar.c().f5971b;
                        if (ExpressionsKt.isConstantOrNull(cVar5 != null ? cVar5.f5978a : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final Colormap toColormap(@NotNull A8 a8, @NotNull final ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(a8, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        List list = a8.f1313b;
        List sortedWith = list != null ? CollectionsKt.sortedWith(list, new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return a.d((Double) ((A8.a) t4).f1319b.evaluate(ExpressionResolver.this), (Double) ((A8.a) t5).f1319b.evaluate(ExpressionResolver.this));
            }
        }) : null;
        ExpressionList expressionList = a8.f1314c;
        if (sortedWith == null) {
            return expressionList != null ? new Colormap(CollectionsKt.toIntArray(expressionList.evaluate(resolver)), null, 2, null) : Colormap.EMPTY;
        }
        int[] iArr = new int[sortedWith.size()];
        float[] fArr = new float[sortedWith.size()];
        int size = sortedWith.size();
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = ((Number) ((A8.a) sortedWith.get(i4)).f1318a.evaluate(resolver)).intValue();
            fArr[i4] = (float) ((Number) ((A8.a) sortedWith.get(i4)).f1319b.evaluate(resolver)).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }

    public static final boolean isConstant(@Nullable S5 s5) {
        if (s5 == null) {
            return true;
        }
        return ExpressionsKt.isConstant(s5.f4715b) && ExpressionsKt.isConstant(s5.f4714a);
    }

    public static final boolean isConstant(@Nullable C0754c5 c0754c5) {
        if (c0754c5 == null) {
            return true;
        }
        return ExpressionsKt.isConstant(c0754c5.f5852c) && ExpressionsKt.isConstant(c0754c5.f5855f) && ExpressionsKt.isConstant(c0754c5.f5853d) && ExpressionsKt.isConstant(c0754c5.f5850a) && ExpressionsKt.isConstantOrNull(c0754c5.f5854e) && ExpressionsKt.isConstantOrNull(c0754c5.f5851b);
    }

    public static final boolean equalsToConstant(@Nullable S5 s5, @Nullable S5 s52) {
        if (s5 == null && s52 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(s5 != null ? s5.f4715b : null, s52 != null ? s52.f4715b : null)) {
            return ExpressionsKt.equalsToConstant(s5 != null ? s5.f4714a : null, s52 != null ? s52.f4714a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable C0754c5 c0754c5, @Nullable C0754c5 c0754c52) {
        if (c0754c5 == null && c0754c52 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5852c : null, c0754c52 != null ? c0754c52.f5852c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5855f : null, c0754c52 != null ? c0754c52.f5855f : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5853d : null, c0754c52 != null ? c0754c52.f5853d : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5850a : null, c0754c52 != null ? c0754c52.f5850a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5854e : null, c0754c52 != null ? c0754c52.f5854e : null)) {
            return ExpressionsKt.equalsToConstant(c0754c5 != null ? c0754c5.f5851b : null, c0754c52 != null ? c0754c52.f5851b : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable C0713a0 c0713a0) {
        if (c0713a0 == null) {
            return true;
        }
        return ExpressionsKt.isConstant(c0713a0.f5581b) && ExpressionsKt.isConstant(c0713a0.f5583d) && ExpressionsKt.isConstant(c0713a0.f5582c) && ExpressionsKt.isConstant(c0713a0.f5580a);
    }

    public static final boolean isConstant(@Nullable C0925lf c0925lf) {
        if (c0925lf == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(c0925lf.f6956c) && isConstant(c0925lf.f6954a) && isConstant(c0925lf.f6955b);
    }

    public static final boolean equalsToConstant(@Nullable C0713a0 c0713a0, @Nullable C0713a0 c0713a02) {
        if (c0713a0 == null && c0713a02 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(c0713a0 != null ? c0713a0.f5581b : null, c0713a02 != null ? c0713a02.f5581b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0713a0 != null ? c0713a0.f5583d : null, c0713a02 != null ? c0713a02.f5583d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(c0713a0 != null ? c0713a0.f5582c : null, c0713a02 != null ? c0713a02.f5582c : null)) {
            return ExpressionsKt.equalsToConstant(c0713a0 != null ? c0713a0.f5580a : null, c0713a02 != null ? c0713a02.f5580a : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable AbstractC0849ha abstractC0849ha) {
        if (abstractC0849ha == null) {
            return true;
        }
        if (abstractC0849ha instanceof AbstractC0849ha.c) {
            AbstractC0849ha.c cVar = (AbstractC0849ha.c) abstractC0849ha;
            return ExpressionsKt.isConstantOrNull(cVar.c().f6483b) && ExpressionsKt.isConstantOrNull(cVar.c().f6483b);
        }
        if (abstractC0849ha instanceof AbstractC0849ha.d) {
            return ExpressionsKt.isConstant(((AbstractC0849ha.d) abstractC0849ha).c().f7367a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable AbstractC1130x5 abstractC1130x5) {
        if (abstractC1130x5 == null || (abstractC1130x5 instanceof AbstractC1130x5.d)) {
            return true;
        }
        if (abstractC1130x5 instanceof AbstractC1130x5.a) {
            return ExpressionsKt.isConstant(((AbstractC1130x5.a) abstractC1130x5).c().f6074a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable C0925lf c0925lf, @Nullable C0925lf c0925lf2) {
        if (c0925lf == null && c0925lf2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(c0925lf != null ? c0925lf.f6956c : null, c0925lf2 != null ? c0925lf2.f6956c : null)) {
            return false;
        }
        if (equalsToConstant(c0925lf != null ? c0925lf.f6954a : null, c0925lf2 != null ? c0925lf2.f6954a : null)) {
            return equalsToConstant(c0925lf != null ? c0925lf.f6955b : null, c0925lf2 != null ? c0925lf2.f6955b : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable X4 x4) {
        if (x4 == null) {
            return true;
        }
        if (!(x4 instanceof X4.c)) {
            throw new m();
        }
        X4.c cVar = (X4.c) x4;
        return ExpressionsKt.isConstant(cVar.c().f4273a) && isConstant(cVar.c().f4274b) && isConstant(cVar.c().f4275c);
    }

    public static final boolean equalsToConstant(@Nullable AbstractC0849ha abstractC0849ha, @Nullable AbstractC0849ha abstractC0849ha2) {
        if (abstractC0849ha == null) {
            return abstractC0849ha2 == null;
        }
        if (abstractC0849ha instanceof AbstractC0849ha.c) {
            if (abstractC0849ha2 instanceof AbstractC0849ha.c) {
                AbstractC0849ha.c cVar = (AbstractC0849ha.c) abstractC0849ha;
                AbstractC0849ha.c cVar2 = (AbstractC0849ha.c) abstractC0849ha2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f6483b, cVar2.c().f6483b) && ExpressionsKt.equalsToConstant(cVar.c().f6482a, cVar2.c().f6482a)) {
                    return true;
                }
            }
            return false;
        }
        if (abstractC0849ha instanceof AbstractC0849ha.d) {
            return (abstractC0849ha2 instanceof AbstractC0849ha.d) && ExpressionsKt.equalsToConstant(((AbstractC0849ha.d) abstractC0849ha).c().f7367a, ((AbstractC0849ha.d) abstractC0849ha2).c().f7367a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable Nb nb) {
        Qc qc;
        if (nb == null) {
            return true;
        }
        if (nb instanceof Nb.d) {
            Nb.d dVar = (Nb.d) nb;
            return ExpressionsKt.isConstantOrNull(dVar.c().f5808a) && isConstant(dVar.c().f5812e) && isConstant(dVar.c().f5811d) && isConstant(dVar.c().f5810c) && isConstant(dVar.c().f5809b);
        }
        if (!(nb instanceof Nb.a)) {
            throw new m();
        }
        Nb.a aVar = (Nb.a) nb;
        return ExpressionsKt.isConstantOrNull(aVar.c().f1302a) && ((qc = aVar.c().f1304c) == null || isConstant(qc)) && isConstant(aVar.c().f1303b);
    }

    public static final boolean equalsToConstant(@Nullable AbstractC1130x5 abstractC1130x5, @Nullable AbstractC1130x5 abstractC1130x52) {
        if (abstractC1130x5 == null) {
            return abstractC1130x52 == null;
        }
        if (abstractC1130x5 instanceof AbstractC1130x5.d) {
            return abstractC1130x52 instanceof AbstractC1130x5.d;
        }
        if (abstractC1130x5 instanceof AbstractC1130x5.a) {
            return (abstractC1130x52 instanceof AbstractC1130x5.a) && ExpressionsKt.equalsToConstant(((AbstractC1130x5.a) abstractC1130x5).c().f6074a, ((AbstractC1130x5.a) abstractC1130x52).c().f6074a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable X4 x4, @Nullable X4 x42) {
        if (x4 == null) {
            return x42 == null;
        }
        if (!(x4 instanceof X4.c)) {
            throw new m();
        }
        if (x42 instanceof X4.c) {
            X4.c cVar = (X4.c) x4;
            X4.c cVar2 = (X4.c) x42;
            if (ExpressionsKt.equalsToConstant(cVar.c().f4273a, cVar2.c().f4273a) && equalsToConstant(cVar.c().f4274b, cVar2.c().f4274b) && equalsToConstant(cVar.c().f4275c, cVar2.c().f4275c)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable Qc qc) {
        if (qc == null) {
            return true;
        }
        return ExpressionsKt.isConstant(qc.f4476a) && ExpressionsKt.isConstant(qc.f4479d) && ExpressionsKt.isConstant(qc.f4478c);
    }

    public static final boolean equalsToConstant(@Nullable Nb nb, @Nullable Nb nb2) {
        if (nb == null) {
            return nb2 == null;
        }
        if (nb instanceof Nb.d) {
            if (nb2 instanceof Nb.d) {
                Nb.d dVar = (Nb.d) nb;
                Nb.d dVar2 = (Nb.d) nb2;
                if (ExpressionsKt.equalsToConstant(dVar.c().f5808a, dVar2.c().f5808a) && equalsToConstant(dVar.c().f5812e, dVar2.c().f5812e) && equalsToConstant(dVar.c().f5811d, dVar2.c().f5811d) && equalsToConstant(dVar.c().f5810c, dVar2.c().f5810c) && equalsToConstant(dVar.c().f5809b, dVar2.c().f5809b)) {
                    return true;
                }
            }
            return false;
        }
        if (!(nb instanceof Nb.a)) {
            throw new m();
        }
        if (nb2 instanceof Nb.a) {
            Nb.a aVar = (Nb.a) nb;
            Nb.a aVar2 = (Nb.a) nb2;
            if (ExpressionsKt.equalsToConstant(aVar.c().f1302a, aVar2.c().f1302a) && equalsToConstant(aVar.c().f1304c, aVar2.c().f1304c) && equalsToConstant(aVar.c().f1303b, aVar2.c().f1303b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable C0860i3 c0860i3) {
        if (c0860i3 == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(c0860i3.f6459a) && isConstant(c0860i3.f6460b) && ExpressionsKt.isConstant(c0860i3.f6461c) && isConstant(c0860i3.f6462d) && isConstant(c0860i3.f6463e);
    }

    public static final boolean isConstant(@Nullable C0735b4 c0735b4) {
        if (c0735b4 == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(c0735b4.f5779c) && ExpressionsKt.isConstantOrNull(c0735b4.f5780d) && ExpressionsKt.isConstantOrNull(c0735b4.f5778b) && ExpressionsKt.isConstantOrNull(c0735b4.f5777a);
    }

    public static final boolean isConstant(@Nullable Ib ib) {
        if (ib == null) {
            return true;
        }
        return ExpressionsKt.isConstant(ib.f3161a) && ExpressionsKt.isConstant(ib.f3162b) && ExpressionsKt.isConstant(ib.f3163c) && isConstant(ib.f3164d);
    }

    public static final boolean equalsToConstant(@Nullable Qc qc, @Nullable Qc qc2) {
        if (qc == null && qc2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(qc != null ? qc.f4476a : null, qc2 != null ? qc2.f4476a : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(qc != null ? qc.f4479d : null, qc2 != null ? qc2.f4479d : null)) {
            return ExpressionsKt.equalsToConstant(qc != null ? qc.f4478c : null, qc2 != null ? qc2.f4478c : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable C1081ua c1081ua) {
        if (c1081ua == null) {
            return true;
        }
        return isConstant(c1081ua.f8167a) && isConstant(c1081ua.f8168b);
    }

    public static final boolean equalsToConstant(@Nullable C0860i3 c0860i3, @Nullable C0860i3 c0860i32) {
        if (c0860i3 == null && c0860i32 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(c0860i3 != null ? c0860i3.f6459a : null, c0860i32 != null ? c0860i32.f6459a : null)) {
            return false;
        }
        if (!equalsToConstant(c0860i3 != null ? c0860i3.f6460b : null, c0860i32 != null ? c0860i32.f6460b : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0860i3 != null ? c0860i3.f6461c : null, c0860i32 != null ? c0860i32.f6461c : null)) {
            return false;
        }
        if (equalsToConstant(c0860i3 != null ? c0860i3.f6462d : null, c0860i32 != null ? c0860i32.f6462d : null)) {
            return equalsToConstant(c0860i3 != null ? c0860i3.f6463e : null, c0860i32 != null ? c0860i32.f6463e : null);
        }
        return false;
    }

    public static final boolean isConstant(@Nullable J4 j4) {
        if (j4 == null) {
            return true;
        }
        return ExpressionsKt.isConstant(j4.f3317a) && ExpressionsKt.isConstant(j4.f3318b);
    }

    public static final boolean isConstant(@Nullable X2 x22) {
        if (x22 == null) {
            return true;
        }
        if (x22 instanceof X2.g) {
            return ExpressionsKt.isConstant(((X2.g) x22).c().f8341a);
        }
        if (x22 instanceof X2.c) {
            X2.c cVar = (X2.c) x22;
            if (ExpressionsKt.isConstant(cVar.c().f4321a) && ExpressionsKt.isConstant(cVar.c().f4322b) && ExpressionsKt.isConstant(cVar.c().f4323c)) {
                List list = cVar.c().f4324d;
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (!isConstant((AbstractC1130x5) it.next())) {
                                break;
                            }
                        }
                    }
                }
                if (!ExpressionsKt.isConstant(cVar.c().f4325e) || !ExpressionsKt.isConstant(cVar.c().f4326f) || !ExpressionsKt.isConstant(cVar.c().f4327g)) {
                    break;
                }
                return true;
            }
            return false;
        }
        if (x22 instanceof X2.d) {
            X2.d dVar = (X2.d) x22;
            return ExpressionsKt.isConstant(dVar.c().f1312a) && ExpressionsKt.isConstantOrNull(dVar.c().f1314c);
        }
        if (x22 instanceof X2.f) {
            X2.f fVar = (X2.f) x22;
            return isConstant(fVar.c().f8809a) && isConstant(fVar.c().f8810b) && ExpressionsKt.isConstantOrNull(fVar.c().f8812d) && isConstant(fVar.c().f8813e);
        }
        if (!(x22 instanceof X2.e)) {
            throw new m();
        }
        X2.e eVar = (X2.e) x22;
        return ExpressionsKt.isConstant(eVar.c().f4647a) && isConstant(eVar.c().f4648b);
    }

    public static final boolean equalsToConstant(@Nullable C0735b4 c0735b4, @Nullable C0735b4 c0735b42) {
        if (c0735b4 == null && c0735b42 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(c0735b4 != null ? c0735b4.f5779c : null, c0735b42 != null ? c0735b42.f5779c : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(c0735b4 != null ? c0735b4.f5780d : null, c0735b42 != null ? c0735b42.f5780d : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(c0735b4 != null ? c0735b4.f5778b : null, c0735b42 != null ? c0735b42.f5778b : null)) {
            return ExpressionsKt.equalsToConstant(c0735b4 != null ? c0735b4.f5777a : null, c0735b42 != null ? c0735b42.f5777a : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable Ib ib, @Nullable Ib ib2) {
        if (ib == null && ib2 == null) {
            return true;
        }
        if (!ExpressionsKt.equalsToConstant(ib != null ? ib.f3161a : null, ib2 != null ? ib2.f3161a : null)) {
            return false;
        }
        if (!ExpressionsKt.equalsToConstant(ib != null ? ib.f3162b : null, ib2 != null ? ib2.f3162b : null)) {
            return false;
        }
        if (ExpressionsKt.equalsToConstant(ib != null ? ib.f3163c : null, ib2 != null ? ib2.f3163c : null)) {
            return equalsToConstant(ib != null ? ib.f3164d : null, ib2 != null ? ib2.f3164d : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable C1081ua c1081ua, @Nullable C1081ua c1081ua2) {
        if (c1081ua == null && c1081ua2 == null) {
            return true;
        }
        if (equalsToConstant(c1081ua != null ? c1081ua.f8167a : null, c1081ua2 != null ? c1081ua2.f8167a : null)) {
            return equalsToConstant(c1081ua != null ? c1081ua.f8168b : null, c1081ua2 != null ? c1081ua2.f8168b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable J4 j4, @Nullable J4 j42) {
        if (j4 == null && j42 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(j4 != null ? j4.f3317a : null, j42 != null ? j42.f3317a : null)) {
            return ExpressionsKt.equalsToConstant(j4 != null ? j4.f3318b : null, j42 != null ? j42.f3318b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable X2 x22, @Nullable X2 x23) {
        if (x22 == null) {
            return x23 == null;
        }
        if (x22 instanceof X2.g) {
            return (x23 instanceof X2.g) && ExpressionsKt.equalsToConstant(((X2.g) x22).c().f8341a, ((X2.g) x23).c().f8341a);
        }
        if (x22 instanceof X2.c) {
            X2.c cVar = (X2.c) x22;
            List list = cVar.c().f4324d;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (x23 instanceof X2.c) {
                X2.c cVar2 = (X2.c) x23;
                if (ExpressionsKt.equalsToConstant(cVar.c().f4321a, cVar2.c().f4321a) && ExpressionsKt.equalsToConstant(cVar.c().f4322b, cVar2.c().f4322b) && ExpressionsKt.equalsToConstant(cVar.c().f4323c, cVar2.c().f4323c)) {
                    List list2 = cVar2.c().f4324d;
                    if (list2 == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    if (list.size() == list2.size()) {
                        Iterator it = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (!equalsToConstant((AbstractC1130x5) next, (AbstractC1130x5) list2.get(i4))) {
                                    break;
                                }
                                i4 = i5;
                            } else {
                                if (!ExpressionsKt.equalsToConstant(cVar.c().f4325e, cVar2.c().f4325e) || !ExpressionsKt.equalsToConstant(cVar.c().f4326f, cVar2.c().f4326f) || !ExpressionsKt.equalsToConstant(cVar.c().f4327g, cVar2.c().f4327g)) {
                                    break;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (x22 instanceof X2.d) {
            X2.d dVar = (X2.d) x22;
            List list3 = dVar.c().f1313b;
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            if (x23 instanceof X2.d) {
                X2.d dVar2 = (X2.d) x23;
                if (ExpressionsKt.equalsToConstant(dVar.c().f1312a, dVar2.c().f1312a) && ExpressionsKt.equalsToConstant(dVar.c().f1314c, dVar2.c().f1314c)) {
                    List list4 = dVar2.c().f1313b;
                    if (list4 == null) {
                        list4 = CollectionsKt.emptyList();
                    }
                    if (list3.size() == list4.size()) {
                        int i6 = 0;
                        for (Object obj : list3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (equalsToConstant((A8.a) obj, (A8.a) list4.get(i6))) {
                                i6 = i7;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        if (x22 instanceof X2.f) {
            if (x23 instanceof X2.f) {
                X2.f fVar = (X2.f) x22;
                X2.f fVar2 = (X2.f) x23;
                if (equalsToConstant(fVar.c().f8809a, fVar2.c().f8809a) && equalsToConstant(fVar.c().f8810b, fVar2.c().f8810b) && ExpressionsKt.equalsToConstant(fVar.c().f8812d, fVar2.c().f8812d) && equalsToConstant(fVar.c().f8813e, fVar2.c().f8813e)) {
                    return true;
                }
            }
            return false;
        }
        if (!(x22 instanceof X2.e)) {
            throw new m();
        }
        if (x23 instanceof X2.e) {
            X2.e eVar = (X2.e) x22;
            X2.e eVar2 = (X2.e) x23;
            if (ExpressionsKt.equalsToConstant(eVar.c().f4647a, eVar2.c().f4647a) && equalsToConstant(eVar.c().f4648b, eVar2.c().f4648b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable A8.a aVar) {
        if (aVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(aVar.f1318a) && ExpressionsKt.isConstant(aVar.f1319b);
    }

    public static final boolean isConstant(@Nullable Aa aa) {
        if (aa == null) {
            return true;
        }
        if (aa instanceof Aa.c) {
            Aa.c cVar = (Aa.c) aa;
            return ExpressionsKt.isConstant(cVar.c().f2989a) && ExpressionsKt.isConstant(cVar.c().f2990b);
        }
        if (aa instanceof Aa.d) {
            return ExpressionsKt.isConstant(((Aa.d) aa).c().f4787a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable Na na) {
        if (na == null) {
            return true;
        }
        if (na instanceof Na.c) {
            Na.c cVar = (Na.c) na;
            return ExpressionsKt.isConstant(cVar.c().f4714a) && ExpressionsKt.isConstant(cVar.c().f4715b);
        }
        if (na instanceof Na.d) {
            return ExpressionsKt.isConstant(((Na.d) na).c().f5269a);
        }
        throw new m();
    }

    public static final boolean isConstant(@Nullable C1060t7.f fVar) {
        if (fVar == null) {
            return true;
        }
        return ExpressionsKt.isConstant(fVar.f8100a);
    }

    public static final boolean equalsToConstant(@Nullable A8.a aVar, @Nullable A8.a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(aVar != null ? aVar.f1318a : null, aVar2 != null ? aVar2.f1318a : null)) {
            return ExpressionsKt.equalsToConstant(aVar != null ? aVar.f1319b : null, aVar2 != null ? aVar2.f1319b : null);
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable Aa aa, @Nullable Aa aa2) {
        if (aa == null) {
            return aa2 == null;
        }
        if (aa instanceof Aa.c) {
            if (aa2 instanceof Aa.c) {
                Aa.c cVar = (Aa.c) aa;
                Aa.c cVar2 = (Aa.c) aa2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f2989a, cVar2.c().f2989a) && ExpressionsKt.equalsToConstant(cVar.c().f2990b, cVar2.c().f2990b)) {
                    return true;
                }
            }
            return false;
        }
        if (aa instanceof Aa.d) {
            return (aa2 instanceof Aa.d) && ExpressionsKt.equalsToConstant(((Aa.d) aa).c().f4787a, ((Aa.d) aa2).c().f4787a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable Na na, @Nullable Na na2) {
        if (na == null) {
            return na2 == null;
        }
        if (na instanceof Na.c) {
            if (na2 instanceof Na.c) {
                Na.c cVar = (Na.c) na;
                Na.c cVar2 = (Na.c) na2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f4714a, cVar2.c().f4714a) && ExpressionsKt.equalsToConstant(cVar.c().f4715b, cVar2.c().f4715b)) {
                    return true;
                }
            }
            return false;
        }
        if (na instanceof Na.d) {
            return (na2 instanceof Na.d) && ExpressionsKt.equalsToConstant(((Na.d) na).c().f5269a, ((Na.d) na2).c().f5269a);
        }
        throw new m();
    }

    public static final boolean equalsToConstant(@Nullable C1060t7.f fVar, @Nullable C1060t7.f fVar2) {
        if (fVar == null && fVar2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(fVar != null ? fVar.f8100a : null, fVar2 != null ? fVar2.f8100a : null);
    }
}
