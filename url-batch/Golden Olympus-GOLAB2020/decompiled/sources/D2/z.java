package D2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h(with = A.class)
@Metadata
/* loaded from: classes3.dex */
public abstract class z extends i {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return A.f369a;
        }

        private a() {
        }
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String e();

    public String toString() {
        return e();
    }

    private z() {
        super(null);
    }
}
