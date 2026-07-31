package androidx.compose.runtime;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.B5;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlotTable.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 Ý\u00012\u00020\u0001:\u0002Ý\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0019J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010\u0017J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u0019J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010+J\u001f\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010'J!\u00105\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010+JG\u0010@\u001a\u00020\f2\u0006\u0010:\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2&\u0010?\u001a\"\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0018\u00010;j\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0018\u0001`>H\u0002¢\u0006\u0004\b@\u0010AJ'\u0010D\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010'J\u0017\u0010E\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bH\u0010FJ\u001b\u0010#\u001a\u00020\t*\u00020I2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010JJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010FJ\u001b\u0010G\u001a\u00020\t*\u00020I2\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010JJ\u001b\u0010L\u001a\u00020\t*\u00020I2\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010JJ#\u0010M\u001a\u00020\u000f*\u00020I2\u0006\u0010K\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\u00020\t*\u00020I2\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010JJ\u001b\u0010P\u001a\u00020\t*\u00020I2\u0006\u0010K\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010JJ/\u0010S\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010TJ'\u0010V\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010FJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0014J\u0015\u0010[\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b[\u0010FJ\u0015\u0010\\\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b\\\u0010FJ\u0017\u0010]\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b]\u0010^J\u0015\u0010_\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b_\u0010FJ\u0017\u0010`\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b`\u0010^J\u0015\u0010a\u001a\u00020\f2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\ba\u0010\u0014J\u0015\u0010b\u001a\u00020\f2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\bb\u0010\u0014J\u001d\u0010c\u001a\u00020\f2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bc\u00103J\u0017\u0010d\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\bd\u0010^J\u0017\u0010d\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020<¢\u0006\u0004\bd\u0010eJ\u0015\u0010#\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b#\u0010FJ\u0015\u0010g\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\f¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020\u000f¢\u0006\u0004\bi\u0010\u0017J\u0019\u0010j\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bj\u0010\bJ\u001f\u0010k\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020<2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bk\u0010lJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\t¢\u0006\u0004\bn\u0010\u0019J\u0017\u0010o\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020\u000f¢\u0006\u0004\bq\u0010\u0017J\u0017\u0010r\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010pJ\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020<2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010lJ\u0017\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010pJ\u001d\u0010s\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\bs\u0010YJ)\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010tJ\u0017\u0010u\u001a\u0004\u0018\u00010\u00012\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bu\u0010^J\u000f\u0010v\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010wJ\u001f\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020<2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\bx\u0010yJ\u001f\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010z\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\bx\u0010{J\u0017\u0010}\u001a\u00020\t2\u0006\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b|\u0010FJ\u0017\u0010\u007f\u001a\u00020\t2\u0006\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b~\u0010FJ\u0017\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0005\b\u0080\u0001\u0010FJ\u0018\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\t¢\u0006\u0005\b\u0082\u0001\u0010\u0019J\u0018\u0010\u0083\u0001\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020<¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0085\u0001\u0010\u0017J\u000f\u0010\u0086\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0086\u0001\u0010\u0017J\u000f\u0010\u0087\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0087\u0001\u0010\u0017J\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0017J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u00106J!\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0089\u0001\u00106J,\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\"J\u0017\u0010\u008c\u0001\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\t¢\u0006\u0005\b\u008c\u0001\u0010\u0019J\u0018\u0010\u008c\u0001\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020<¢\u0006\u0006\b\u008c\u0001\u0010\u0084\u0001J\u000f\u0010\u008d\u0001\u001a\u00020\t¢\u0006\u0005\b\u008d\u0001\u0010\"J\u0010\u0010\u008e\u0001\u001a\u00020\f¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J6\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u001c\u0010\u0091\u0001\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000f0\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0018\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u0094\u0001\u001a\u00020\t¢\u0006\u0005\b\u0095\u0001\u0010\u0019J1\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020<0\u0097\u00012\u0006\u0010U\u001a\u00020<2\u0007\u0010\u0094\u0001\u001a\u00020\t2\u0007\u0010\u0096\u0001\u001a\u00020\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J2\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020<0\u0097\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\t2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\f¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J0\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020<0\u0097\u00012\u0007\u0010\u0094\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\t¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0018\u0010U\u001a\u00020<2\b\b\u0002\u0010(\u001a\u00020\t¢\u0006\u0005\bU\u0010\u009f\u0001J\u0019\u0010 \u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\b \u0001\u0010\u0019J\u0018\u0010¡\u0001\u001a\u00020\t2\u0006\u0010U\u001a\u00020<¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0013\u0010¤\u0001\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001c\u0010¨\u0001\u001a\u0004\u0018\u00010=2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001c\u0010ª\u0001\u001a\u0004\u0018\u00010<2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b©\u0001\u0010\u009f\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\"\u0010±\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R+\u0010µ\u0001\u001a\u0014\u0012\u0004\u0012\u00020<0³\u0001j\t\u0012\u0004\u0012\u00020<`´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R7\u0010?\u001a\"\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0018\u00010;j\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0018\u0001`>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010·\u0001R#\u0010º\u0001\u001a\f\u0012\u0005\u0012\u00030¹\u0001\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¼\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010½\u0001R\u0019\u0010¿\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010½\u0001R\u0019\u0010Á\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010½\u0001R\u0019\u0010Â\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010½\u0001R\u0019\u0010Ã\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010½\u0001R\u0019\u0010Ä\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010½\u0001R\u0017\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010½\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010Ç\u0001R\u0018\u0010É\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ç\u0001R+\u0010Ë\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ê\u0001\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010»\u0001R(\u0010Ì\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÌ\u0001\u0010½\u0001\u001a\u0005\bÍ\u0001\u0010\"R(\u0010Î\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÎ\u0001\u0010½\u0001\u001a\u0005\bÏ\u0001\u0010\"R&\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b#\u0010½\u0001\u001a\u0005\bÐ\u0001\u0010\"R)\u0010Ñ\u0001\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010\u008f\u0001R\u001b\u0010Ô\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010R\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\"R\u0014\u0010×\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b×\u0001\u0010\u008f\u0001R\u0012\u0010\r\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\r\u0010\u008f\u0001R\u0014\u0010Ù\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bØ\u0001\u0010\u008f\u0001R\u0014\u0010Û\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010\u008f\u0001R\u0015\u0010-\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\"¨\u0006Þ\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", B5.R, "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "value", "rawUpdate", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "key", "objectKey", "", "isNode", "aux", "", "startGroup", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "containsGroupMark", "(I)Z", "containsAnyGroupMarks", "recalculateMarks", "()V", "updateContainsMark", "(I)V", "Landroidx/compose/runtime/PrioritySet;", "set", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "()I", "parent", "endGroup", "firstChild", "fixParentAnchorsFor", "(III)V", "index", "moveGroupGapTo", "moveSlotGapTo", "(II)V", "clearSlotGap", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "(II)Z", "removeSlots", "updateNodeOfGroup", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "removeAnchors", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "moveAnchors", "groupIndexToAddress", "(I)I", "dataIndex", "dataIndexToDataAddress", "", "([II)I", "address", "slotIndex", "updateDataIndex", "([III)V", "nodeIndex", "auxIndex", "gapLen", "capacity", "dataIndexToDataAnchor", "(IIII)I", "anchor", "dataAnchorToDataIndex", "(III)I", "parentIndexToAnchor", "(II)I", "parentAnchorToIndex", "nodeCount", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "indexInGroup", "node", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "normalClose", "close", "(Z)V", TimerController.RESET_COMMAND, "update", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimTailSlots", "updateAux", "(Ljava/lang/Object;)V", "updateToTableMaps", "updateNode", "slotIndexOfGroupSlotIndex", "(IILjava/lang/Object;)Ljava/lang/Object;", "clear", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "slotsStartIndex$runtime", "slotsStartIndex", "slotsEndIndex$runtime", "slotsEndIndex", "groupSlotIndex", "amount", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "dataKey", "startNode", "startData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "ensureStarted", "skipGroup", "removeGroup", "()Z", "Lkotlin/Function2;", "block", "forAllDataInRememberOrder", "(ILkotlin/jvm/functions/Function2;)V", "offset", "moveGroup", "writer", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "toString", "()Ljava/lang/String;", "sourceInformationOf$runtime", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformationOf", "tryAnchor$runtime", "tryAnchor", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "groupGapStart", "I", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "Landroidx/collection/MutableObjectList;", "deferredSlotWrites", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "getParent", "closed", "Z", "getClosed", "pendingRecalculateMarks", "Landroidx/collection/MutableIntList;", "getCapacity", "isGroupEnd", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getSize$runtime", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotWriter {
    private ArrayList anchors;
    private MutableIntObjectMap calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap sourceInformationMap;
    private final SlotTable table;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors();
        this.sourceInformationMap = slotTable.getSourceInformationMap();
        this.calledByMap = slotTable.getCalledByMap();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    /* renamed from: getTable$runtime, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean isNode(int index) {
        return (this.groups[(groupIndexToAddress(index) * 5) + 1] & 1073741824) != 0;
    }

    public final int nodeCount(int index) {
        return this.groups[(groupIndexToAddress(index) * 5) + 1] & 67108863;
    }

    public final int groupKey(int index) {
        return this.groups[groupIndexToAddress(index) * 5];
    }

    public final Object groupObjectKey(int index) {
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & 536870912) == 0) {
            return null;
        }
        Object[] objArr = this.slots;
        objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, groupIndexToAddress);
        return objArr[objectKeyIndex];
    }

    public final int groupSize(int index) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
        return groupSize;
    }

    public final Object groupAux(int index) {
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        return (iArr[(groupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, groupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        return (index > i && index < this.currentGroupEnd) || (i == 0 && index == 0);
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int capacity;
        int groupSize;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (group > this.startStack.peekOr(0)) {
                groupSize = groupSize(group);
            } else {
                int indexOf = this.startStack.indexOf(group);
                if (indexOf < 0) {
                    groupSize = groupSize(group);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + group;
        }
        return index > group && index < capacity;
    }

    public final Object node(int index) {
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, groupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final Object update(Object value) {
        if (this.insertCount > 0 && this.currentSlot != this.slotsGapStart) {
            MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new MutableIntObjectMap(i2, i, defaultConstructorMarker);
            }
            this.deferredSlotWrites = mutableIntObjectMap;
            int i3 = this.parent;
            Object obj = mutableIntObjectMap.get(i3);
            if (obj == null) {
                obj = new MutableObjectList(i2, i, defaultConstructorMarker);
                mutableIntObjectMap.set(i3, obj);
            }
            ((MutableObjectList) obj).add(value);
            return Composer.INSTANCE.getEmpty();
        }
        return rawUpdate(value);
    }

    private final Object rawUpdate(Object value) {
        Object skip = skip();
        set(value);
        return skip;
    }

    public final void appendSlot(Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int anchorIndex = anchorIndex(anchor);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(anchorIndex + 1));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
        insertSlots(1, anchorIndex);
        if (i >= dataIndex) {
            i++;
            i2++;
        }
        this.slots[dataIndex] = value;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final void updateAux(Object value) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(groupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = value;
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap();
        this.calledByMap = this.table.getCalledByMap();
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateNode(Anchor anchor, Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final void set(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i = slotIndex + index;
        if (!(i >= slotIndex && i < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i;
    }

    public final Object set(int group, int index, Object value) {
        int dataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = value;
        return obj;
    }

    public final Object clear(int slotIndex) {
        int dataIndexToDataAddress = dataIndexToDataAddress(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = Composer.INSTANCE.getEmpty();
        return obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final Object slot(Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final Object slot(int groupIndex, int index) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i = index + slotIndex;
        if (slotIndex > i || i >= dataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final int slotsStartIndex$runtime(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final int slotsEndIndex$runtime(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int groupSlotIndex(int group) {
        MutableObjectList mutableObjectList;
        int slotsStartIndex$runtime = this.currentSlot - slotsStartIndex$runtime(group);
        MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
        return slotsStartIndex$runtime + ((mutableIntObjectMap == null || (mutableObjectList = (MutableObjectList) mutableIntObjectMap.get(group)) == null) ? 0 : mutableObjectList.get_size());
    }

    public final void advanceBy(int amount) {
        boolean z = false;
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i = this.currentGroup + amount;
        if (i >= this.parent && i <= this.currentGroupEnd) {
            z = true;
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int groupSize;
        int i;
        GroupSourceInformation sourceInformationOf$runtime;
        int i2 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i3 = this.currentGroup;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
            insertGroups(1);
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            int groupIndexToAddress = groupIndexToAddress(i3);
            Composer.Companion companion = Composer.INSTANCE;
            int i4 = objectKey != companion.getEmpty() ? 1 : 0;
            int i5 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (dataIndexToDataAnchor >= 0 && this.slotsGapOwner < i3) {
                dataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - dataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, key, isNode, i4, i5, this.parent, dataIndexToDataAnchor);
            int i6 = (isNode ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                insertSlots(i6, i3);
                Object[] objArr2 = this.slots;
                int i7 = this.currentSlot;
                if (isNode) {
                    objArr2[i7] = aux;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = objectKey;
                    i7++;
                }
                if (i5 != 0) {
                    objArr2[i7] = aux;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            i = i3 + 1;
            this.parent = i3;
            this.currentGroup = i;
            if (i2 >= 0 && (sourceInformationOf$runtime = sourceInformationOf$runtime(i2)) != null) {
                sourceInformationOf$runtime.reportGroup(this, i3);
            }
        } else {
            this.startStack.push(i2);
            saveCurrentGroupEnd();
            int i8 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i8);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(groupIndexToAddress2 * 5) + 1] & 67108863;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress2);
            i = i8 + groupSize;
        }
        this.currentGroupEnd = i;
    }

    public final int endGroup() {
        int groupSize;
        int groupSize2;
        MutableObjectList mutableObjectList;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        int i6 = (groupIndexToAddress * 5) + 1;
        boolean z2 = (this.groups[i6] & 1073741824) != 0;
        if (!z) {
            if (!(i == i2)) {
                ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            int[] iArr = this.groups;
            int i7 = iArr[i6] & 67108863;
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            int pop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = pop;
            int parent = parent(this.groups, i3);
            int pop2 = this.nodeCountStack.pop();
            this.nodeCount = pop2;
            if (parent == pop) {
                this.nodeCount = pop2 + (z2 ? 0 : i4 - i7);
            } else {
                int i8 = i5 - groupSize;
                int i9 = z2 ? 0 : i4 - i7;
                if (i8 != 0 || i9 != 0) {
                    while (parent != 0 && parent != pop && (i9 != 0 || i8 != 0)) {
                        int groupIndexToAddress2 = groupIndexToAddress(parent);
                        if (i8 != 0) {
                            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i8);
                        }
                        if (i9 != 0) {
                            int[] iArr2 = this.groups;
                            SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress2, (iArr2[(groupIndexToAddress2 * 5) + 1] & 67108863) + i9);
                        }
                        int[] iArr3 = this.groups;
                        if ((iArr3[(groupIndexToAddress2 * 5) + 1] & 1073741824) != 0) {
                            i9 = 0;
                        }
                        parent = parent(iArr3, parent);
                    }
                }
                this.nodeCount += i9;
            }
        } else {
            MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.get(i3)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i10 = mutableObjectList._size;
                for (int i11 = 0; i11 < i10; i11++) {
                    rawUpdate(objArr[i11]);
                }
            }
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i4);
            this.nodeCount = this.nodeCountStack.pop() + (z2 ? 1 : i4);
            int parent2 = parent(this.groups, i3);
            this.parent = parent2;
            int size$runtime = parent2 < 0 ? getSize$runtime() : groupIndexToAddress(parent2 + 1);
            int dataIndex = size$runtime >= 0 ? dataIndex(this.groups, size$runtime) : 0;
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
        }
        return i4;
    }

    public final void ensureStarted(int index) {
        boolean z = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (index >= i && index < this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i);
            }
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i4;
        }
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int groupSize;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = i + groupSize;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        int i3 = this.groups[(groupIndexToAddress * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final boolean removeGroup() {
        Anchor tryAnchor$runtime;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int skipGroup = skipGroup();
        GroupSourceInformation sourceInformationOf$runtime = sourceInformationOf$runtime(this.parent);
        if (sourceInformationOf$runtime != null && (tryAnchor$runtime = tryAnchor$runtime(i)) != null) {
            sourceInformationOf$runtime.removeAnchor(tryAnchor$runtime);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1116isNotEmptyimpl(mutableIntList) && PrioritySet.m1117peekimpl(mutableIntList) >= i) {
                PrioritySet.m1118takeMaximpl(mutableIntList);
            }
        }
        boolean removeGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(dataIndex, this.currentSlot - dataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= skipGroup;
        return removeGroups;
    }

    public final void forAllDataInRememberOrder(int group, Function2 block) {
        int i;
        int i2;
        Anchor after;
        Function2 function2 = block;
        int parent = parent(group);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(group) + group;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = group;
        MutableIntSet mutableIntSet = null;
        MutableIntList mutableIntList = null;
        while (i3 < groupSize) {
            int dataIndex = dataIndex(i3);
            int i4 = i3 + 1;
            int dataIndex2 = dataIndex(i4);
            while (true) {
                i = 0;
                if (dataIndex >= dataIndex2) {
                    break;
                }
                Object obj = this.slots[dataIndexToDataAddress(dataIndex)];
                if ((obj instanceof RememberObserverHolder) && (after = ((RememberObserverHolder) obj).getAfter()) != null && after.getValid()) {
                    int anchorIndex = anchorIndex(after);
                    if (mutableIntSet == null) {
                        mutableIntSet = IntSetKt.mutableIntSetOf();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new MutableIntList(i, 1, defaultConstructorMarker);
                    }
                    mutableIntSet.add(anchorIndex);
                    mutableIntList.add(anchorIndex);
                    mutableIntList.add(dataIndex);
                } else {
                    function2.invoke(Integer.valueOf(dataIndex), obj);
                }
                dataIndex++;
            }
            int parent2 = i4 < size$runtime ? parent(i4) : -1;
            if (parent2 != i3) {
                while (true) {
                    if (mutableIntList == null || mutableIntSet == null || !mutableIntSet.remove(i3)) {
                        i2 = size$runtime;
                    } else {
                        int i5 = mutableIntList._size;
                        int i6 = i5 / 2;
                        int i7 = i;
                        int i8 = i7;
                        while (i8 < i6) {
                            int i9 = i8 * 2;
                            int i10 = size$runtime;
                            int i11 = mutableIntList.get(i9);
                            if (i11 == i3) {
                                int i12 = mutableIntList.get(i9 + 1);
                                function2.invoke(Integer.valueOf(i12), this.slots[dataIndexToDataAddress(i12)]);
                            } else if (i9 != i7) {
                                int i13 = i7 + 1;
                                mutableIntList.set(i7, i11);
                                i7 += 2;
                                mutableIntList.set(i13, mutableIntList.get(i9 + 1));
                            } else {
                                i7 += 2;
                            }
                            i8++;
                            function2 = block;
                            size$runtime = i10;
                        }
                        i2 = size$runtime;
                        if (i7 != i5) {
                            mutableIntList.removeRange(i7, i5);
                        }
                    }
                    if (i3 != group && parent != parent2) {
                        i3 = parent;
                        size$runtime = i2;
                        i = 0;
                        parent = parent(parent);
                        function2 = block;
                    }
                }
            } else {
                i2 = size$runtime;
            }
            function2 = block;
            parent = parent2;
            i3 = i4;
            size$runtime = i2;
            defaultConstructorMarker = null;
        }
    }

    public final void moveGroup(int offset) {
        int groupSize;
        int groupSize2;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i2 = this.parent;
        int i3 = this.currentGroupEnd;
        int i4 = i;
        for (int i5 = offset; i5 > 0; i5--) {
            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
            i4 += groupSize2;
            if (!(i4 <= i3)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i4));
        int i6 = i4 + groupSize;
        int dataIndex3 = dataIndex(this.groups, groupIndexToAddress(i6));
        int i7 = dataIndex3 - dataIndex2;
        insertSlots(i7, Math.max(this.currentGroup - 1, 0));
        insertGroups(groupSize);
        int[] iArr = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i6) * 5;
        ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
        if (i7 > 0) {
            Object[] objArr = this.slots;
            int dataIndexToDataAddress = dataIndexToDataAddress(dataIndex2 + i7);
            System.arraycopy(objArr, dataIndexToDataAddress, objArr, dataIndex, dataIndexToDataAddress(dataIndex3 + i7) - dataIndexToDataAddress);
        }
        int i8 = dataIndex2 + i7;
        int i9 = i8 - dataIndex;
        int i10 = this.slotsGapStart;
        int i11 = this.slotsGapLen;
        int length = this.slots.length;
        int i12 = this.slotsGapOwner;
        int i13 = i + groupSize;
        int i14 = i;
        while (i14 < i13) {
            int groupIndexToAddress2 = groupIndexToAddress(i14);
            int i15 = i10;
            int i16 = i9;
            updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i9, i12 < groupIndexToAddress2 ? 0 : i15, i11, length));
            i14++;
            i10 = i15;
            i9 = i16;
        }
        moveAnchors(i6, i, groupSize);
        if (removeGroups(i6, groupSize)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i2, this.currentGroupEnd, i);
        if (i7 > 0) {
            removeSlots(i8, i7, i6 - 1);
        }
    }

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean z;
            int locationOf;
            int locationOf2;
            List list;
            int groupSize;
            int locationOf3;
            int groupSize2 = fromWriter.groupSize(fromIndex);
            int i = fromIndex + groupSize2;
            int dataIndex = fromWriter.dataIndex(fromIndex);
            int dataIndex2 = fromWriter.dataIndex(i);
            int i2 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(groupSize2);
            toWriter.insertSlots(i2, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i) {
                fromWriter.moveGroupGapTo(i);
            }
            if (fromWriter.slotsGapStart < dataIndex2) {
                fromWriter.moveSlotGapTo(dataIndex2, i);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i3 = currentGroup * 5;
            ArraysKt.copyInto(fromWriter.groups, iArr, i3, fromIndex * 5, i * 5);
            Object[] objArr = toWriter.slots;
            int i4 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, dataIndex, objArr, i4, i2);
            int parent = toWriter.getParent();
            iArr[i3 + 2] = parent;
            int i5 = currentGroup - fromIndex;
            int i6 = currentGroup + groupSize2;
            int dataIndex3 = i4 - toWriter.dataIndex(iArr, currentGroup);
            int i7 = toWriter.slotsGapOwner;
            int i8 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i9 = i7;
            int i10 = currentGroup;
            while (true) {
                z = false;
                if (i10 >= i6) {
                    break;
                }
                if (i10 != currentGroup) {
                    int i11 = (i10 * 5) + 2;
                    iArr[i11] = iArr[i11] + i5;
                }
                int i12 = currentGroup;
                int i13 = i6;
                iArr[(i10 * 5) + 4] = toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i10) + dataIndex3, i9 >= i10 ? toWriter.slotsGapStart : 0, i8, length);
                if (i10 == i9) {
                    i9++;
                }
                i10++;
                i6 = i13;
                currentGroup = i12;
            }
            int i14 = i6;
            toWriter.slotsGapOwner = i9;
            locationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime());
            locationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i, fromWriter.getSize$runtime());
            if (locationOf < locationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(locationOf2 - locationOf);
                for (int i15 = locationOf; i15 < locationOf2; i15++) {
                    Anchor anchor = (Anchor) arrayList.get(i15);
                    anchor.setLocation$runtime(anchor.getLocation() + i5);
                    arrayList2.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime());
                toWriter.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                list = arrayList2;
            } else {
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                HashMap hashMap = fromWriter.sourceInformationMap;
                HashMap hashMap2 = toWriter.sourceInformationMap;
                if (hashMap != null && hashMap2 != null) {
                    int size = list2.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        Anchor anchor2 = (Anchor) list.get(i16);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor2);
                        if (groupSourceInformation != null) {
                            hashMap.remove(anchor2);
                            hashMap2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation sourceInformationOf$runtime = toWriter.sourceInformationOf$runtime(parent);
            if (sourceInformationOf$runtime != null) {
                int i17 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i18 = -1;
                while (i17 < currentGroup2) {
                    groupSize = SlotTableKt.groupSize(toWriter.groups, i17);
                    int i19 = groupSize + i17;
                    i18 = i17;
                    i17 = i19;
                }
                sourceInformationOf$runtime.addGroupAfter(toWriter, i18, currentGroup2);
            }
            int parent3 = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (!updateFromCursor) {
                    z = fromWriter.removeGroups(fromIndex, groupSize2);
                    fromWriter.removeSlots(dataIndex, i2, fromIndex - 1);
                } else {
                    boolean z2 = parent3 >= 0;
                    if (z2) {
                        fromWriter.startGroup();
                        fromWriter.advanceBy(parent3 - fromWriter.getCurrentGroup());
                        fromWriter.startGroup();
                    }
                    fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                    boolean removeGroup = fromWriter.removeGroup();
                    if (z2) {
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                    }
                    z = removeGroup;
                }
            }
            if (z) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i20 = toWriter.nodeCount;
            int i21 = iArr[i3 + 1];
            toWriter.nodeCount = i20 + ((1073741824 & i21) == 0 ? i21 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i14;
                toWriter.currentSlot = i4 + i2;
            }
            if (containsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return list;
        }
    }

    public final List moveTo(Anchor anchor, int offset, SlotWriter writer) {
        int groupSize;
        if (!(writer.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int anchorIndex = anchorIndex(anchor) + offset;
        int i = this.currentGroup;
        if (!(i <= anchorIndex && anchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        int nodeCount = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        List moveGroup$default = Companion.moveGroup$default(INSTANCE, this, anchorIndex, writer, false, false, false, 32, null);
        updateContainsMark(parent);
        boolean z = nodeCount > 0;
        while (parent >= i) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z) {
                int[] iArr2 = this.groups;
                int i2 = iArr2[(groupIndexToAddress * 5) + 1];
                if ((1073741824 & i2) != 0) {
                    z = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, (i2 & 67108863) - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            if (!(this.nodeCount >= nodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    public final List moveFrom(SlotTable table, int index, boolean removeSourceGroup) {
        int groupSize;
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (index == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(table.getGroups(), index);
            if (groupSize == table.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList arrayList = this.anchors;
                HashMap hashMap = this.sourceInformationMap;
                MutableIntObjectMap mutableIntObjectMap = this.calledByMap;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                HashMap sourceInformationMap = table.getSourceInformationMap();
                MutableIntObjectMap calledByMap = table.getCalledByMap();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap;
                this.calledByMap = calledByMap;
                table.setTo$runtime(iArr, 0, objArr, 0, arrayList, hashMap, mutableIntObjectMap);
                return this.anchors;
            }
        }
        SlotWriter openWriter = table.openWriter();
        try {
            List moveGroup = INSTANCE.moveGroup(openWriter, index, this, true, true, removeSourceGroup);
            openWriter.close(true);
            return moveGroup;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final List moveIntoGroupFrom(int offset, SlotTable table, int index) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter openWriter = table.openWriter();
        try {
            List moveGroup$default = Companion.moveGroup$default(INSTANCE, openWriter, index, this, false, true, false, 32, null);
            openWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return moveGroup$default;
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final Anchor anchor(int index) {
        int search;
        ArrayList arrayList = this.anchors;
        search = SlotTableKt.search(arrayList, index, getSize$runtime());
        if (search < 0) {
            if (index > this.groupGapStart) {
                index = -(getSize$runtime() - index);
            }
            Anchor anchor = new Anchor(index);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return (Anchor) arrayList.get(search);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int group) {
        int groupIndexToAddress = groupIndexToAddress(group);
        int[] iArr = this.groups;
        int i = (groupIndexToAddress * 5) + 1;
        if ((iArr[i] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, groupIndexToAddress, true);
        if ((this.groups[i] & 67108864) != 0) {
            return;
        }
        updateContainsMark(parent(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 201326592) != 0;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1116isNotEmptyimpl(mutableIntList)) {
                m1131updateContainsMarkNowXpTMRCE(PrioritySet.m1118takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            MutableIntList mutableIntList = this.pendingRecalculateMarks;
            if (mutableIntList == null) {
                mutableIntList = PrioritySet.m1113constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntList;
            }
            PrioritySet.m1111addimpl(mutableIntList, group);
        }
    }

    /* renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m1131updateContainsMarkNowXpTMRCE(int group, MutableIntList set) {
        int groupIndexToAddress = groupIndexToAddress(group);
        boolean childContainsAnyMarks = childContainsAnyMarks(group);
        int[] iArr = this.groups;
        if (((iArr[(groupIndexToAddress * 5) + 1] & 67108864) != 0) != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(group);
            if (parent >= 0) {
                PrioritySet.m1111addimpl(set, parent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int group) {
        int i = group + 1;
        int groupSize = group + groupSize(group);
        while (i < groupSize) {
            if ((this.groups[(groupIndexToAddress(i) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i += groupSize(i);
        }
        return false;
    }

    public final int anchorIndex(Anchor anchor) {
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime() : location;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(groupIndexToAddress(firstChild) * 5) + 2] = parentIndexToAnchor;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild));
            int i = groupSize + firstChild;
            fixParentAnchorsFor(firstChild, i, firstChild + 1);
            firstChild = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i2, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = index * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (index < i2) {
                    ArraysKt.copyInto(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (index < i2) {
                i2 = index + i;
            }
            int capacity = getCapacity();
            if (!(i2 < capacity)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i2 < capacity) {
                int i6 = (i2 * 5) + 2;
                int i7 = this.groups[i6];
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i7), index);
                if (parentIndexToAnchor != i7) {
                    this.groups[i6] = parentIndexToAnchor;
                }
                i2++;
                if (i2 == index) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != index) {
            Object[] objArr = this.slots;
            if (index < i2) {
                System.arraycopy(objArr, index, objArr, index + i, i2 - index);
            } else {
                int i4 = i2 + i;
                System.arraycopy(objArr, i4, objArr, i2, (index + i) - i4);
            }
        }
        int min = Math.min(group + 1, getSize$runtime());
        if (i3 != min) {
            int length = this.slots.length - i;
            if (min < i3) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i3);
                int i5 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int i6 = (groupIndexToAddress * 5) + 4;
                    int i7 = this.groups[i6];
                    if (!(i7 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i6] = -((length - i7) + 1);
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i5) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i3);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int i8 = (groupIndexToAddress3 * 5) + 4;
                    int i9 = this.groups[i8];
                    if (!(i9 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i8] = i9 + length + 1;
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = index;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < size) {
                int max = Math.max(Math.max(length * 2, i4 + size), 32);
                int[] iArr2 = new int[max * 5];
                int i5 = max - i4;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + size;
            }
            int i7 = i2 + size;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - size;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i4 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                this.groups[(i8 * 5) + 4] = dataIndexToDataAnchor;
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int max = Math.max(Math.max(length * 2, i3 + size), 32);
                Object[] objArr2 = new Object[max];
                for (int i4 = 0; i4 < max; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = max - i3;
                int i6 = i2 + i;
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i6, objArr2, i + i5, length - i6);
                this.slots = objArr2;
                i2 = i5;
            }
            int i7 = this.currentSlotEnd;
            if (i7 >= i) {
                this.currentSlotEnd = i7 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList arrayList = this.anchors;
            moveGroupGapTo(start);
            r0 = arrayList.isEmpty() ? false : removeAnchors(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = Math.max(start, i - len);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - len;
            }
            int i3 = this.parent;
            if (containsGroupMark(i3)) {
                updateContainsMark(i3);
            }
        }
        return r0;
    }

    public final GroupSourceInformation sourceInformationOf$runtime(int group) {
        Anchor tryAnchor$runtime;
        HashMap hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime = tryAnchor$runtime(group)) == null) {
            return null;
        }
        return (GroupSourceInformation) hashMap.get(tryAnchor$runtime);
    }

    public final Anchor tryAnchor$runtime(int group) {
        Anchor find;
        if (group < 0 || group >= getSize$runtime()) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, group, getSize$runtime());
        return find;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i2 = start + len;
            moveSlotGapTo(i2, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            ArraysKt.fill(this.slots, (Object) null, start, i2);
            int i3 = this.currentSlotEnd;
            if (i3 >= start) {
                this.currentSlotEnd = i3 - len;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNodeOfGroup(int index, Object value) {
        int groupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        boolean z = groupIndexToAddress < iArr.length;
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = value;
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        int locationOf;
        Anchor anchor;
        int location;
        int locationOf2;
        Anchor anchor2;
        int location2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart < newGapStart) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); locationOf2 < this.anchors.size() && (location2 = (anchor2 = (Anchor) this.anchors.get(locationOf2)).getLocation()) < 0 && (i = location2 + capacity) < newGapStart; locationOf2++) {
                anchor2.setLocation$runtime(i);
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); locationOf < this.anchors.size() && (location = (anchor = (Anchor) this.anchors.get(locationOf)).getLocation()) >= 0; locationOf++) {
            anchor.setLocation$runtime(-(capacity - location));
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap sourceInformationMap) {
        int locationOf;
        int i = size + gapStart;
        locationOf = SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i2 = locationOf + 1;
        int i3 = 0;
        while (locationOf >= 0) {
            Anchor anchor = (Anchor) this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < gapStart) {
                break;
            }
            if (anchorIndex < i) {
                anchor.setLocation$runtime(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                }
                if (i3 == 0) {
                    i3 = locationOf + 1;
                }
                i2 = locationOf;
            }
            locationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        int locationOf;
        int locationOf2;
        Anchor anchor;
        int anchorIndex;
        int i = size + originalLocation;
        int size$runtime = getSize$runtime();
        locationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = (Anchor) this.anchors.get(locationOf)))) >= originalLocation && anchorIndex < i) {
                arrayList.add(anchor);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Anchor anchor2 = (Anchor) arrayList.get(i3);
            int anchorIndex2 = anchorIndex(anchor2) + i2;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime(-(size$runtime - anchorIndex2));
            } else {
                anchor2.setLocation$runtime(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int groupIndexToAddress(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i) * 5) + 2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return dataIndex(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime() - index) + 2);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime() + index + 2;
    }

    public final void trimTailSlots(int count) {
        if (!(count > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.parent;
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1)) - count;
        if (!(dataIndex >= slotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(dataIndex, count, i);
        int i2 = this.currentSlot;
        if (i2 >= slotIndex) {
            this.currentSlot = i2 - count;
        }
    }
}
