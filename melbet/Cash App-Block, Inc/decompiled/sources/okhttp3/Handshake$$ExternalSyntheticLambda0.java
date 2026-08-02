package okhttp3;

import com.braze.support.BrazeLogger;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class Handshake$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ Handshake$$ExternalSyntheticLambda0(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String brazelog$lambda$0;
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
            case 1:
                function0.invoke();
                return Unit.INSTANCE;
            case 2:
                brazelog$lambda$0 = BrazeLogger.brazelog$lambda$0(function0);
                return brazelog$lambda$0;
            default:
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
