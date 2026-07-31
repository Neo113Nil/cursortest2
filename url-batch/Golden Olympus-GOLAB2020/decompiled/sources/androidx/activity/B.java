package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class B {

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f9836i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f9837i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(z.f9923b);
            if (tag instanceof y) {
                return (y) tag;
            }
            return null;
        }
    }

    public static final y a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (y) kotlin.sequences.k.s(kotlin.sequences.k.z(kotlin.sequences.k.h(view, a.f9836i), b.f9837i));
    }

    public static final void b(View view, y onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(z.f9923b, onBackPressedDispatcherOwner);
    }
}
