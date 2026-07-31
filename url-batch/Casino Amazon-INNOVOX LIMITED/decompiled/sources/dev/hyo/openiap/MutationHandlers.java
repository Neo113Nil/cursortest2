package dev.hyo.openiap;

import androidx.sqlite.driver.bundled.BundledSQLite;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008c\u000b\u0012;\b\u0002\u0010\u0002\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\n\u0012=\b\u0002\u0010\u000b\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\r\u0012&\b\u0002\u0010\u000e\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012&\b\u0002\u0010\u0011\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012\u0012;\b\u0002\u0010\u0013\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0014\u0012(\b\u0002\u0010\u0015\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0016\u0012;\b\u0002\u0010\u0017\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b\u0012=\b\u0002\u0010\u001c\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001` \u0012&\b\u0002\u0010!\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\"\u0012e\b\u0002\u0010#\u001a_\b\u0001\u0012&\u0012$0%j\u0011`'¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$j\u0004\u0018\u0001`)\u0012=\b\u0002\u0010*\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`-\u0012;\b\u0002\u0010.\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0\u0012;\b\u0002\u00101\u001a5\b\u0001\u0012\u0013\u0012\u001102¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`4\u0012&\b\u0002\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`6\u0012;\b\u0002\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`:\u0012&\b\u0002\u0010;\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`=\u0012=\b\u0002\u0010>\u001a7\b\u0001\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010@0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`A\u0012&\b\u0002\u0010B\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`C\u0012&\b\u0002\u0010D\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`E\u0012&\b\u0002\u0010F\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`G\u0012;\b\u0002\u0010H\u001a5\b\u0001\u0012\u0013\u0012\u00110I¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`L\u0012,\b\u0002\u0010M\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`P\u0012&\b\u0002\u0010Q\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`R\u0012;\b\u0002\u0010S\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`V\u0012;\b\u0002\u0010W\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`X\u0012;\b\u0002\u0010Y\u001a5\b\u0001\u0012\u0013\u0012\u00110Z¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\\¢\u0006\u0004\b]\u0010^JA\u0010~\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010`JC\u0010\u007f\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\rHÆ\u0003¢\u0006\u0002\u0010`J-\u0010\u0080\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0003¢\u0006\u0002\u0010dJ-\u0010\u0081\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012HÆ\u0003¢\u0006\u0002\u0010dJB\u0010\u0082\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0014HÆ\u0003¢\u0006\u0002\u0010`J/\u0010\u0083\u0001\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0016HÆ\u0003¢\u0006\u0002\u0010dJB\u0010\u0084\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001bHÆ\u0003¢\u0006\u0002\u0010`JD\u0010\u0085\u0001\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001` HÆ\u0003¢\u0006\u0002\u0010`J-\u0010\u0086\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\"HÆ\u0003¢\u0006\u0002\u0010dJl\u0010\u0087\u0001\u001a_\b\u0001\u0012&\u0012$0%j\u0011`'¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$j\u0004\u0018\u0001`)HÆ\u0003¢\u0006\u0002\u0010mJD\u0010\u0088\u0001\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`-HÆ\u0003¢\u0006\u0002\u0010`JB\u0010\u0089\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0HÆ\u0003¢\u0006\u0002\u0010`JB\u0010\u008a\u0001\u001a5\b\u0001\u0012\u0013\u0012\u001102¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`4HÆ\u0003¢\u0006\u0002\u0010`J-\u0010\u008b\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`6HÆ\u0003¢\u0006\u0002\u0010dJB\u0010\u008c\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`:HÆ\u0003¢\u0006\u0002\u0010`J-\u0010\u008d\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`=HÆ\u0003¢\u0006\u0002\u0010dJD\u0010\u008e\u0001\u001a7\b\u0001\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010@0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`AHÆ\u0003¢\u0006\u0002\u0010`J-\u0010\u008f\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`CHÆ\u0003¢\u0006\u0002\u0010dJ-\u0010\u0090\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`EHÆ\u0003¢\u0006\u0002\u0010dJ-\u0010\u0091\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`GHÆ\u0003¢\u0006\u0002\u0010dJB\u0010\u0092\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110I¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`LHÆ\u0003¢\u0006\u0002\u0010`J3\u0010\u0093\u0001\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`PHÆ\u0003¢\u0006\u0002\u0010dJ-\u0010\u0094\u0001\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`RHÆ\u0003¢\u0006\u0002\u0010dJB\u0010\u0095\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`VHÆ\u0003¢\u0006\u0002\u0010`JB\u0010\u0096\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`XHÆ\u0003¢\u0006\u0002\u0010`JB\u0010\u0097\u0001\u001a5\b\u0001\u0012\u0013\u0012\u00110Z¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\\HÆ\u0003¢\u0006\u0002\u0010`J\u0095\u000b\u0010\u0098\u0001\u001a\u00020\u00002;\b\u0002\u0010\u0002\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\n2=\b\u0002\u0010\u000b\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\r2&\b\u0002\u0010\u000e\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102&\b\u0002\u0010\u0011\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00122;\b\u0002\u0010\u0013\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u00142(\b\u0002\u0010\u0015\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u00162;\b\u0002\u0010\u0017\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b2=\b\u0002\u0010\u001c\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001` 2&\b\u0002\u0010!\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\"2e\b\u0002\u0010#\u001a_\b\u0001\u0012&\u0012$0%j\u0011`'¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$j\u0004\u0018\u0001`)2=\b\u0002\u0010*\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`-2;\b\u0002\u0010.\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`02;\b\u0002\u00101\u001a5\b\u0001\u0012\u0013\u0012\u001102¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`42&\b\u0002\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`62;\b\u0002\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`:2&\b\u0002\u0010;\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`=2=\b\u0002\u0010>\u001a7\b\u0001\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010@0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`A2&\b\u0002\u0010B\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`C2&\b\u0002\u0010D\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`E2&\b\u0002\u0010F\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`G2;\b\u0002\u0010H\u001a5\b\u0001\u0012\u0013\u0012\u00110I¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`L2,\b\u0002\u0010M\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`P2&\b\u0002\u0010Q\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`R2;\b\u0002\u0010S\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`V2;\b\u0002\u0010W\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`X2;\b\u0002\u0010Y\u001a5\b\u0001\u0012\u0013\u0012\u00110Z¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\\HÆ\u0001¢\u0006\u0003\u0010\u0099\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\t2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u009c\u0001\u001a\u00030\u009d\u0001HÖ\u0001J\n\u0010\u009e\u0001\u001a\u00020\u0004HÖ\u0001RF\u0010\u0002\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\n¢\u0006\n\n\u0002\u0010a\u001a\u0004\b_\u0010`RH\u0010\u000b\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\r¢\u0006\n\n\u0002\u0010a\u001a\u0004\bb\u0010`R1\u0010\u000e\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\n\n\u0002\u0010e\u001a\u0004\bc\u0010dR1\u0010\u0011\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0012¢\u0006\n\n\u0002\u0010e\u001a\u0004\bf\u0010dRF\u0010\u0013\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0014¢\u0006\n\n\u0002\u0010a\u001a\u0004\bg\u0010`R3\u0010\u0015\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0016¢\u0006\n\n\u0002\u0010e\u001a\u0004\bh\u0010dRF\u0010\u0017\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b¢\u0006\n\n\u0002\u0010a\u001a\u0004\bi\u0010`RH\u0010\u001c\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001` ¢\u0006\n\n\u0002\u0010a\u001a\u0004\bj\u0010`R1\u0010!\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\"¢\u0006\n\n\u0002\u0010e\u001a\u0004\bk\u0010dRp\u0010#\u001a_\b\u0001\u0012&\u0012$0%j\u0011`'¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$j\u0004\u0018\u0001`)¢\u0006\n\n\u0002\u0010n\u001a\u0004\bl\u0010mRH\u0010*\u001a7\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`-¢\u0006\n\n\u0002\u0010a\u001a\u0004\bo\u0010`RF\u0010.\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0¢\u0006\n\n\u0002\u0010a\u001a\u0004\b.\u0010`RF\u00101\u001a5\b\u0001\u0012\u0013\u0012\u001102¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`4¢\u0006\n\n\u0002\u0010a\u001a\u0004\bp\u0010`R1\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`6¢\u0006\n\n\u0002\u0010e\u001a\u0004\bq\u0010dRF\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`:¢\u0006\n\n\u0002\u0010a\u001a\u0004\br\u0010`R1\u0010;\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`=¢\u0006\n\n\u0002\u0010e\u001a\u0004\bs\u0010dRH\u0010>\u001a7\b\u0001\u0012\u0013\u0012\u00110?¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(3\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010@0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`A¢\u0006\n\n\u0002\u0010a\u001a\u0004\bt\u0010`R1\u0010B\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`C¢\u0006\n\n\u0002\u0010e\u001a\u0004\bu\u0010dR1\u0010D\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`E¢\u0006\n\n\u0002\u0010e\u001a\u0004\bv\u0010dR1\u0010F\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`G¢\u0006\n\n\u0002\u0010e\u001a\u0004\bw\u0010dRF\u0010H\u001a5\b\u0001\u0012\u0013\u0012\u00110I¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(J\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`L¢\u0006\n\n\u0002\u0010a\u001a\u0004\bx\u0010`R7\u0010M\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`P¢\u0006\n\n\u0002\u0010e\u001a\u0004\by\u0010dR1\u0010Q\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`R¢\u0006\n\n\u0002\u0010e\u001a\u0004\bz\u0010dRF\u0010S\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`V¢\u0006\n\n\u0002\u0010a\u001a\u0004\b{\u0010`RF\u0010W\u001a5\b\u0001\u0012\u0013\u0012\u00110T¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`X¢\u0006\n\n\u0002\u0010a\u001a\u0004\b|\u0010`RF\u0010Y\u001a5\b\u0001\u0012\u0013\u0012\u00110Z¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\\¢\u0006\n\n\u0002\u0010a\u001a\u0004\b}\u0010`¨\u0006\u009f\u0001"}, d2 = {"Ldev/hyo/openiap/MutationHandlers;", "", "acknowledgePurchaseAndroid", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "purchaseToken", "Lkotlin/coroutines/Continuation;", "", "Ldev/hyo/openiap/MutationAcknowledgePurchaseAndroidHandler;", "beginRefundRequestIOS", "sku", "Ldev/hyo/openiap/MutationBeginRefundRequestIOSHandler;", "checkAlternativeBillingAvailabilityAndroid", "Lkotlin/Function1;", "Ldev/hyo/openiap/MutationCheckAlternativeBillingAvailabilityAndroidHandler;", "clearTransactionIOS", "Ldev/hyo/openiap/MutationClearTransactionIOSHandler;", "consumePurchaseAndroid", "Ldev/hyo/openiap/MutationConsumePurchaseAndroidHandler;", "createAlternativeBillingTokenAndroid", "Ldev/hyo/openiap/MutationCreateAlternativeBillingTokenAndroidHandler;", "createBillingProgramReportingDetailsAndroid", "Ldev/hyo/openiap/BillingProgramAndroid;", "program", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "Ldev/hyo/openiap/MutationCreateBillingProgramReportingDetailsAndroidHandler;", "deepLinkToSubscriptions", "Ldev/hyo/openiap/DeepLinkOptions;", "options", "", "Ldev/hyo/openiap/MutationDeepLinkToSubscriptionsHandler;", "endConnection", "Ldev/hyo/openiap/MutationEndConnectionHandler;", "finishTransaction", "Lkotlin/Function3;", "Ldev/hyo/openiap/Purchase;", "purchase", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", "Ldev/hyo/openiap/MutationFinishTransactionHandler;", "initConnection", "Ldev/hyo/openiap/InitConnectionConfig;", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Ldev/hyo/openiap/MutationInitConnectionHandler;", "isBillingProgramAvailableAndroid", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "Ldev/hyo/openiap/MutationIsBillingProgramAvailableAndroidHandler;", "launchExternalLinkAndroid", "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/MutationLaunchExternalLinkAndroidHandler;", "presentCodeRedemptionSheetIOS", "Ldev/hyo/openiap/MutationPresentCodeRedemptionSheetIOSHandler;", "presentExternalPurchaseLinkIOS", ImagesContract.URL, "Ldev/hyo/openiap/ExternalPurchaseLinkResultIOS;", "Ldev/hyo/openiap/MutationPresentExternalPurchaseLinkIOSHandler;", "presentExternalPurchaseNoticeSheetIOS", "Ldev/hyo/openiap/ExternalPurchaseNoticeResultIOS;", "Ldev/hyo/openiap/MutationPresentExternalPurchaseNoticeSheetIOSHandler;", "requestPurchase", "Ldev/hyo/openiap/RequestPurchaseProps;", "Ldev/hyo/openiap/RequestPurchaseResult;", "Ldev/hyo/openiap/MutationRequestPurchaseHandler;", "requestPurchaseOnPromotedProductIOS", "Ldev/hyo/openiap/MutationRequestPurchaseOnPromotedProductIOSHandler;", "restorePurchases", "Ldev/hyo/openiap/MutationRestorePurchasesHandler;", "showAlternativeBillingDialogAndroid", "Ldev/hyo/openiap/MutationShowAlternativeBillingDialogAndroidHandler;", "showExternalPurchaseCustomLinkNoticeIOS", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeTypeIOS;", "noticeType", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkNoticeResultIOS;", "Ldev/hyo/openiap/MutationShowExternalPurchaseCustomLinkNoticeIOSHandler;", "showManageSubscriptionsIOS", "", "Ldev/hyo/openiap/PurchaseIOS;", "Ldev/hyo/openiap/MutationShowManageSubscriptionsIOSHandler;", "syncIOS", "Ldev/hyo/openiap/MutationSyncIOSHandler;", "validateReceipt", "Ldev/hyo/openiap/VerifyPurchaseProps;", "Ldev/hyo/openiap/VerifyPurchaseResult;", "Ldev/hyo/openiap/MutationValidateReceiptHandler;", "verifyPurchase", "Ldev/hyo/openiap/MutationVerifyPurchaseHandler;", "verifyPurchaseWithProvider", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "Ldev/hyo/openiap/MutationVerifyPurchaseWithProviderHandler;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getAcknowledgePurchaseAndroid", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getBeginRefundRequestIOS", "getCheckAlternativeBillingAvailabilityAndroid", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getClearTransactionIOS", "getConsumePurchaseAndroid", "getCreateAlternativeBillingTokenAndroid", "getCreateBillingProgramReportingDetailsAndroid", "getDeepLinkToSubscriptions", "getEndConnection", "getFinishTransaction", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "getInitConnection", "getLaunchExternalLinkAndroid", "getPresentCodeRedemptionSheetIOS", "getPresentExternalPurchaseLinkIOS", "getPresentExternalPurchaseNoticeSheetIOS", "getRequestPurchase", "getRequestPurchaseOnPromotedProductIOS", "getRestorePurchases", "getShowAlternativeBillingDialogAndroid", "getShowExternalPurchaseCustomLinkNoticeIOS", "getShowManageSubscriptionsIOS", "getSyncIOS", "getValidateReceipt", "getVerifyPurchase", "getVerifyPurchaseWithProvider", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Ldev/hyo/openiap/MutationHandlers;", "equals", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MutationHandlers {
    public static final int $stable = 8;
    private final Function2<String, Continuation<? super Boolean>, Object> acknowledgePurchaseAndroid;
    private final Function2<String, Continuation<? super String>, Object> beginRefundRequestIOS;
    private final Function1<Continuation<? super Boolean>, Object> checkAlternativeBillingAvailabilityAndroid;
    private final Function1<Continuation<? super Boolean>, Object> clearTransactionIOS;
    private final Function2<String, Continuation<? super Boolean>, Object> consumePurchaseAndroid;
    private final Function1<Continuation<? super String>, Object> createAlternativeBillingTokenAndroid;
    private final Function2<BillingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid>, Object> createBillingProgramReportingDetailsAndroid;
    private final Function2<DeepLinkOptions, Continuation<? super Unit>, Object> deepLinkToSubscriptions;
    private final Function1<Continuation<? super Boolean>, Object> endConnection;
    private final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> finishTransaction;
    private final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> initConnection;
    private final Function2<BillingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid>, Object> isBillingProgramAvailableAndroid;
    private final Function2<LaunchExternalLinkParamsAndroid, Continuation<? super Boolean>, Object> launchExternalLinkAndroid;
    private final Function1<Continuation<? super Boolean>, Object> presentCodeRedemptionSheetIOS;
    private final Function2<String, Continuation<? super ExternalPurchaseLinkResultIOS>, Object> presentExternalPurchaseLinkIOS;
    private final Function1<Continuation<? super ExternalPurchaseNoticeResultIOS>, Object> presentExternalPurchaseNoticeSheetIOS;
    private final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> requestPurchase;
    private final Function1<Continuation<? super Boolean>, Object> requestPurchaseOnPromotedProductIOS;
    private final Function1<Continuation<? super Unit>, Object> restorePurchases;
    private final Function1<Continuation<? super Boolean>, Object> showAlternativeBillingDialogAndroid;
    private final Function2<ExternalPurchaseCustomLinkNoticeTypeIOS, Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, Object> showExternalPurchaseCustomLinkNoticeIOS;
    private final Function1<Continuation<? super List<PurchaseIOS>>, Object> showManageSubscriptionsIOS;
    private final Function1<Continuation<? super Boolean>, Object> syncIOS;
    private final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> validateReceipt;
    private final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> verifyPurchase;
    private final Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> verifyPurchaseWithProvider;

    public MutationHandlers() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public static /* synthetic */ MutationHandlers copy$default(MutationHandlers mutationHandlers, Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function2 function23, Function1 function13, Function2 function24, Function2 function25, Function1 function14, Function3 function3, Function2 function26, Function2 function27, Function2 function28, Function1 function15, Function2 function29, Function1 function16, Function2 function210, Function1 function17, Function1 function18, Function1 function19, Function2 function211, Function1 function110, Function1 function111, Function2 function212, Function2 function213, Function2 function214, int i, Object obj) {
        Function2 function215;
        Function2 function216;
        Function2 function217 = (i & 1) != 0 ? mutationHandlers.acknowledgePurchaseAndroid : function2;
        Function2 function218 = (i & 2) != 0 ? mutationHandlers.beginRefundRequestIOS : function22;
        Function1 function112 = (i & 4) != 0 ? mutationHandlers.checkAlternativeBillingAvailabilityAndroid : function1;
        Function1 function113 = (i & 8) != 0 ? mutationHandlers.clearTransactionIOS : function12;
        Function2 function219 = (i & 16) != 0 ? mutationHandlers.consumePurchaseAndroid : function23;
        Function1 function114 = (i & 32) != 0 ? mutationHandlers.createAlternativeBillingTokenAndroid : function13;
        Function2 function220 = (i & 64) != 0 ? mutationHandlers.createBillingProgramReportingDetailsAndroid : function24;
        Function2 function221 = (i & 128) != 0 ? mutationHandlers.deepLinkToSubscriptions : function25;
        Function1 function115 = (i & 256) != 0 ? mutationHandlers.endConnection : function14;
        Function3 function32 = (i & 512) != 0 ? mutationHandlers.finishTransaction : function3;
        Function2 function222 = (i & 1024) != 0 ? mutationHandlers.initConnection : function26;
        Function2 function223 = (i & 2048) != 0 ? mutationHandlers.isBillingProgramAvailableAndroid : function27;
        Function2 function224 = (i & 4096) != 0 ? mutationHandlers.launchExternalLinkAndroid : function28;
        Function1 function116 = (i & 8192) != 0 ? mutationHandlers.presentCodeRedemptionSheetIOS : function15;
        Function2 function225 = function217;
        Function2 function226 = (i & 16384) != 0 ? mutationHandlers.presentExternalPurchaseLinkIOS : function29;
        Function1 function117 = (i & 32768) != 0 ? mutationHandlers.presentExternalPurchaseNoticeSheetIOS : function16;
        Function2 function227 = (i & 65536) != 0 ? mutationHandlers.requestPurchase : function210;
        Function1 function118 = (i & 131072) != 0 ? mutationHandlers.requestPurchaseOnPromotedProductIOS : function17;
        Function1 function119 = (i & 262144) != 0 ? mutationHandlers.restorePurchases : function18;
        Function1 function120 = (i & 524288) != 0 ? mutationHandlers.showAlternativeBillingDialogAndroid : function19;
        Function2 function228 = (i & 1048576) != 0 ? mutationHandlers.showExternalPurchaseCustomLinkNoticeIOS : function211;
        Function1 function121 = (i & 2097152) != 0 ? mutationHandlers.showManageSubscriptionsIOS : function110;
        Function1 function122 = (i & 4194304) != 0 ? mutationHandlers.syncIOS : function111;
        Function2 function229 = (i & 8388608) != 0 ? mutationHandlers.validateReceipt : function212;
        Function2 function230 = (i & 16777216) != 0 ? mutationHandlers.verifyPurchase : function213;
        if ((i & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0) {
            function216 = function230;
            function215 = mutationHandlers.verifyPurchaseWithProvider;
        } else {
            function215 = function214;
            function216 = function230;
        }
        return mutationHandlers.copy(function225, function218, function112, function113, function219, function114, function220, function221, function115, function32, function222, function223, function224, function116, function226, function117, function227, function118, function119, function120, function228, function121, function122, function229, function216, function215);
    }

    public final Function2<String, Continuation<? super Boolean>, Object> component1() {
        return this.acknowledgePurchaseAndroid;
    }

    public final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> component10() {
        return this.finishTransaction;
    }

    public final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> component11() {
        return this.initConnection;
    }

    public final Function2<BillingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid>, Object> component12() {
        return this.isBillingProgramAvailableAndroid;
    }

    public final Function2<LaunchExternalLinkParamsAndroid, Continuation<? super Boolean>, Object> component13() {
        return this.launchExternalLinkAndroid;
    }

    public final Function1<Continuation<? super Boolean>, Object> component14() {
        return this.presentCodeRedemptionSheetIOS;
    }

    public final Function2<String, Continuation<? super ExternalPurchaseLinkResultIOS>, Object> component15() {
        return this.presentExternalPurchaseLinkIOS;
    }

    public final Function1<Continuation<? super ExternalPurchaseNoticeResultIOS>, Object> component16() {
        return this.presentExternalPurchaseNoticeSheetIOS;
    }

    public final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> component17() {
        return this.requestPurchase;
    }

    public final Function1<Continuation<? super Boolean>, Object> component18() {
        return this.requestPurchaseOnPromotedProductIOS;
    }

    public final Function1<Continuation<? super Unit>, Object> component19() {
        return this.restorePurchases;
    }

    public final Function2<String, Continuation<? super String>, Object> component2() {
        return this.beginRefundRequestIOS;
    }

    public final Function1<Continuation<? super Boolean>, Object> component20() {
        return this.showAlternativeBillingDialogAndroid;
    }

    public final Function2<ExternalPurchaseCustomLinkNoticeTypeIOS, Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, Object> component21() {
        return this.showExternalPurchaseCustomLinkNoticeIOS;
    }

    public final Function1<Continuation<? super List<PurchaseIOS>>, Object> component22() {
        return this.showManageSubscriptionsIOS;
    }

    public final Function1<Continuation<? super Boolean>, Object> component23() {
        return this.syncIOS;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> component24() {
        return this.validateReceipt;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> component25() {
        return this.verifyPurchase;
    }

    public final Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> component26() {
        return this.verifyPurchaseWithProvider;
    }

    public final Function1<Continuation<? super Boolean>, Object> component3() {
        return this.checkAlternativeBillingAvailabilityAndroid;
    }

    public final Function1<Continuation<? super Boolean>, Object> component4() {
        return this.clearTransactionIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> component5() {
        return this.consumePurchaseAndroid;
    }

    public final Function1<Continuation<? super String>, Object> component6() {
        return this.createAlternativeBillingTokenAndroid;
    }

    public final Function2<BillingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid>, Object> component7() {
        return this.createBillingProgramReportingDetailsAndroid;
    }

    public final Function2<DeepLinkOptions, Continuation<? super Unit>, Object> component8() {
        return this.deepLinkToSubscriptions;
    }

    public final Function1<Continuation<? super Boolean>, Object> component9() {
        return this.endConnection;
    }

    public final MutationHandlers copy(Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> acknowledgePurchaseAndroid, Function2<? super String, ? super Continuation<? super String>, ? extends Object> beginRefundRequestIOS, Function1<? super Continuation<? super Boolean>, ? extends Object> checkAlternativeBillingAvailabilityAndroid, Function1<? super Continuation<? super Boolean>, ? extends Object> clearTransactionIOS, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> consumePurchaseAndroid, Function1<? super Continuation<? super String>, ? extends Object> createAlternativeBillingTokenAndroid, Function2<? super BillingProgramAndroid, ? super Continuation<? super BillingProgramReportingDetailsAndroid>, ? extends Object> createBillingProgramReportingDetailsAndroid, Function2<? super DeepLinkOptions, ? super Continuation<? super Unit>, ? extends Object> deepLinkToSubscriptions, Function1<? super Continuation<? super Boolean>, ? extends Object> endConnection, Function3<? super Purchase, ? super Boolean, ? super Continuation<? super Unit>, ? extends Object> finishTransaction, Function2<? super InitConnectionConfig, ? super Continuation<? super Boolean>, ? extends Object> initConnection, Function2<? super BillingProgramAndroid, ? super Continuation<? super BillingProgramAvailabilityResultAndroid>, ? extends Object> isBillingProgramAvailableAndroid, Function2<? super LaunchExternalLinkParamsAndroid, ? super Continuation<? super Boolean>, ? extends Object> launchExternalLinkAndroid, Function1<? super Continuation<? super Boolean>, ? extends Object> presentCodeRedemptionSheetIOS, Function2<? super String, ? super Continuation<? super ExternalPurchaseLinkResultIOS>, ? extends Object> presentExternalPurchaseLinkIOS, Function1<? super Continuation<? super ExternalPurchaseNoticeResultIOS>, ? extends Object> presentExternalPurchaseNoticeSheetIOS, Function2<? super RequestPurchaseProps, ? super Continuation<? super RequestPurchaseResult>, ? extends Object> requestPurchase, Function1<? super Continuation<? super Boolean>, ? extends Object> requestPurchaseOnPromotedProductIOS, Function1<? super Continuation<? super Unit>, ? extends Object> restorePurchases, Function1<? super Continuation<? super Boolean>, ? extends Object> showAlternativeBillingDialogAndroid, Function2<? super ExternalPurchaseCustomLinkNoticeTypeIOS, ? super Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, ? extends Object> showExternalPurchaseCustomLinkNoticeIOS, Function1<? super Continuation<? super List<PurchaseIOS>>, ? extends Object> showManageSubscriptionsIOS, Function1<? super Continuation<? super Boolean>, ? extends Object> syncIOS, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResult>, ? extends Object> validateReceipt, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResult>, ? extends Object> verifyPurchase, Function2<? super VerifyPurchaseWithProviderProps, ? super Continuation<? super VerifyPurchaseWithProviderResult>, ? extends Object> verifyPurchaseWithProvider) {
        return new MutationHandlers(acknowledgePurchaseAndroid, beginRefundRequestIOS, checkAlternativeBillingAvailabilityAndroid, clearTransactionIOS, consumePurchaseAndroid, createAlternativeBillingTokenAndroid, createBillingProgramReportingDetailsAndroid, deepLinkToSubscriptions, endConnection, finishTransaction, initConnection, isBillingProgramAvailableAndroid, launchExternalLinkAndroid, presentCodeRedemptionSheetIOS, presentExternalPurchaseLinkIOS, presentExternalPurchaseNoticeSheetIOS, requestPurchase, requestPurchaseOnPromotedProductIOS, restorePurchases, showAlternativeBillingDialogAndroid, showExternalPurchaseCustomLinkNoticeIOS, showManageSubscriptionsIOS, syncIOS, validateReceipt, verifyPurchase, verifyPurchaseWithProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutationHandlers)) {
            return false;
        }
        MutationHandlers mutationHandlers = (MutationHandlers) other;
        return Intrinsics.areEqual(this.acknowledgePurchaseAndroid, mutationHandlers.acknowledgePurchaseAndroid) && Intrinsics.areEqual(this.beginRefundRequestIOS, mutationHandlers.beginRefundRequestIOS) && Intrinsics.areEqual(this.checkAlternativeBillingAvailabilityAndroid, mutationHandlers.checkAlternativeBillingAvailabilityAndroid) && Intrinsics.areEqual(this.clearTransactionIOS, mutationHandlers.clearTransactionIOS) && Intrinsics.areEqual(this.consumePurchaseAndroid, mutationHandlers.consumePurchaseAndroid) && Intrinsics.areEqual(this.createAlternativeBillingTokenAndroid, mutationHandlers.createAlternativeBillingTokenAndroid) && Intrinsics.areEqual(this.createBillingProgramReportingDetailsAndroid, mutationHandlers.createBillingProgramReportingDetailsAndroid) && Intrinsics.areEqual(this.deepLinkToSubscriptions, mutationHandlers.deepLinkToSubscriptions) && Intrinsics.areEqual(this.endConnection, mutationHandlers.endConnection) && Intrinsics.areEqual(this.finishTransaction, mutationHandlers.finishTransaction) && Intrinsics.areEqual(this.initConnection, mutationHandlers.initConnection) && Intrinsics.areEqual(this.isBillingProgramAvailableAndroid, mutationHandlers.isBillingProgramAvailableAndroid) && Intrinsics.areEqual(this.launchExternalLinkAndroid, mutationHandlers.launchExternalLinkAndroid) && Intrinsics.areEqual(this.presentCodeRedemptionSheetIOS, mutationHandlers.presentCodeRedemptionSheetIOS) && Intrinsics.areEqual(this.presentExternalPurchaseLinkIOS, mutationHandlers.presentExternalPurchaseLinkIOS) && Intrinsics.areEqual(this.presentExternalPurchaseNoticeSheetIOS, mutationHandlers.presentExternalPurchaseNoticeSheetIOS) && Intrinsics.areEqual(this.requestPurchase, mutationHandlers.requestPurchase) && Intrinsics.areEqual(this.requestPurchaseOnPromotedProductIOS, mutationHandlers.requestPurchaseOnPromotedProductIOS) && Intrinsics.areEqual(this.restorePurchases, mutationHandlers.restorePurchases) && Intrinsics.areEqual(this.showAlternativeBillingDialogAndroid, mutationHandlers.showAlternativeBillingDialogAndroid) && Intrinsics.areEqual(this.showExternalPurchaseCustomLinkNoticeIOS, mutationHandlers.showExternalPurchaseCustomLinkNoticeIOS) && Intrinsics.areEqual(this.showManageSubscriptionsIOS, mutationHandlers.showManageSubscriptionsIOS) && Intrinsics.areEqual(this.syncIOS, mutationHandlers.syncIOS) && Intrinsics.areEqual(this.validateReceipt, mutationHandlers.validateReceipt) && Intrinsics.areEqual(this.verifyPurchase, mutationHandlers.verifyPurchase) && Intrinsics.areEqual(this.verifyPurchaseWithProvider, mutationHandlers.verifyPurchaseWithProvider);
    }

    public int hashCode() {
        Function2<String, Continuation<? super Boolean>, Object> function2 = this.acknowledgePurchaseAndroid;
        int hashCode = (function2 == null ? 0 : function2.hashCode()) * 31;
        Function2<String, Continuation<? super String>, Object> function22 = this.beginRefundRequestIOS;
        int hashCode2 = (hashCode + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function1 = this.checkAlternativeBillingAvailabilityAndroid;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function12 = this.clearTransactionIOS;
        int hashCode4 = (hashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<String, Continuation<? super Boolean>, Object> function23 = this.consumePurchaseAndroid;
        int hashCode5 = (hashCode4 + (function23 == null ? 0 : function23.hashCode())) * 31;
        Function1<Continuation<? super String>, Object> function13 = this.createAlternativeBillingTokenAndroid;
        int hashCode6 = (hashCode5 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function2<BillingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid>, Object> function24 = this.createBillingProgramReportingDetailsAndroid;
        int hashCode7 = (hashCode6 + (function24 == null ? 0 : function24.hashCode())) * 31;
        Function2<DeepLinkOptions, Continuation<? super Unit>, Object> function25 = this.deepLinkToSubscriptions;
        int hashCode8 = (hashCode7 + (function25 == null ? 0 : function25.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function14 = this.endConnection;
        int hashCode9 = (hashCode8 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function3<Purchase, Boolean, Continuation<? super Unit>, Object> function3 = this.finishTransaction;
        int hashCode10 = (hashCode9 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> function26 = this.initConnection;
        int hashCode11 = (hashCode10 + (function26 == null ? 0 : function26.hashCode())) * 31;
        Function2<BillingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid>, Object> function27 = this.isBillingProgramAvailableAndroid;
        int hashCode12 = (hashCode11 + (function27 == null ? 0 : function27.hashCode())) * 31;
        Function2<LaunchExternalLinkParamsAndroid, Continuation<? super Boolean>, Object> function28 = this.launchExternalLinkAndroid;
        int hashCode13 = (hashCode12 + (function28 == null ? 0 : function28.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function15 = this.presentCodeRedemptionSheetIOS;
        int hashCode14 = (hashCode13 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function2<String, Continuation<? super ExternalPurchaseLinkResultIOS>, Object> function29 = this.presentExternalPurchaseLinkIOS;
        int hashCode15 = (hashCode14 + (function29 == null ? 0 : function29.hashCode())) * 31;
        Function1<Continuation<? super ExternalPurchaseNoticeResultIOS>, Object> function16 = this.presentExternalPurchaseNoticeSheetIOS;
        int hashCode16 = (hashCode15 + (function16 == null ? 0 : function16.hashCode())) * 31;
        Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> function210 = this.requestPurchase;
        int hashCode17 = (hashCode16 + (function210 == null ? 0 : function210.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function17 = this.requestPurchaseOnPromotedProductIOS;
        int hashCode18 = (hashCode17 + (function17 == null ? 0 : function17.hashCode())) * 31;
        Function1<Continuation<? super Unit>, Object> function18 = this.restorePurchases;
        int hashCode19 = (hashCode18 + (function18 == null ? 0 : function18.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function19 = this.showAlternativeBillingDialogAndroid;
        int hashCode20 = (hashCode19 + (function19 == null ? 0 : function19.hashCode())) * 31;
        Function2<ExternalPurchaseCustomLinkNoticeTypeIOS, Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, Object> function211 = this.showExternalPurchaseCustomLinkNoticeIOS;
        int hashCode21 = (hashCode20 + (function211 == null ? 0 : function211.hashCode())) * 31;
        Function1<Continuation<? super List<PurchaseIOS>>, Object> function110 = this.showManageSubscriptionsIOS;
        int hashCode22 = (hashCode21 + (function110 == null ? 0 : function110.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function111 = this.syncIOS;
        int hashCode23 = (hashCode22 + (function111 == null ? 0 : function111.hashCode())) * 31;
        Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> function212 = this.validateReceipt;
        int hashCode24 = (hashCode23 + (function212 == null ? 0 : function212.hashCode())) * 31;
        Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> function213 = this.verifyPurchase;
        int hashCode25 = (hashCode24 + (function213 == null ? 0 : function213.hashCode())) * 31;
        Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> function214 = this.verifyPurchaseWithProvider;
        return hashCode25 + (function214 != null ? function214.hashCode() : 0);
    }

    public String toString() {
        return "MutationHandlers(acknowledgePurchaseAndroid=" + this.acknowledgePurchaseAndroid + ", beginRefundRequestIOS=" + this.beginRefundRequestIOS + ", checkAlternativeBillingAvailabilityAndroid=" + this.checkAlternativeBillingAvailabilityAndroid + ", clearTransactionIOS=" + this.clearTransactionIOS + ", consumePurchaseAndroid=" + this.consumePurchaseAndroid + ", createAlternativeBillingTokenAndroid=" + this.createAlternativeBillingTokenAndroid + ", createBillingProgramReportingDetailsAndroid=" + this.createBillingProgramReportingDetailsAndroid + ", deepLinkToSubscriptions=" + this.deepLinkToSubscriptions + ", endConnection=" + this.endConnection + ", finishTransaction=" + this.finishTransaction + ", initConnection=" + this.initConnection + ", isBillingProgramAvailableAndroid=" + this.isBillingProgramAvailableAndroid + ", launchExternalLinkAndroid=" + this.launchExternalLinkAndroid + ", presentCodeRedemptionSheetIOS=" + this.presentCodeRedemptionSheetIOS + ", presentExternalPurchaseLinkIOS=" + this.presentExternalPurchaseLinkIOS + ", presentExternalPurchaseNoticeSheetIOS=" + this.presentExternalPurchaseNoticeSheetIOS + ", requestPurchase=" + this.requestPurchase + ", requestPurchaseOnPromotedProductIOS=" + this.requestPurchaseOnPromotedProductIOS + ", restorePurchases=" + this.restorePurchases + ", showAlternativeBillingDialogAndroid=" + this.showAlternativeBillingDialogAndroid + ", showExternalPurchaseCustomLinkNoticeIOS=" + this.showExternalPurchaseCustomLinkNoticeIOS + ", showManageSubscriptionsIOS=" + this.showManageSubscriptionsIOS + ", syncIOS=" + this.syncIOS + ", validateReceipt=" + this.validateReceipt + ", verifyPurchase=" + this.verifyPurchase + ", verifyPurchaseWithProvider=" + this.verifyPurchaseWithProvider + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutationHandlers(Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super String>, ? extends Object> function22, Function1<? super Continuation<? super Boolean>, ? extends Object> function1, Function1<? super Continuation<? super Boolean>, ? extends Object> function12, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function23, Function1<? super Continuation<? super String>, ? extends Object> function13, Function2<? super BillingProgramAndroid, ? super Continuation<? super BillingProgramReportingDetailsAndroid>, ? extends Object> function24, Function2<? super DeepLinkOptions, ? super Continuation<? super Unit>, ? extends Object> function25, Function1<? super Continuation<? super Boolean>, ? extends Object> function14, Function3<? super Purchase, ? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function3, Function2<? super InitConnectionConfig, ? super Continuation<? super Boolean>, ? extends Object> function26, Function2<? super BillingProgramAndroid, ? super Continuation<? super BillingProgramAvailabilityResultAndroid>, ? extends Object> function27, Function2<? super LaunchExternalLinkParamsAndroid, ? super Continuation<? super Boolean>, ? extends Object> function28, Function1<? super Continuation<? super Boolean>, ? extends Object> function15, Function2<? super String, ? super Continuation<? super ExternalPurchaseLinkResultIOS>, ? extends Object> function29, Function1<? super Continuation<? super ExternalPurchaseNoticeResultIOS>, ? extends Object> function16, Function2<? super RequestPurchaseProps, ? super Continuation<? super RequestPurchaseResult>, ? extends Object> function210, Function1<? super Continuation<? super Boolean>, ? extends Object> function17, Function1<? super Continuation<? super Unit>, ? extends Object> function18, Function1<? super Continuation<? super Boolean>, ? extends Object> function19, Function2<? super ExternalPurchaseCustomLinkNoticeTypeIOS, ? super Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, ? extends Object> function211, Function1<? super Continuation<? super List<PurchaseIOS>>, ? extends Object> function110, Function1<? super Continuation<? super Boolean>, ? extends Object> function111, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResult>, ? extends Object> function212, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResult>, ? extends Object> function213, Function2<? super VerifyPurchaseWithProviderProps, ? super Continuation<? super VerifyPurchaseWithProviderResult>, ? extends Object> function214) {
        this.acknowledgePurchaseAndroid = function2;
        this.beginRefundRequestIOS = function22;
        this.checkAlternativeBillingAvailabilityAndroid = function1;
        this.clearTransactionIOS = function12;
        this.consumePurchaseAndroid = function23;
        this.createAlternativeBillingTokenAndroid = function13;
        this.createBillingProgramReportingDetailsAndroid = function24;
        this.deepLinkToSubscriptions = function25;
        this.endConnection = function14;
        this.finishTransaction = function3;
        this.initConnection = function26;
        this.isBillingProgramAvailableAndroid = function27;
        this.launchExternalLinkAndroid = function28;
        this.presentCodeRedemptionSheetIOS = function15;
        this.presentExternalPurchaseLinkIOS = function29;
        this.presentExternalPurchaseNoticeSheetIOS = function16;
        this.requestPurchase = function210;
        this.requestPurchaseOnPromotedProductIOS = function17;
        this.restorePurchases = function18;
        this.showAlternativeBillingDialogAndroid = function19;
        this.showExternalPurchaseCustomLinkNoticeIOS = function211;
        this.showManageSubscriptionsIOS = function110;
        this.syncIOS = function111;
        this.validateReceipt = function212;
        this.verifyPurchase = function213;
        this.verifyPurchaseWithProvider = function214;
    }

    public /* synthetic */ MutationHandlers(Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function2 function23, Function1 function13, Function2 function24, Function2 function25, Function1 function14, Function3 function3, Function2 function26, Function2 function27, Function2 function28, Function1 function15, Function2 function29, Function1 function16, Function2 function210, Function1 function17, Function1 function18, Function1 function19, Function2 function211, Function1 function110, Function1 function111, Function2 function212, Function2 function213, Function2 function214, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function22, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function12, (i & 16) != 0 ? null : function23, (i & 32) != 0 ? null : function13, (i & 64) != 0 ? null : function24, (i & 128) != 0 ? null : function25, (i & 256) != 0 ? null : function14, (i & 512) != 0 ? null : function3, (i & 1024) != 0 ? null : function26, (i & 2048) != 0 ? null : function27, (i & 4096) != 0 ? null : function28, (i & 8192) != 0 ? null : function15, (i & 16384) != 0 ? null : function29, (i & 32768) != 0 ? null : function16, (i & 65536) != 0 ? null : function210, (i & 131072) != 0 ? null : function17, (i & 262144) != 0 ? null : function18, (i & 524288) != 0 ? null : function19, (i & 1048576) != 0 ? null : function211, (i & 2097152) != 0 ? null : function110, (i & 4194304) != 0 ? null : function111, (i & 8388608) != 0 ? null : function212, (i & 16777216) != 0 ? null : function213, (i & BundledSQLite.SQLITE_OPEN_EXRESCODE) != 0 ? null : function214);
    }

    public final Function2<String, Continuation<? super Boolean>, Object> getAcknowledgePurchaseAndroid() {
        return this.acknowledgePurchaseAndroid;
    }

    public final Function2<String, Continuation<? super String>, Object> getBeginRefundRequestIOS() {
        return this.beginRefundRequestIOS;
    }

    public final Function1<Continuation<? super Boolean>, Object> getCheckAlternativeBillingAvailabilityAndroid() {
        return this.checkAlternativeBillingAvailabilityAndroid;
    }

    public final Function1<Continuation<? super Boolean>, Object> getClearTransactionIOS() {
        return this.clearTransactionIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> getConsumePurchaseAndroid() {
        return this.consumePurchaseAndroid;
    }

    public final Function1<Continuation<? super String>, Object> getCreateAlternativeBillingTokenAndroid() {
        return this.createAlternativeBillingTokenAndroid;
    }

    public final Function2<BillingProgramAndroid, Continuation<? super BillingProgramReportingDetailsAndroid>, Object> getCreateBillingProgramReportingDetailsAndroid() {
        return this.createBillingProgramReportingDetailsAndroid;
    }

    public final Function2<DeepLinkOptions, Continuation<? super Unit>, Object> getDeepLinkToSubscriptions() {
        return this.deepLinkToSubscriptions;
    }

    public final Function1<Continuation<? super Boolean>, Object> getEndConnection() {
        return this.endConnection;
    }

    public final Function3<Purchase, Boolean, Continuation<? super Unit>, Object> getFinishTransaction() {
        return this.finishTransaction;
    }

    public final Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> getInitConnection() {
        return this.initConnection;
    }

    public final Function2<BillingProgramAndroid, Continuation<? super BillingProgramAvailabilityResultAndroid>, Object> isBillingProgramAvailableAndroid() {
        return this.isBillingProgramAvailableAndroid;
    }

    public final Function2<LaunchExternalLinkParamsAndroid, Continuation<? super Boolean>, Object> getLaunchExternalLinkAndroid() {
        return this.launchExternalLinkAndroid;
    }

    public final Function1<Continuation<? super Boolean>, Object> getPresentCodeRedemptionSheetIOS() {
        return this.presentCodeRedemptionSheetIOS;
    }

    public final Function2<String, Continuation<? super ExternalPurchaseLinkResultIOS>, Object> getPresentExternalPurchaseLinkIOS() {
        return this.presentExternalPurchaseLinkIOS;
    }

    public final Function1<Continuation<? super ExternalPurchaseNoticeResultIOS>, Object> getPresentExternalPurchaseNoticeSheetIOS() {
        return this.presentExternalPurchaseNoticeSheetIOS;
    }

    public final Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> getRequestPurchase() {
        return this.requestPurchase;
    }

    public final Function1<Continuation<? super Boolean>, Object> getRequestPurchaseOnPromotedProductIOS() {
        return this.requestPurchaseOnPromotedProductIOS;
    }

    public final Function1<Continuation<? super Unit>, Object> getRestorePurchases() {
        return this.restorePurchases;
    }

    public final Function1<Continuation<? super Boolean>, Object> getShowAlternativeBillingDialogAndroid() {
        return this.showAlternativeBillingDialogAndroid;
    }

    public final Function2<ExternalPurchaseCustomLinkNoticeTypeIOS, Continuation<? super ExternalPurchaseCustomLinkNoticeResultIOS>, Object> getShowExternalPurchaseCustomLinkNoticeIOS() {
        return this.showExternalPurchaseCustomLinkNoticeIOS;
    }

    public final Function1<Continuation<? super List<PurchaseIOS>>, Object> getShowManageSubscriptionsIOS() {
        return this.showManageSubscriptionsIOS;
    }

    public final Function1<Continuation<? super Boolean>, Object> getSyncIOS() {
        return this.syncIOS;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getValidateReceipt() {
        return this.validateReceipt;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> getVerifyPurchase() {
        return this.verifyPurchase;
    }

    public final Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> getVerifyPurchaseWithProvider() {
        return this.verifyPurchaseWithProvider;
    }
}
