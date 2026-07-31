package androidx.lifecycle;

import androidx.lifecycle.Y;
import b0.AbstractC1367a;
import g2.AbstractC2429a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X implements W1.h {

    /* renamed from: b, reason: collision with root package name */
    private final m2.c f12608b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f12609c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f12610d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f12611e;

    /* renamed from: f, reason: collision with root package name */
    private V f12612f;

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f12613i = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC1367a.C0126a invoke() {
            return AbstractC1367a.C0126a.f13298b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X(m2.c viewModelClass, Function0 storeProducer, Function0 factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // W1.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public V getValue() {
        V v4 = this.f12612f;
        if (v4 != null) {
            return v4;
        }
        V a4 = new Y((b0) this.f12609c.invoke(), (Y.b) this.f12610d.invoke(), (AbstractC1367a) this.f12611e.invoke()).a(AbstractC2429a.a(this.f12608b));
        this.f12612f = a4;
        return a4;
    }

    public X(m2.c viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f12608b = viewModelClass;
        this.f12609c = storeProducer;
        this.f12610d = factoryProducer;
        this.f12611e = extrasProducer;
    }

    public /* synthetic */ X(m2.c cVar, Function0 function0, Function0 function02, Function0 function03, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, function0, function02, (i4 & 8) != 0 ? a.f12613i : function03);
    }
}
