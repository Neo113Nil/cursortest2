package androidx.lifecycle;

import a0.AbstractC1237a;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d0 {

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f12638i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View currentView) {
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f12639i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1354u invoke(View viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(AbstractC1237a.f9754a);
            if (tag instanceof InterfaceC1354u) {
                return (InterfaceC1354u) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1354u a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC1354u) kotlin.sequences.k.s(kotlin.sequences.k.z(kotlin.sequences.k.h(view, a.f12638i), b.f12639i));
    }

    public static final void b(View view, InterfaceC1354u interfaceC1354u) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(AbstractC1237a.f9754a, interfaceC1354u);
    }
}
