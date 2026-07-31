package dev.hyo.openiap;

import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\b\u0012&\b\u0002\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006\u0012=\b\u0002\u0010\u0007\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u000e\u0012;\b\u0002\u0010\u000f\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0013\u0012I\b\u0002\u0010\u0014\u001aC\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0018\u0012(\b\u0002\u0010\u0019\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b\u0012C\b\u0002\u0010\u001c\u001a=\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001` \u0012;\b\u0002\u0010!\u001a5\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`%\u0012,\b\u0002\u0010&\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`'\u0012(\b\u0002\u0010(\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`*\u0012(\b\u0002\u0010+\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`,\u0012&\b\u0002\u0010-\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`.\u0012&\b\u0002\u0010/\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0\u0012=\b\u0002\u00101\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`2\u0012C\b\u0002\u00103\u001a=\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`4\u0012&\b\u0002\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`6\u0012;\b\u0002\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`9\u0012;\b\u0002\u0010:\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`;\u0012=\b\u0002\u0010<\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`=\u0012A\b\u0002\u0010>\u001a;\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`@\u0012;\b\u0002\u0010A\u001a5\b\u0001\u0012\u0013\u0012\u00110B¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`D¢\u0006\u0004\bE\u0010FJ,\u0010\\\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010HJC\u0010]\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u000eHÆ\u0003¢\u0006\u0002\u0010KJA\u0010^\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0013HÆ\u0003¢\u0006\u0002\u0010KJO\u0010_\u001aC\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0018HÆ\u0003¢\u0006\u0002\u0010KJ.\u0010`\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001bHÆ\u0003¢\u0006\u0002\u0010HJI\u0010a\u001a=\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001` HÆ\u0003¢\u0006\u0002\u0010KJA\u0010b\u001a5\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`%HÆ\u0003¢\u0006\u0002\u0010KJ2\u0010c\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`'HÆ\u0003¢\u0006\u0002\u0010HJ.\u0010d\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`*HÆ\u0003¢\u0006\u0002\u0010HJ.\u0010e\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`,HÆ\u0003¢\u0006\u0002\u0010HJ,\u0010f\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`.HÆ\u0003¢\u0006\u0002\u0010HJ,\u0010g\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0HÆ\u0003¢\u0006\u0002\u0010HJC\u0010h\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`2HÆ\u0003¢\u0006\u0002\u0010KJI\u0010i\u001a=\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`4HÆ\u0003¢\u0006\u0002\u0010KJ,\u0010j\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`6HÆ\u0003¢\u0006\u0002\u0010HJA\u0010k\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`9HÆ\u0003¢\u0006\u0002\u0010KJA\u0010l\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`;HÆ\u0003¢\u0006\u0002\u0010KJC\u0010m\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`=HÆ\u0003¢\u0006\u0002\u0010KJG\u0010n\u001a;\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`@HÆ\u0003¢\u0006\u0002\u0010KJA\u0010o\u001a5\b\u0001\u0012\u0013\u0012\u00110B¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`DHÆ\u0003¢\u0006\u0002\u0010KJà\b\u0010p\u001a\u00020\u00002&\b\u0002\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u00062=\b\u0002\u0010\u0007\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u000e2;\b\u0002\u0010\u000f\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u00132I\b\u0002\u0010\u0014\u001aC\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u00182(\b\u0002\u0010\u0019\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b2C\b\u0002\u0010\u001c\u001a=\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001` 2;\b\u0002\u0010!\u001a5\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`%2,\b\u0002\u0010&\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`'2(\b\u0002\u0010(\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`*2(\b\u0002\u0010+\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`,2&\b\u0002\u0010-\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`.2&\b\u0002\u0010/\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`02=\b\u0002\u00101\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`22C\b\u0002\u00103\u001a=\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`42&\b\u0002\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`62;\b\u0002\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`92;\b\u0002\u0010:\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`;2=\b\u0002\u0010<\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`=2A\b\u0002\u0010>\u001a;\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`@2;\b\u0002\u0010A\u001a5\b\u0001\u0012\u0013\u0012\u00110B¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`DHÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00052\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020uHÖ\u0001J\t\u0010v\u001a\u00020\tHÖ\u0001R1\u0010\u0002\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HRH\u0010\u0007\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u000e¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KRF\u0010\u000f\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0013¢\u0006\n\n\u0002\u0010L\u001a\u0004\bM\u0010KRT\u0010\u0014\u001aC\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`\u0018¢\u0006\n\n\u0002\u0010L\u001a\u0004\bN\u0010KR3\u0010\u0019\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`\u001b¢\u0006\n\n\u0002\u0010I\u001a\u0004\bO\u0010HRN\u0010\u001c\u001a=\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001` ¢\u0006\n\n\u0002\u0010L\u001a\u0004\bP\u0010KRF\u0010!\u001a5\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`%¢\u0006\n\n\u0002\u0010L\u001a\u0004\bQ\u0010KR7\u0010&\u001a&\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`'¢\u0006\n\n\u0002\u0010I\u001a\u0004\bR\u0010HR3\u0010(\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`*¢\u0006\n\n\u0002\u0010I\u001a\u0004\bS\u0010HR3\u0010+\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`,¢\u0006\n\n\u0002\u0010I\u001a\u0004\bT\u0010HR1\u0010-\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`.¢\u0006\n\n\u0002\u0010I\u001a\u0004\bU\u0010HR1\u0010/\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`0¢\u0006\n\n\u0002\u0010I\u001a\u0004\bV\u0010HRH\u00101\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`2¢\u0006\n\n\u0002\u0010L\u001a\u0004\bW\u0010KRN\u00103\u001a=\b\u0001\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`4¢\u0006\n\n\u0002\u0010L\u001a\u0004\bX\u0010KR1\u00105\u001a \b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003j\u0004\u0018\u0001`6¢\u0006\n\n\u0002\u0010I\u001a\u0004\b5\u0010HRF\u00107\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(8\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`9¢\u0006\n\n\u0002\u0010L\u001a\u0004\b7\u0010KRF\u0010:\u001a5\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`;¢\u0006\n\n\u0002\u0010L\u001a\u0004\b:\u0010KRH\u0010<\u001a7\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`=¢\u0006\n\n\u0002\u0010L\u001a\u0004\bY\u0010KRL\u0010>\u001a;\b\u0001\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00150\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`@¢\u0006\n\n\u0002\u0010L\u001a\u0004\bZ\u0010KRF\u0010A\u001a5\b\u0001\u0012\u0013\u0012\u00110B¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0004\u0018\u0001`D¢\u0006\n\n\u0002\u0010L\u001a\u0004\b[\u0010K¨\u0006w"}, d2 = {"Ldev/hyo/openiap/QueryHandlers;", "", "canPresentExternalPurchaseNoticeIOS", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Ldev/hyo/openiap/QueryCanPresentExternalPurchaseNoticeIOSHandler;", "currentEntitlementIOS", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "sku", "Ldev/hyo/openiap/PurchaseIOS;", "Ldev/hyo/openiap/QueryCurrentEntitlementIOSHandler;", "fetchProducts", "Ldev/hyo/openiap/ProductRequest;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/FetchProductsResult;", "Ldev/hyo/openiap/QueryFetchProductsHandler;", "getActiveSubscriptions", "", "subscriptionIds", "Ldev/hyo/openiap/ActiveSubscription;", "Ldev/hyo/openiap/QueryGetActiveSubscriptionsHandler;", "getAppTransactionIOS", "Ldev/hyo/openiap/AppTransaction;", "Ldev/hyo/openiap/QueryGetAppTransactionIOSHandler;", "getAvailablePurchases", "Ldev/hyo/openiap/PurchaseOptions;", "options", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/QueryGetAvailablePurchasesHandler;", "getExternalPurchaseCustomLinkTokenIOS", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenTypeIOS;", "tokenType", "Ldev/hyo/openiap/ExternalPurchaseCustomLinkTokenResultIOS;", "Ldev/hyo/openiap/QueryGetExternalPurchaseCustomLinkTokenIOSHandler;", "getPendingTransactionsIOS", "Ldev/hyo/openiap/QueryGetPendingTransactionsIOSHandler;", "getPromotedProductIOS", "Ldev/hyo/openiap/ProductIOS;", "Ldev/hyo/openiap/QueryGetPromotedProductIOSHandler;", "getReceiptDataIOS", "Ldev/hyo/openiap/QueryGetReceiptDataIOSHandler;", "getStorefront", "Ldev/hyo/openiap/QueryGetStorefrontHandler;", "getStorefrontIOS", "Ldev/hyo/openiap/QueryGetStorefrontIOSHandler;", "getTransactionJwsIOS", "Ldev/hyo/openiap/QueryGetTransactionJwsIOSHandler;", "hasActiveSubscriptions", "Ldev/hyo/openiap/QueryHasActiveSubscriptionsHandler;", "isEligibleForExternalPurchaseCustomLinkIOS", "Ldev/hyo/openiap/QueryIsEligibleForExternalPurchaseCustomLinkIOSHandler;", "isEligibleForIntroOfferIOS", "groupID", "Ldev/hyo/openiap/QueryIsEligibleForIntroOfferIOSHandler;", "isTransactionVerifiedIOS", "Ldev/hyo/openiap/QueryIsTransactionVerifiedIOSHandler;", "latestTransactionIOS", "Ldev/hyo/openiap/QueryLatestTransactionIOSHandler;", "subscriptionStatusIOS", "Ldev/hyo/openiap/SubscriptionStatusIOS;", "Ldev/hyo/openiap/QuerySubscriptionStatusIOSHandler;", "validateReceiptIOS", "Ldev/hyo/openiap/VerifyPurchaseProps;", "Ldev/hyo/openiap/VerifyPurchaseResultIOS;", "Ldev/hyo/openiap/QueryValidateReceiptIOSHandler;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getCanPresentExternalPurchaseNoticeIOS", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getCurrentEntitlementIOS", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getFetchProducts", "getGetActiveSubscriptions", "getGetAppTransactionIOS", "getGetAvailablePurchases", "getGetExternalPurchaseCustomLinkTokenIOS", "getGetPendingTransactionsIOS", "getGetPromotedProductIOS", "getGetReceiptDataIOS", "getGetStorefront", "getGetStorefrontIOS", "getGetTransactionJwsIOS", "getHasActiveSubscriptions", "getLatestTransactionIOS", "getSubscriptionStatusIOS", "getValidateReceiptIOS", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Ldev/hyo/openiap/QueryHandlers;", "equals", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QueryHandlers {
    public static final int $stable = 8;
    private final Function1<Continuation<? super Boolean>, Object> canPresentExternalPurchaseNoticeIOS;
    private final Function2<String, Continuation<? super PurchaseIOS>, Object> currentEntitlementIOS;
    private final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts;
    private final Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getActiveSubscriptions;
    private final Function1<Continuation<? super AppTransaction>, Object> getAppTransactionIOS;
    private final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getAvailablePurchases;
    private final Function2<ExternalPurchaseCustomLinkTokenTypeIOS, Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, Object> getExternalPurchaseCustomLinkTokenIOS;
    private final Function1<Continuation<? super List<PurchaseIOS>>, Object> getPendingTransactionsIOS;
    private final Function1<Continuation<? super ProductIOS>, Object> getPromotedProductIOS;
    private final Function1<Continuation<? super String>, Object> getReceiptDataIOS;
    private final Function1<Continuation<? super String>, Object> getStorefront;
    private final Function1<Continuation<? super String>, Object> getStorefrontIOS;
    private final Function2<String, Continuation<? super String>, Object> getTransactionJwsIOS;
    private final Function2<List<String>, Continuation<? super Boolean>, Object> hasActiveSubscriptions;
    private final Function1<Continuation<? super Boolean>, Object> isEligibleForExternalPurchaseCustomLinkIOS;
    private final Function2<String, Continuation<? super Boolean>, Object> isEligibleForIntroOfferIOS;
    private final Function2<String, Continuation<? super Boolean>, Object> isTransactionVerifiedIOS;
    private final Function2<String, Continuation<? super PurchaseIOS>, Object> latestTransactionIOS;
    private final Function2<String, Continuation<? super List<SubscriptionStatusIOS>>, Object> subscriptionStatusIOS;
    private final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResultIOS>, Object> validateReceiptIOS;

    public QueryHandlers() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ QueryHandlers copy$default(QueryHandlers queryHandlers, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function1 function12, Function2 function24, Function2 function25, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function2 function26, Function2 function27, Function1 function18, Function2 function28, Function2 function29, Function2 function210, Function2 function211, Function2 function212, int i, Object obj) {
        Function2 function213;
        Function2 function214;
        Function1 function19 = (i & 1) != 0 ? queryHandlers.canPresentExternalPurchaseNoticeIOS : function1;
        Function2 function215 = (i & 2) != 0 ? queryHandlers.currentEntitlementIOS : function2;
        Function2 function216 = (i & 4) != 0 ? queryHandlers.fetchProducts : function22;
        Function2 function217 = (i & 8) != 0 ? queryHandlers.getActiveSubscriptions : function23;
        Function1 function110 = (i & 16) != 0 ? queryHandlers.getAppTransactionIOS : function12;
        Function2 function218 = (i & 32) != 0 ? queryHandlers.getAvailablePurchases : function24;
        Function2 function219 = (i & 64) != 0 ? queryHandlers.getExternalPurchaseCustomLinkTokenIOS : function25;
        Function1 function111 = (i & 128) != 0 ? queryHandlers.getPendingTransactionsIOS : function13;
        Function1 function112 = (i & 256) != 0 ? queryHandlers.getPromotedProductIOS : function14;
        Function1 function113 = (i & 512) != 0 ? queryHandlers.getReceiptDataIOS : function15;
        Function1 function114 = (i & 1024) != 0 ? queryHandlers.getStorefront : function16;
        Function1 function115 = (i & 2048) != 0 ? queryHandlers.getStorefrontIOS : function17;
        Function2 function220 = (i & 4096) != 0 ? queryHandlers.getTransactionJwsIOS : function26;
        Function2 function221 = (i & 8192) != 0 ? queryHandlers.hasActiveSubscriptions : function27;
        Function1 function116 = function19;
        Function1 function117 = (i & 16384) != 0 ? queryHandlers.isEligibleForExternalPurchaseCustomLinkIOS : function18;
        Function2 function222 = (i & 32768) != 0 ? queryHandlers.isEligibleForIntroOfferIOS : function28;
        Function2 function223 = (i & 65536) != 0 ? queryHandlers.isTransactionVerifiedIOS : function29;
        Function2 function224 = (i & 131072) != 0 ? queryHandlers.latestTransactionIOS : function210;
        Function2 function225 = (i & 262144) != 0 ? queryHandlers.subscriptionStatusIOS : function211;
        if ((i & 524288) != 0) {
            function214 = function225;
            function213 = queryHandlers.validateReceiptIOS;
        } else {
            function213 = function212;
            function214 = function225;
        }
        return queryHandlers.copy(function116, function215, function216, function217, function110, function218, function219, function111, function112, function113, function114, function115, function220, function221, function117, function222, function223, function224, function214, function213);
    }

    public final Function1<Continuation<? super Boolean>, Object> component1() {
        return this.canPresentExternalPurchaseNoticeIOS;
    }

    public final Function1<Continuation<? super String>, Object> component10() {
        return this.getReceiptDataIOS;
    }

    public final Function1<Continuation<? super String>, Object> component11() {
        return this.getStorefront;
    }

    public final Function1<Continuation<? super String>, Object> component12() {
        return this.getStorefrontIOS;
    }

    public final Function2<String, Continuation<? super String>, Object> component13() {
        return this.getTransactionJwsIOS;
    }

    public final Function2<List<String>, Continuation<? super Boolean>, Object> component14() {
        return this.hasActiveSubscriptions;
    }

    public final Function1<Continuation<? super Boolean>, Object> component15() {
        return this.isEligibleForExternalPurchaseCustomLinkIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> component16() {
        return this.isEligibleForIntroOfferIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> component17() {
        return this.isTransactionVerifiedIOS;
    }

    public final Function2<String, Continuation<? super PurchaseIOS>, Object> component18() {
        return this.latestTransactionIOS;
    }

    public final Function2<String, Continuation<? super List<SubscriptionStatusIOS>>, Object> component19() {
        return this.subscriptionStatusIOS;
    }

    public final Function2<String, Continuation<? super PurchaseIOS>, Object> component2() {
        return this.currentEntitlementIOS;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResultIOS>, Object> component20() {
        return this.validateReceiptIOS;
    }

    public final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> component3() {
        return this.fetchProducts;
    }

    public final Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> component4() {
        return this.getActiveSubscriptions;
    }

    public final Function1<Continuation<? super AppTransaction>, Object> component5() {
        return this.getAppTransactionIOS;
    }

    public final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> component6() {
        return this.getAvailablePurchases;
    }

    public final Function2<ExternalPurchaseCustomLinkTokenTypeIOS, Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, Object> component7() {
        return this.getExternalPurchaseCustomLinkTokenIOS;
    }

    public final Function1<Continuation<? super List<PurchaseIOS>>, Object> component8() {
        return this.getPendingTransactionsIOS;
    }

    public final Function1<Continuation<? super ProductIOS>, Object> component9() {
        return this.getPromotedProductIOS;
    }

    public final QueryHandlers copy(Function1<? super Continuation<? super Boolean>, ? extends Object> canPresentExternalPurchaseNoticeIOS, Function2<? super String, ? super Continuation<? super PurchaseIOS>, ? extends Object> currentEntitlementIOS, Function2<? super ProductRequest, ? super Continuation<? super FetchProductsResult>, ? extends Object> fetchProducts, Function2<? super List<String>, ? super Continuation<? super List<ActiveSubscription>>, ? extends Object> getActiveSubscriptions, Function1<? super Continuation<? super AppTransaction>, ? extends Object> getAppTransactionIOS, Function2<? super PurchaseOptions, ? super Continuation<? super List<? extends Purchase>>, ? extends Object> getAvailablePurchases, Function2<? super ExternalPurchaseCustomLinkTokenTypeIOS, ? super Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, ? extends Object> getExternalPurchaseCustomLinkTokenIOS, Function1<? super Continuation<? super List<PurchaseIOS>>, ? extends Object> getPendingTransactionsIOS, Function1<? super Continuation<? super ProductIOS>, ? extends Object> getPromotedProductIOS, Function1<? super Continuation<? super String>, ? extends Object> getReceiptDataIOS, Function1<? super Continuation<? super String>, ? extends Object> getStorefront, Function1<? super Continuation<? super String>, ? extends Object> getStorefrontIOS, Function2<? super String, ? super Continuation<? super String>, ? extends Object> getTransactionJwsIOS, Function2<? super List<String>, ? super Continuation<? super Boolean>, ? extends Object> hasActiveSubscriptions, Function1<? super Continuation<? super Boolean>, ? extends Object> isEligibleForExternalPurchaseCustomLinkIOS, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> isEligibleForIntroOfferIOS, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> isTransactionVerifiedIOS, Function2<? super String, ? super Continuation<? super PurchaseIOS>, ? extends Object> latestTransactionIOS, Function2<? super String, ? super Continuation<? super List<SubscriptionStatusIOS>>, ? extends Object> subscriptionStatusIOS, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResultIOS>, ? extends Object> validateReceiptIOS) {
        return new QueryHandlers(canPresentExternalPurchaseNoticeIOS, currentEntitlementIOS, fetchProducts, getActiveSubscriptions, getAppTransactionIOS, getAvailablePurchases, getExternalPurchaseCustomLinkTokenIOS, getPendingTransactionsIOS, getPromotedProductIOS, getReceiptDataIOS, getStorefront, getStorefrontIOS, getTransactionJwsIOS, hasActiveSubscriptions, isEligibleForExternalPurchaseCustomLinkIOS, isEligibleForIntroOfferIOS, isTransactionVerifiedIOS, latestTransactionIOS, subscriptionStatusIOS, validateReceiptIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryHandlers)) {
            return false;
        }
        QueryHandlers queryHandlers = (QueryHandlers) other;
        return Intrinsics.areEqual(this.canPresentExternalPurchaseNoticeIOS, queryHandlers.canPresentExternalPurchaseNoticeIOS) && Intrinsics.areEqual(this.currentEntitlementIOS, queryHandlers.currentEntitlementIOS) && Intrinsics.areEqual(this.fetchProducts, queryHandlers.fetchProducts) && Intrinsics.areEqual(this.getActiveSubscriptions, queryHandlers.getActiveSubscriptions) && Intrinsics.areEqual(this.getAppTransactionIOS, queryHandlers.getAppTransactionIOS) && Intrinsics.areEqual(this.getAvailablePurchases, queryHandlers.getAvailablePurchases) && Intrinsics.areEqual(this.getExternalPurchaseCustomLinkTokenIOS, queryHandlers.getExternalPurchaseCustomLinkTokenIOS) && Intrinsics.areEqual(this.getPendingTransactionsIOS, queryHandlers.getPendingTransactionsIOS) && Intrinsics.areEqual(this.getPromotedProductIOS, queryHandlers.getPromotedProductIOS) && Intrinsics.areEqual(this.getReceiptDataIOS, queryHandlers.getReceiptDataIOS) && Intrinsics.areEqual(this.getStorefront, queryHandlers.getStorefront) && Intrinsics.areEqual(this.getStorefrontIOS, queryHandlers.getStorefrontIOS) && Intrinsics.areEqual(this.getTransactionJwsIOS, queryHandlers.getTransactionJwsIOS) && Intrinsics.areEqual(this.hasActiveSubscriptions, queryHandlers.hasActiveSubscriptions) && Intrinsics.areEqual(this.isEligibleForExternalPurchaseCustomLinkIOS, queryHandlers.isEligibleForExternalPurchaseCustomLinkIOS) && Intrinsics.areEqual(this.isEligibleForIntroOfferIOS, queryHandlers.isEligibleForIntroOfferIOS) && Intrinsics.areEqual(this.isTransactionVerifiedIOS, queryHandlers.isTransactionVerifiedIOS) && Intrinsics.areEqual(this.latestTransactionIOS, queryHandlers.latestTransactionIOS) && Intrinsics.areEqual(this.subscriptionStatusIOS, queryHandlers.subscriptionStatusIOS) && Intrinsics.areEqual(this.validateReceiptIOS, queryHandlers.validateReceiptIOS);
    }

    public int hashCode() {
        Function1<Continuation<? super Boolean>, Object> function1 = this.canPresentExternalPurchaseNoticeIOS;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function2<String, Continuation<? super PurchaseIOS>, Object> function2 = this.currentEntitlementIOS;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> function22 = this.fetchProducts;
        int hashCode3 = (hashCode2 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> function23 = this.getActiveSubscriptions;
        int hashCode4 = (hashCode3 + (function23 == null ? 0 : function23.hashCode())) * 31;
        Function1<Continuation<? super AppTransaction>, Object> function12 = this.getAppTransactionIOS;
        int hashCode5 = (hashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> function24 = this.getAvailablePurchases;
        int hashCode6 = (hashCode5 + (function24 == null ? 0 : function24.hashCode())) * 31;
        Function2<ExternalPurchaseCustomLinkTokenTypeIOS, Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, Object> function25 = this.getExternalPurchaseCustomLinkTokenIOS;
        int hashCode7 = (hashCode6 + (function25 == null ? 0 : function25.hashCode())) * 31;
        Function1<Continuation<? super List<PurchaseIOS>>, Object> function13 = this.getPendingTransactionsIOS;
        int hashCode8 = (hashCode7 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<Continuation<? super ProductIOS>, Object> function14 = this.getPromotedProductIOS;
        int hashCode9 = (hashCode8 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<Continuation<? super String>, Object> function15 = this.getReceiptDataIOS;
        int hashCode10 = (hashCode9 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function1<Continuation<? super String>, Object> function16 = this.getStorefront;
        int hashCode11 = (hashCode10 + (function16 == null ? 0 : function16.hashCode())) * 31;
        Function1<Continuation<? super String>, Object> function17 = this.getStorefrontIOS;
        int hashCode12 = (hashCode11 + (function17 == null ? 0 : function17.hashCode())) * 31;
        Function2<String, Continuation<? super String>, Object> function26 = this.getTransactionJwsIOS;
        int hashCode13 = (hashCode12 + (function26 == null ? 0 : function26.hashCode())) * 31;
        Function2<List<String>, Continuation<? super Boolean>, Object> function27 = this.hasActiveSubscriptions;
        int hashCode14 = (hashCode13 + (function27 == null ? 0 : function27.hashCode())) * 31;
        Function1<Continuation<? super Boolean>, Object> function18 = this.isEligibleForExternalPurchaseCustomLinkIOS;
        int hashCode15 = (hashCode14 + (function18 == null ? 0 : function18.hashCode())) * 31;
        Function2<String, Continuation<? super Boolean>, Object> function28 = this.isEligibleForIntroOfferIOS;
        int hashCode16 = (hashCode15 + (function28 == null ? 0 : function28.hashCode())) * 31;
        Function2<String, Continuation<? super Boolean>, Object> function29 = this.isTransactionVerifiedIOS;
        int hashCode17 = (hashCode16 + (function29 == null ? 0 : function29.hashCode())) * 31;
        Function2<String, Continuation<? super PurchaseIOS>, Object> function210 = this.latestTransactionIOS;
        int hashCode18 = (hashCode17 + (function210 == null ? 0 : function210.hashCode())) * 31;
        Function2<String, Continuation<? super List<SubscriptionStatusIOS>>, Object> function211 = this.subscriptionStatusIOS;
        int hashCode19 = (hashCode18 + (function211 == null ? 0 : function211.hashCode())) * 31;
        Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResultIOS>, Object> function212 = this.validateReceiptIOS;
        return hashCode19 + (function212 != null ? function212.hashCode() : 0);
    }

    public String toString() {
        return "QueryHandlers(canPresentExternalPurchaseNoticeIOS=" + this.canPresentExternalPurchaseNoticeIOS + ", currentEntitlementIOS=" + this.currentEntitlementIOS + ", fetchProducts=" + this.fetchProducts + ", getActiveSubscriptions=" + this.getActiveSubscriptions + ", getAppTransactionIOS=" + this.getAppTransactionIOS + ", getAvailablePurchases=" + this.getAvailablePurchases + ", getExternalPurchaseCustomLinkTokenIOS=" + this.getExternalPurchaseCustomLinkTokenIOS + ", getPendingTransactionsIOS=" + this.getPendingTransactionsIOS + ", getPromotedProductIOS=" + this.getPromotedProductIOS + ", getReceiptDataIOS=" + this.getReceiptDataIOS + ", getStorefront=" + this.getStorefront + ", getStorefrontIOS=" + this.getStorefrontIOS + ", getTransactionJwsIOS=" + this.getTransactionJwsIOS + ", hasActiveSubscriptions=" + this.hasActiveSubscriptions + ", isEligibleForExternalPurchaseCustomLinkIOS=" + this.isEligibleForExternalPurchaseCustomLinkIOS + ", isEligibleForIntroOfferIOS=" + this.isEligibleForIntroOfferIOS + ", isTransactionVerifiedIOS=" + this.isTransactionVerifiedIOS + ", latestTransactionIOS=" + this.latestTransactionIOS + ", subscriptionStatusIOS=" + this.subscriptionStatusIOS + ", validateReceiptIOS=" + this.validateReceiptIOS + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryHandlers(Function1<? super Continuation<? super Boolean>, ? extends Object> function1, Function2<? super String, ? super Continuation<? super PurchaseIOS>, ? extends Object> function2, Function2<? super ProductRequest, ? super Continuation<? super FetchProductsResult>, ? extends Object> function22, Function2<? super List<String>, ? super Continuation<? super List<ActiveSubscription>>, ? extends Object> function23, Function1<? super Continuation<? super AppTransaction>, ? extends Object> function12, Function2<? super PurchaseOptions, ? super Continuation<? super List<? extends Purchase>>, ? extends Object> function24, Function2<? super ExternalPurchaseCustomLinkTokenTypeIOS, ? super Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, ? extends Object> function25, Function1<? super Continuation<? super List<PurchaseIOS>>, ? extends Object> function13, Function1<? super Continuation<? super ProductIOS>, ? extends Object> function14, Function1<? super Continuation<? super String>, ? extends Object> function15, Function1<? super Continuation<? super String>, ? extends Object> function16, Function1<? super Continuation<? super String>, ? extends Object> function17, Function2<? super String, ? super Continuation<? super String>, ? extends Object> function26, Function2<? super List<String>, ? super Continuation<? super Boolean>, ? extends Object> function27, Function1<? super Continuation<? super Boolean>, ? extends Object> function18, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function28, Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function29, Function2<? super String, ? super Continuation<? super PurchaseIOS>, ? extends Object> function210, Function2<? super String, ? super Continuation<? super List<SubscriptionStatusIOS>>, ? extends Object> function211, Function2<? super VerifyPurchaseProps, ? super Continuation<? super VerifyPurchaseResultIOS>, ? extends Object> function212) {
        this.canPresentExternalPurchaseNoticeIOS = function1;
        this.currentEntitlementIOS = function2;
        this.fetchProducts = function22;
        this.getActiveSubscriptions = function23;
        this.getAppTransactionIOS = function12;
        this.getAvailablePurchases = function24;
        this.getExternalPurchaseCustomLinkTokenIOS = function25;
        this.getPendingTransactionsIOS = function13;
        this.getPromotedProductIOS = function14;
        this.getReceiptDataIOS = function15;
        this.getStorefront = function16;
        this.getStorefrontIOS = function17;
        this.getTransactionJwsIOS = function26;
        this.hasActiveSubscriptions = function27;
        this.isEligibleForExternalPurchaseCustomLinkIOS = function18;
        this.isEligibleForIntroOfferIOS = function28;
        this.isTransactionVerifiedIOS = function29;
        this.latestTransactionIOS = function210;
        this.subscriptionStatusIOS = function211;
        this.validateReceiptIOS = function212;
    }

    public /* synthetic */ QueryHandlers(Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function1 function12, Function2 function24, Function2 function25, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function2 function26, Function2 function27, Function1 function18, Function2 function28, Function2 function29, Function2 function210, Function2 function211, Function2 function212, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function22, (i & 8) != 0 ? null : function23, (i & 16) != 0 ? null : function12, (i & 32) != 0 ? null : function24, (i & 64) != 0 ? null : function25, (i & 128) != 0 ? null : function13, (i & 256) != 0 ? null : function14, (i & 512) != 0 ? null : function15, (i & 1024) != 0 ? null : function16, (i & 2048) != 0 ? null : function17, (i & 4096) != 0 ? null : function26, (i & 8192) != 0 ? null : function27, (i & 16384) != 0 ? null : function18, (i & 32768) != 0 ? null : function28, (i & 65536) != 0 ? null : function29, (i & 131072) != 0 ? null : function210, (i & 262144) != 0 ? null : function211, (i & 524288) != 0 ? null : function212);
    }

    public final Function1<Continuation<? super Boolean>, Object> getCanPresentExternalPurchaseNoticeIOS() {
        return this.canPresentExternalPurchaseNoticeIOS;
    }

    public final Function2<String, Continuation<? super PurchaseIOS>, Object> getCurrentEntitlementIOS() {
        return this.currentEntitlementIOS;
    }

    public final Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> getFetchProducts() {
        return this.fetchProducts;
    }

    public final Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getGetActiveSubscriptions() {
        return this.getActiveSubscriptions;
    }

    public final Function1<Continuation<? super AppTransaction>, Object> getGetAppTransactionIOS() {
        return this.getAppTransactionIOS;
    }

    public final Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getGetAvailablePurchases() {
        return this.getAvailablePurchases;
    }

    public final Function2<ExternalPurchaseCustomLinkTokenTypeIOS, Continuation<? super ExternalPurchaseCustomLinkTokenResultIOS>, Object> getGetExternalPurchaseCustomLinkTokenIOS() {
        return this.getExternalPurchaseCustomLinkTokenIOS;
    }

    public final Function1<Continuation<? super List<PurchaseIOS>>, Object> getGetPendingTransactionsIOS() {
        return this.getPendingTransactionsIOS;
    }

    public final Function1<Continuation<? super ProductIOS>, Object> getGetPromotedProductIOS() {
        return this.getPromotedProductIOS;
    }

    public final Function1<Continuation<? super String>, Object> getGetReceiptDataIOS() {
        return this.getReceiptDataIOS;
    }

    public final Function1<Continuation<? super String>, Object> getGetStorefront() {
        return this.getStorefront;
    }

    public final Function1<Continuation<? super String>, Object> getGetStorefrontIOS() {
        return this.getStorefrontIOS;
    }

    public final Function2<String, Continuation<? super String>, Object> getGetTransactionJwsIOS() {
        return this.getTransactionJwsIOS;
    }

    public final Function2<List<String>, Continuation<? super Boolean>, Object> getHasActiveSubscriptions() {
        return this.hasActiveSubscriptions;
    }

    public final Function1<Continuation<? super Boolean>, Object> isEligibleForExternalPurchaseCustomLinkIOS() {
        return this.isEligibleForExternalPurchaseCustomLinkIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> isEligibleForIntroOfferIOS() {
        return this.isEligibleForIntroOfferIOS;
    }

    public final Function2<String, Continuation<? super Boolean>, Object> isTransactionVerifiedIOS() {
        return this.isTransactionVerifiedIOS;
    }

    public final Function2<String, Continuation<? super PurchaseIOS>, Object> getLatestTransactionIOS() {
        return this.latestTransactionIOS;
    }

    public final Function2<String, Continuation<? super List<SubscriptionStatusIOS>>, Object> getSubscriptionStatusIOS() {
        return this.subscriptionStatusIOS;
    }

    public final Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResultIOS>, Object> getValidateReceiptIOS() {
        return this.validateReceiptIOS;
    }
}
