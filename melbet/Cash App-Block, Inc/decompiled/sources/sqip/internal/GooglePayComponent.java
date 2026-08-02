package sqip.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import sqip.internal.nonce.CreateNonceCall;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lsqip/internal/GooglePayComponent;", "", "createNonceCallFactory", "Lsqip/internal/nonce/CreateNonceCall$Factory;", "Companion", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface GooglePayComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lsqip/internal/GooglePayComponent$Companion;", "", "()V", "instance", "Lsqip/internal/GooglePayComponent;", "getInstance", "()Lsqip/internal/GooglePayComponent;", "instance$delegate", "Lkotlin/Lazy;", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: instance$delegate, reason: from kotlin metadata */
        private static final Lazy<GooglePayComponent> instance = LazyKt.lazy(new Function0<GooglePayComponent>() { // from class: sqip.internal.GooglePayComponent$Companion$instance$2
            @Override // kotlin.jvm.functions.Function0
            public final GooglePayComponent invoke() {
                return DaggerGooglePayComponent.builder().build();
            }
        });

        private Companion() {
        }

        public final GooglePayComponent getInstance() {
            GooglePayComponent value = instance.getValue();
            value.getClass();
            return value;
        }
    }

    CreateNonceCall.Factory createNonceCallFactory();
}
