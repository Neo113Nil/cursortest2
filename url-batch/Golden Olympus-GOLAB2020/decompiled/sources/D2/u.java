package D2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h(with = v.class)
@Metadata
/* loaded from: classes3.dex */
public final class u extends z {

    @NotNull
    public static final u INSTANCE = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final String f422b = "null";

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ W1.h f423c = W1.i.a(W1.l.f9607c, a.f424i);

    static final class a extends kotlin.jvm.internal.s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f424i = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b invoke() {
            return v.f425a;
        }
    }

    private u() {
        super(null);
    }

    private final /* synthetic */ InterfaceC3527b f() {
        return (InterfaceC3527b) f423c.getValue();
    }

    @Override // D2.z
    public String e() {
        return f422b;
    }

    @NotNull
    public final InterfaceC3527b serializer() {
        return f();
    }
}
