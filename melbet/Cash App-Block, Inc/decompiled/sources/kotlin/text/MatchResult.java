package kotlin.text;

import androidx.compose.ui.text.input.OffsetMapping;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import dev.chrisbanes.haze.Pool;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RoutePlanner$ConnectResult;
import okhttp3.internal.connection.RoutePlanner$Plan;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.CompletableFutureCallAdapterFactory;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/MatchResult;", "", "Destructured", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MatchResult {

    /* loaded from: classes9.dex */
    public final class Destructured implements CardAccountRangeSource, OffsetMapping, Function, ExchangeFinder, CallAdapter {
        public Object match;

        public /* synthetic */ Destructured(Object obj) {
            this.match = obj;
        }

        @Override // retrofit2.CallAdapter
        public Object adapt(Call call) {
            CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = new CompletableFutureCallAdapterFactory.CallCancelCompletableFuture(call);
            call.enqueue(new Pool(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }

        @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
        /* renamed from: apply */
        public Object mo39apply(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return ((BiFunction) this.match).apply(objArr[0], objArr[1]);
            }
            a$$ExternalSyntheticBUOutline0.m(objArr.length, "Array of size 2 expected but got ");
            return null;
        }

        @Override // okhttp3.internal.connection.ExchangeFinder
        public RealConnection find() {
            RoutePlanner$Plan plan;
            IOException iOException = null;
            while (!((RealRoutePlanner) this.match).call.canceled) {
                try {
                    plan = ((RealRoutePlanner) this.match).plan();
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        ExceptionsKt__ExceptionsKt.addSuppressed(iOException, e);
                    }
                    if (!((RealRoutePlanner) this.match).hasNext(null)) {
                        throw iOException;
                    }
                }
                if (!plan.isReady()) {
                    RoutePlanner$ConnectResult connectTcp = plan.connectTcp();
                    if (connectTcp.nextPlan == null && connectTcp.throwable == null) {
                        connectTcp = plan.connectTlsEtc();
                    }
                    RoutePlanner$Plan routePlanner$Plan = connectTcp.nextPlan;
                    Throwable th = connectTcp.throwable;
                    if (th != null) {
                        throw th;
                    }
                    if (routePlanner$Plan != null) {
                        ((RealRoutePlanner) this.match).deferredPlans.addFirst(routePlanner$Plan);
                    }
                }
                return plan.handleSuccess();
            }
            a$$ExternalSyntheticBUOutline0.m$4("Canceled");
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public ReadonlyStateFlow getLoading() {
            return (ReadonlyStateFlow) this.match;
        }

        public MatchResult getMatch() {
            return (MatcherMatchResult) this.match;
        }

        @Override // okhttp3.internal.connection.ExchangeFinder
        public RealRoutePlanner getRoutePlanner() {
            return (RealRoutePlanner) this.match;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i) {
            String str = ((PhoneNumberFormatter.WithRegion) this.match).metadata.pattern;
            if (str == null) {
                return i;
            }
            if (i == 0) {
                return 0;
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            for (int i5 = 0; i5 < str.length(); i5++) {
                i2++;
                if (str.charAt(i5) == '#' && (i3 = i3 + 1) == i) {
                    i4 = i2;
                }
            }
            return i4 == -1 ? (i - i3) + str.length() + 1 : i4;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return (Type) this.match;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i) {
            String str = ((PhoneNumberFormatter.WithRegion) this.match).metadata.pattern;
            if (str == null) {
                return i;
            }
            if (i == 0) {
                return 0;
            }
            String substring = str.substring(0, Math.min(i, str.length()));
            StringBuilder sb = new StringBuilder();
            int length = substring.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = substring.charAt(i2);
                if (charAt != '#') {
                    sb.append(charAt);
                }
            }
            int length2 = sb.toString().length();
            if (i > str.length()) {
                length2++;
            }
            return i - length2;
        }
    }

    Destructured getDestructured();

    List getGroupValues();

    MatcherMatchResult$groups$1 getGroups();

    IntRange getRange();

    String getValue();

    MatcherMatchResult next();
}
