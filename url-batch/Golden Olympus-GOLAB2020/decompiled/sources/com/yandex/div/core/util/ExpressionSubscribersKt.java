package com.yandex.div.core.util;

import O1.A3;
import O1.A8;
import O1.Aa;
import O1.AbstractC0849ha;
import O1.AbstractC1130x5;
import O1.C0713a0;
import O1.C0742bb;
import O1.C0754c5;
import O1.C0765cg;
import O1.C0867ia;
import O1.C0925lf;
import O1.C1171za;
import O1.Na;
import O1.Nb;
import O1.Ob;
import O1.P6;
import O1.Qc;
import O1.R8;
import O1.S5;
import O1.X2;
import O1.X4;
import O1.Yb;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ExpressionSubscribersKt {
    public static final void observeAbsoluteEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable C0713a0 c0713a0, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (c0713a0 == null) {
            return;
        }
        expressionSubscriber.addSubscription(c0713a0.f5581b.observe(resolver, callback));
        expressionSubscriber.addSubscription(c0713a0.f5583d.observe(resolver, callback));
        expressionSubscriber.addSubscription(c0713a0.f5582c.observe(resolver, callback));
        expressionSubscriber.addSubscription(c0713a0.f5580a.observe(resolver, callback));
    }

    public static final void observeBackground(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable X2 x22, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (x22 != null) {
            if (x22 instanceof X2.g) {
                expressionSubscriber.addSubscription(((X2.g) x22).c().f8341a.observe(resolver, callback));
                return;
            }
            if (x22 instanceof X2.c) {
                P6 c4 = ((X2.c) x22).c();
                expressionSubscriber.addSubscription(c4.f4321a.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4325e.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4322b.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4323c.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4326f.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4327g.observe(resolver, callback));
                List list = c4.f4324d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        observeFilter(expressionSubscriber, (AbstractC1130x5) it.next(), resolver, callback);
                    }
                    return;
                }
                return;
            }
            if (x22 instanceof X2.d) {
                A8 c5 = ((X2.d) x22).c();
                expressionSubscriber.addSubscription(c5.f1312a.observe(resolver, callback));
                ExpressionList expressionList = c5.f1314c;
                expressionSubscriber.addSubscription(expressionList != null ? expressionList.observe(resolver, callback) : null);
                List list2 = c5.f1313b;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        observeColorPoint(expressionSubscriber, (A8.a) it2.next(), resolver, callback);
                    }
                    return;
                }
                return;
            }
            if (!(x22 instanceof X2.f)) {
                if (x22 instanceof X2.e) {
                    R8 c6 = ((X2.e) x22).c();
                    expressionSubscriber.addSubscription(c6.f4647a.observe(resolver, callback));
                    observeAbsoluteEdgeInsets(expressionSubscriber, c6.f4648b, resolver, callback);
                    return;
                }
                return;
            }
            C1171za c7 = ((X2.f) x22).c();
            ExpressionList expressionList2 = c7.f8812d;
            expressionSubscriber.addSubscription(expressionList2 != null ? expressionList2.observe(resolver, callback) : null);
            observeRadialGradientCenter(expressionSubscriber, c7.f8809a, resolver, callback);
            observeRadialGradientCenter(expressionSubscriber, c7.f8810b, resolver, callback);
            observeRadialGradientRadius(expressionSubscriber, c7.f8813e, resolver, callback);
        }
    }

    public static final void observeCircleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable A3 a32, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (a32 == null) {
            return;
        }
        Expression expression = a32.f1302a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(resolver, callback) : null);
        observeFixedSize(expressionSubscriber, a32.f1303b, resolver, callback);
        observeStroke(expressionSubscriber, a32.f1304c, resolver, callback);
    }

    public static final void observeColorPoint(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable A8.a aVar, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (aVar == null) {
            return;
        }
        expressionSubscriber.addSubscription(aVar.f1318a.observe(resolver, callback));
        expressionSubscriber.addSubscription(aVar.f1319b.observe(resolver, callback));
    }

    public static final void observeDrawable(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable X4 x4, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (x4 == null || !(x4 instanceof X4.c)) {
            return;
        }
        Ob c4 = ((X4.c) x4).c();
        expressionSubscriber.addSubscription(c4.f4273a.observe(resolver, callback));
        observeShape(expressionSubscriber, c4.f4274b, resolver, callback);
        observeStroke(expressionSubscriber, c4.f4275c, resolver, callback);
    }

    public static final void observeEdgeInsets(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable C0754c5 c0754c5, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (c0754c5 == null) {
            return;
        }
        expressionSubscriber.addSubscription(c0754c5.f5855f.observe(resolver, callback));
        expressionSubscriber.addSubscription(c0754c5.f5850a.observe(resolver, callback));
        Expression expression = c0754c5.f5854e;
        if (expression == null && c0754c5.f5851b == null) {
            expressionSubscriber.addSubscription(c0754c5.f5852c.observe(resolver, callback));
            expressionSubscriber.addSubscription(c0754c5.f5853d.observe(resolver, callback));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(resolver, callback) : null);
            Expression expression2 = c0754c5.f5851b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(resolver, callback) : null);
        }
    }

    public static final void observeFilter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable AbstractC1130x5 abstractC1130x5, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (abstractC1130x5 == null || (abstractC1130x5 instanceof AbstractC1130x5.d) || !(abstractC1130x5 instanceof AbstractC1130x5.a)) {
            return;
        }
        expressionSubscriber.addSubscription(((AbstractC1130x5.a) abstractC1130x5).c().f6074a.observe(resolver, callback));
    }

    public static final void observeFixedSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable S5 s5, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (s5 == null) {
            return;
        }
        expressionSubscriber.addSubscription(s5.f4715b.observe(resolver, callback));
        expressionSubscriber.addSubscription(s5.f4714a.observe(resolver, callback));
    }

    public static final void observePivot(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable AbstractC0849ha abstractC0849ha, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (abstractC0849ha != null) {
            if (!(abstractC0849ha instanceof AbstractC0849ha.c)) {
                if (abstractC0849ha instanceof AbstractC0849ha.d) {
                    expressionSubscriber.addSubscription(((AbstractC0849ha.d) abstractC0849ha).c().f7367a.observe(resolver, callback));
                }
            } else {
                C0867ia c4 = ((AbstractC0849ha.c) abstractC0849ha).c();
                Expression expression = c4.f6483b;
                expressionSubscriber.addSubscription(expression != null ? expression.observe(resolver, callback) : null);
                expressionSubscriber.addSubscription(c4.f6482a.observe(resolver, callback));
            }
        }
    }

    public static final void observeRadialGradientCenter(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable Aa aa, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (aa != null) {
            if (aa instanceof Aa.c) {
                Aa.c cVar = (Aa.c) aa;
                expressionSubscriber.addSubscription(cVar.c().f2989a.observe(resolver, callback));
                expressionSubscriber.addSubscription(cVar.c().f2990b.observe(resolver, callback));
            } else if (aa instanceof Aa.d) {
                expressionSubscriber.addSubscription(((Aa.d) aa).c().f4787a.observe(resolver, callback));
            }
        }
    }

    public static final void observeRadialGradientRadius(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable Na na, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (na != null) {
            if (na instanceof Na.c) {
                Na.c cVar = (Na.c) na;
                expressionSubscriber.addSubscription(cVar.c().f4714a.observe(resolver, callback));
                expressionSubscriber.addSubscription(cVar.c().f4715b.observe(resolver, callback));
            } else if (na instanceof Na.d) {
                expressionSubscriber.addSubscription(((Na.d) na).c().f5269a.observe(resolver, callback));
            }
        }
    }

    public static final void observeRoundedRectangleShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable C0742bb c0742bb, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (c0742bb == null) {
            return;
        }
        Expression expression = c0742bb.f5808a;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(resolver, callback) : null);
        observeFixedSize(expressionSubscriber, c0742bb.f5809b, resolver, callback);
        observeFixedSize(expressionSubscriber, c0742bb.f5811d, resolver, callback);
        observeFixedSize(expressionSubscriber, c0742bb.f5810c, resolver, callback);
        observeStroke(expressionSubscriber, c0742bb.f5812e, resolver, callback);
    }

    public static final void observeShape(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable Nb nb, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (nb != null) {
            if (nb instanceof Nb.d) {
                observeRoundedRectangleShape(expressionSubscriber, ((Nb.d) nb).c(), resolver, callback);
            } else if (nb instanceof Nb.a) {
                observeCircleShape(expressionSubscriber, ((Nb.a) nb).c(), resolver, callback);
            }
        }
    }

    public static final void observeSize(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable Yb yb, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (yb != null) {
            if (yb instanceof Yb.c) {
                S5 c4 = ((Yb.c) yb).c();
                expressionSubscriber.addSubscription(c4.f4715b.observe(resolver, callback));
                expressionSubscriber.addSubscription(c4.f4714a.observe(resolver, callback));
                return;
            }
            if (yb instanceof Yb.d) {
                Expression expression5 = ((Yb.d) yb).c().f3146a;
                expressionSubscriber.addSubscription(expression5 != null ? expression5.observe(resolver, callback) : null);
                return;
            }
            if (yb instanceof Yb.e) {
                C0765cg c5 = ((Yb.e) yb).c();
                Expression expression6 = c5.f5970a;
                expressionSubscriber.addSubscription(expression6 != null ? expression6.observe(resolver, callback) : null);
                C0765cg.c cVar = c5.f5972c;
                expressionSubscriber.addSubscription((cVar == null || (expression4 = cVar.f5979b) == null) ? null : expression4.observe(resolver, callback));
                C0765cg.c cVar2 = c5.f5972c;
                expressionSubscriber.addSubscription((cVar2 == null || (expression3 = cVar2.f5978a) == null) ? null : expression3.observe(resolver, callback));
                C0765cg.c cVar3 = c5.f5971b;
                expressionSubscriber.addSubscription((cVar3 == null || (expression2 = cVar3.f5979b) == null) ? null : expression2.observe(resolver, callback));
                C0765cg.c cVar4 = c5.f5971b;
                if (cVar4 != null && (expression = cVar4.f5978a) != null) {
                    r1 = expression.observe(resolver, callback);
                }
                expressionSubscriber.addSubscription(r1);
            }
        }
    }

    public static final void observeStroke(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable Qc qc, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (qc == null) {
            return;
        }
        expressionSubscriber.addSubscription(qc.f4476a.observe(resolver, callback));
        expressionSubscriber.addSubscription(qc.f4479d.observe(resolver, callback));
        expressionSubscriber.addSubscription(qc.f4478c.observe(resolver, callback));
    }

    public static final void observeTransform(@NotNull ExpressionSubscriber expressionSubscriber, @Nullable C0925lf c0925lf, @NotNull ExpressionResolver resolver, @NotNull Function1<Object, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionSubscriber, "<this>");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (c0925lf == null) {
            return;
        }
        Expression expression = c0925lf.f6956c;
        expressionSubscriber.addSubscription(expression != null ? expression.observe(resolver, callback) : null);
        observePivot(expressionSubscriber, c0925lf.f6954a, resolver, callback);
        observePivot(expressionSubscriber, c0925lf.f6955b, resolver, callback);
    }
}
