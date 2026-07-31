package androidx.fragment.app;

import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class E {

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Fragment f12267i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f12267i = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Y.b invoke() {
            Y.b defaultViewModelProviderFactory = this.f12267i.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final W1.h a(Fragment fragment, m2.c viewModelClass, Function0 storeProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        if (function0 == null) {
            function0 = new a(fragment);
        }
        return new X(viewModelClass, storeProducer, function0);
    }
}
