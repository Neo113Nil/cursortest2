package defpackage;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class kx implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$2;
        Object lambda$intoSet$4;
        Object lambda$intoSet$3;
        Object lambda$of$0;
        Object lambda$of$1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lambda$of$2 = Component.lambda$of$2(obj, componentContainer);
                return lambda$of$2;
            case 1:
                lambda$intoSet$4 = Component.lambda$intoSet$4(obj, componentContainer);
                return lambda$intoSet$4;
            case 2:
                lambda$intoSet$3 = Component.lambda$intoSet$3(obj, componentContainer);
                return lambda$intoSet$3;
            case 3:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
            default:
                lambda$of$1 = Component.lambda$of$1(obj, componentContainer);
                return lambda$of$1;
        }
    }
}
