package sqip.internal.event;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.internal.BuildConfig;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0003\b¦\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0010\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010+\u001a\u00020\u0010\u0012\u0006\u0010,\u001a\u00020\u0010\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010/\u001a\u00020\n\u0012\u0006\u00100\u001a\u00020\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0010\u0012\b\b\u0002\u0010:\u001a\u00020\u0005\u0012\b\b\u0002\u0010;\u001a\u00020\u0005\u0012\b\b\u0002\u0010<\u001a\u00020\u0005\u0012\b\b\u0002\u0010=\u001a\u00020\u0005¢\u0006\u0002\u0010>J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0010HÆ\u0003J\t\u0010~\u001a\u00020\u0010HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\nHÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\nHÆ\u0003J\n\u0010°\u0001\u001a\u00020\nHÆ\u0003J\n\u0010±\u0001\u001a\u00020\nHÆ\u0003J\n\u0010²\u0001\u001a\u00020\nHÆ\u0003JÚ\u0004\u0010³\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00102\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u00102\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020\u00052\b\b\u0002\u0010=\u001a\u00020\u0005HÆ\u0001J\n\u0010´\u0001\u001a\u00020\u0010HÖ\u0001J\u0016\u0010µ\u0001\u001a\u00020\n2\n\u0010¶\u0001\u001a\u0005\u0018\u00010·\u0001HÖ\u0003J\n\u0010¸\u0001\u001a\u00020\u0010HÖ\u0001J\n\u0010¹\u0001\u001a\u00020\u0005HÖ\u0001J\u001e\u0010º\u0001\u001a\u00030»\u00012\b\u0010¼\u0001\u001a\u00030½\u00012\u0007\u0010¾\u0001\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0011\u0010;\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010CR\u0011\u00109\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bI\u0010ER\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010ER\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010CR\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010ER\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bM\u0010ER\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010CR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010OR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bT\u0010OR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bU\u0010OR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bV\u0010OR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010OR\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bX\u0010OR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010CR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010ER\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ER\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010CR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010CR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010CR\u0011\u0010&\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b_\u0010ER\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010CR\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0013\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010CR\u0011\u0010+\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bc\u0010ER\u0011\u0010,\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bd\u0010ER\u0013\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010CR\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010CR\u0013\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0013\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bh\u0010CR\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010CR\u0011\u0010/\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bj\u0010OR\u0013\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010CR\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bl\u0010CR\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u0011\u0010 \u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bn\u0010ER\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010CR\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bp\u0010CR\u0013\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bq\u0010CR\u0013\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010CR\u0013\u00106\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bs\u0010CR\u0013\u00107\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010CR\u0013\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bu\u0010CR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bv\u0010CR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010@R\u0013\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bx\u0010CR\u0011\u0010<\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\by\u0010CR\u0011\u0010=\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bz\u0010C¨\u0006¿\u0001"}, d2 = {"Lsqip/internal/event/IapEventJsonData;", "Landroid/os/Parcelable;", "recordedAtMs", "", "sqip_base_square_application_id", "", "sqip_base_device_locale_country_code", "sqip_base_device_language", "sqip_base_square_device_id", "sqip_base_has_flutter_plugin", "", "sqip_base_has_flutter", "sqip_base_has_react_native", "sqip_base_has_react_native_plugin", "sqip_base_orientation", "sqip_base_screen_width_pixels", "", "sqip_base_screen_height_pixels", "sqip_base_time_zone", "sqip_base_is_app_debug_build", "sqip_base_is_sdk_debug_build", "sqip_android_base_app_package_name", "sqip_android_base_app_version_name", "sqip_android_base_app_version_code", "sqip_android_base_target_api_version", "sqip_android_base_min_api_version", "sqip_android_base_screen_density_dpi", "sqip_android_base_apk_byte_size", "sqip_android_base_uses_androidx", "sqip_android_base_process_uuid", "sqip_card_entry_base_name", "sqip_card_entry_base_session_uuid", "sqip_card_entry_base_session_order", "sqip_card_entry_base_theme", "sqip_card_entry_base_validation_error_field", "sqip_card_entry_base_nonce_error_code", "sqip_card_entry_base_app_error_message", "sqip_card_entry_base_flow_type", "sqip_card_entry_base_amount", "sqip_card_entry_base_buyer_action", "sqip_card_entry_base_contact_empty_fields", "sqip_card_entry_base_currency", "sqip_card_entry_base_location_id", "sqip_card_entry_base_challenges_completed_count", "sqip_card_entry_base_challenges_total_count", "sqip_card_entry_base_error_code", "sqip_card_entry_base_error_description", "sqip_card_entry_base_has_challenged_user", "sqip_card_entry_base_verification_duration_in_milliseconds", "sqip_card_entry_base_three_ds_trans_status", "sqip_card_entry_base_challenge_type", "sqip_card_entry_base_verification_token", "sqip_card_entry_base_three_ds_server_trans_id", "sqip_card_entry_base_three_ds_warning_severity", "sqip_card_entry_base_three_ds_warning_code", "sqip_card_entry_base_three_ds_warning_description", "sqip_base_device_model", "sqip_android_base_device_sdk_int", "sqip_android_base_device_manufacturer", "sqip_android_base_device_brand", "u_library_name", "u_library_version", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;IILjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;IIIIJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecordedAtMs", "()J", "getSqip_android_base_apk_byte_size", "getSqip_android_base_app_package_name", "()Ljava/lang/String;", "getSqip_android_base_app_version_code", "()I", "getSqip_android_base_app_version_name", "getSqip_android_base_device_brand", "getSqip_android_base_device_manufacturer", "getSqip_android_base_device_sdk_int", "getSqip_android_base_min_api_version", "getSqip_android_base_process_uuid", "getSqip_android_base_screen_density_dpi", "getSqip_android_base_target_api_version", "getSqip_android_base_uses_androidx", "()Z", "getSqip_base_device_language", "getSqip_base_device_locale_country_code", "getSqip_base_device_model", "getSqip_base_has_flutter", "getSqip_base_has_flutter_plugin", "getSqip_base_has_react_native", "getSqip_base_has_react_native_plugin", "getSqip_base_is_app_debug_build", "getSqip_base_is_sdk_debug_build", "getSqip_base_orientation", "getSqip_base_screen_height_pixels", "getSqip_base_screen_width_pixels", "getSqip_base_square_application_id", "getSqip_base_square_device_id", "getSqip_base_time_zone", "getSqip_card_entry_base_amount", "getSqip_card_entry_base_app_error_message", "getSqip_card_entry_base_buyer_action", "getSqip_card_entry_base_challenge_type", "getSqip_card_entry_base_challenges_completed_count", "getSqip_card_entry_base_challenges_total_count", "getSqip_card_entry_base_contact_empty_fields", "getSqip_card_entry_base_currency", "getSqip_card_entry_base_error_code", "getSqip_card_entry_base_error_description", "getSqip_card_entry_base_flow_type", "getSqip_card_entry_base_has_challenged_user", "getSqip_card_entry_base_location_id", "getSqip_card_entry_base_name", "getSqip_card_entry_base_nonce_error_code", "getSqip_card_entry_base_session_order", "getSqip_card_entry_base_session_uuid", "getSqip_card_entry_base_theme", "getSqip_card_entry_base_three_ds_server_trans_id", "getSqip_card_entry_base_three_ds_trans_status", "getSqip_card_entry_base_three_ds_warning_code", "getSqip_card_entry_base_three_ds_warning_description", "getSqip_card_entry_base_three_ds_warning_severity", "getSqip_card_entry_base_validation_error_field", "getSqip_card_entry_base_verification_duration_in_milliseconds", "getSqip_card_entry_base_verification_token", "getU_library_name", "getU_library_version", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IapEventJsonData implements Parcelable {
    public static final Parcelable.Creator<IapEventJsonData> CREATOR = new Creator();
    private final transient long recordedAtMs;
    private final long sqip_android_base_apk_byte_size;
    private final String sqip_android_base_app_package_name;
    private final int sqip_android_base_app_version_code;
    private final String sqip_android_base_app_version_name;
    private final String sqip_android_base_device_brand;
    private final String sqip_android_base_device_manufacturer;
    private final int sqip_android_base_device_sdk_int;
    private final int sqip_android_base_min_api_version;
    private final String sqip_android_base_process_uuid;
    private final int sqip_android_base_screen_density_dpi;
    private final int sqip_android_base_target_api_version;
    private final boolean sqip_android_base_uses_androidx;
    private final String sqip_base_device_language;
    private final String sqip_base_device_locale_country_code;
    private final String sqip_base_device_model;
    private final boolean sqip_base_has_flutter;
    private final boolean sqip_base_has_flutter_plugin;
    private final boolean sqip_base_has_react_native;
    private final boolean sqip_base_has_react_native_plugin;
    private final boolean sqip_base_is_app_debug_build;
    private final boolean sqip_base_is_sdk_debug_build;
    private final String sqip_base_orientation;
    private final int sqip_base_screen_height_pixels;
    private final int sqip_base_screen_width_pixels;
    private final String sqip_base_square_application_id;
    private final String sqip_base_square_device_id;
    private final String sqip_base_time_zone;
    private final int sqip_card_entry_base_amount;
    private final String sqip_card_entry_base_app_error_message;
    private final String sqip_card_entry_base_buyer_action;
    private final String sqip_card_entry_base_challenge_type;
    private final int sqip_card_entry_base_challenges_completed_count;
    private final int sqip_card_entry_base_challenges_total_count;
    private final String sqip_card_entry_base_contact_empty_fields;
    private final String sqip_card_entry_base_currency;
    private final String sqip_card_entry_base_error_code;
    private final String sqip_card_entry_base_error_description;
    private final String sqip_card_entry_base_flow_type;
    private final boolean sqip_card_entry_base_has_challenged_user;
    private final String sqip_card_entry_base_location_id;
    private final String sqip_card_entry_base_name;
    private final String sqip_card_entry_base_nonce_error_code;
    private final int sqip_card_entry_base_session_order;
    private final String sqip_card_entry_base_session_uuid;
    private final String sqip_card_entry_base_theme;
    private final String sqip_card_entry_base_three_ds_server_trans_id;
    private final String sqip_card_entry_base_three_ds_trans_status;
    private final String sqip_card_entry_base_three_ds_warning_code;
    private final String sqip_card_entry_base_three_ds_warning_description;
    private final String sqip_card_entry_base_three_ds_warning_severity;
    private final String sqip_card_entry_base_validation_error_field;
    private final long sqip_card_entry_base_verification_duration_in_milliseconds;
    private final String sqip_card_entry_base_verification_token;
    private final String u_library_name;
    private final String u_library_version;

    public IapEventJsonData(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i, int i2, String str6, boolean z5, boolean z6, String str7, String str8, int i3, int i4, int i5, int i6, long j2, boolean z7, String str9, String str10, String str11, int i7, String str12, String str13, String str14, String str15, String str16, int i8, String str17, String str18, String str19, String str20, int i9, int i10, String str21, String str22, boolean z8, long j3, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i11, String str31, String str32, String str33, String str34) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, str12, str16, str30, str31);
        re$$ExternalSyntheticOutline0.m1432m(str32, str33, str34);
        this.recordedAtMs = j;
        this.sqip_base_square_application_id = str;
        this.sqip_base_device_locale_country_code = str2;
        this.sqip_base_device_language = str3;
        this.sqip_base_square_device_id = str4;
        this.sqip_base_has_flutter_plugin = z;
        this.sqip_base_has_flutter = z2;
        this.sqip_base_has_react_native = z3;
        this.sqip_base_has_react_native_plugin = z4;
        this.sqip_base_orientation = str5;
        this.sqip_base_screen_width_pixels = i;
        this.sqip_base_screen_height_pixels = i2;
        this.sqip_base_time_zone = str6;
        this.sqip_base_is_app_debug_build = z5;
        this.sqip_base_is_sdk_debug_build = z6;
        this.sqip_android_base_app_package_name = str7;
        this.sqip_android_base_app_version_name = str8;
        this.sqip_android_base_app_version_code = i3;
        this.sqip_android_base_target_api_version = i4;
        this.sqip_android_base_min_api_version = i5;
        this.sqip_android_base_screen_density_dpi = i6;
        this.sqip_android_base_apk_byte_size = j2;
        this.sqip_android_base_uses_androidx = z7;
        this.sqip_android_base_process_uuid = str9;
        this.sqip_card_entry_base_name = str10;
        this.sqip_card_entry_base_session_uuid = str11;
        this.sqip_card_entry_base_session_order = i7;
        this.sqip_card_entry_base_theme = str12;
        this.sqip_card_entry_base_validation_error_field = str13;
        this.sqip_card_entry_base_nonce_error_code = str14;
        this.sqip_card_entry_base_app_error_message = str15;
        this.sqip_card_entry_base_flow_type = str16;
        this.sqip_card_entry_base_amount = i8;
        this.sqip_card_entry_base_buyer_action = str17;
        this.sqip_card_entry_base_contact_empty_fields = str18;
        this.sqip_card_entry_base_currency = str19;
        this.sqip_card_entry_base_location_id = str20;
        this.sqip_card_entry_base_challenges_completed_count = i9;
        this.sqip_card_entry_base_challenges_total_count = i10;
        this.sqip_card_entry_base_error_code = str21;
        this.sqip_card_entry_base_error_description = str22;
        this.sqip_card_entry_base_has_challenged_user = z8;
        this.sqip_card_entry_base_verification_duration_in_milliseconds = j3;
        this.sqip_card_entry_base_three_ds_trans_status = str23;
        this.sqip_card_entry_base_challenge_type = str24;
        this.sqip_card_entry_base_verification_token = str25;
        this.sqip_card_entry_base_three_ds_server_trans_id = str26;
        this.sqip_card_entry_base_three_ds_warning_severity = str27;
        this.sqip_card_entry_base_three_ds_warning_code = str28;
        this.sqip_card_entry_base_three_ds_warning_description = str29;
        this.sqip_base_device_model = str30;
        this.sqip_android_base_device_sdk_int = i11;
        this.sqip_android_base_device_manufacturer = str31;
        this.sqip_android_base_device_brand = str32;
        this.u_library_name = str33;
        this.u_library_version = str34;
    }

    public static /* synthetic */ IapEventJsonData copy$default(IapEventJsonData iapEventJsonData, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i, int i2, String str6, boolean z5, boolean z6, String str7, String str8, int i3, int i4, int i5, int i6, long j2, boolean z7, String str9, String str10, String str11, int i7, String str12, String str13, String str14, String str15, String str16, int i8, String str17, String str18, String str19, String str20, int i9, int i10, String str21, String str22, boolean z8, long j3, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i11, String str31, String str32, String str33, String str34, int i12, int i13, Object obj) {
        long j4 = (i12 & 1) != 0 ? iapEventJsonData.recordedAtMs : j;
        String str35 = (i12 & 2) != 0 ? iapEventJsonData.sqip_base_square_application_id : str;
        String str36 = (i12 & 4) != 0 ? iapEventJsonData.sqip_base_device_locale_country_code : str2;
        String str37 = (i12 & 8) != 0 ? iapEventJsonData.sqip_base_device_language : str3;
        String str38 = (i12 & 16) != 0 ? iapEventJsonData.sqip_base_square_device_id : str4;
        boolean z9 = (i12 & 32) != 0 ? iapEventJsonData.sqip_base_has_flutter_plugin : z;
        boolean z10 = (i12 & 64) != 0 ? iapEventJsonData.sqip_base_has_flutter : z2;
        boolean z11 = (i12 & 128) != 0 ? iapEventJsonData.sqip_base_has_react_native : z3;
        boolean z12 = (i12 & 256) != 0 ? iapEventJsonData.sqip_base_has_react_native_plugin : z4;
        String str39 = (i12 & 512) != 0 ? iapEventJsonData.sqip_base_orientation : str5;
        int i14 = (i12 & 1024) != 0 ? iapEventJsonData.sqip_base_screen_width_pixels : i;
        int i15 = (i12 & 2048) != 0 ? iapEventJsonData.sqip_base_screen_height_pixels : i2;
        long j5 = j4;
        String str40 = (i12 & 4096) != 0 ? iapEventJsonData.sqip_base_time_zone : str6;
        boolean z13 = (i12 & PKIFailureInfo.certRevoked) != 0 ? iapEventJsonData.sqip_base_is_app_debug_build : z5;
        String str41 = str40;
        boolean z14 = (i12 & 16384) != 0 ? iapEventJsonData.sqip_base_is_sdk_debug_build : z6;
        return iapEventJsonData.copy(j5, str35, str36, str37, str38, z9, z10, z11, z12, str39, i14, i15, str41, z13, z14, (i12 & 32768) != 0 ? iapEventJsonData.sqip_android_base_app_package_name : str7, (i12 & 65536) != 0 ? iapEventJsonData.sqip_android_base_app_version_name : str8, (i12 & PKIFailureInfo.unsupportedVersion) != 0 ? iapEventJsonData.sqip_android_base_app_version_code : i3, (i12 & PKIFailureInfo.transactionIdInUse) != 0 ? iapEventJsonData.sqip_android_base_target_api_version : i4, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? iapEventJsonData.sqip_android_base_min_api_version : i5, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? iapEventJsonData.sqip_android_base_screen_density_dpi : i6, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? iapEventJsonData.sqip_android_base_apk_byte_size : j2, (i12 & 4194304) != 0 ? iapEventJsonData.sqip_android_base_uses_androidx : z7, (i12 & 8388608) != 0 ? iapEventJsonData.sqip_android_base_process_uuid : str9, (i12 & 16777216) != 0 ? iapEventJsonData.sqip_card_entry_base_name : str10, (i12 & 33554432) != 0 ? iapEventJsonData.sqip_card_entry_base_session_uuid : str11, (i12 & 67108864) != 0 ? iapEventJsonData.sqip_card_entry_base_session_order : i7, (i12 & 134217728) != 0 ? iapEventJsonData.sqip_card_entry_base_theme : str12, (i12 & 268435456) != 0 ? iapEventJsonData.sqip_card_entry_base_validation_error_field : str13, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? iapEventJsonData.sqip_card_entry_base_nonce_error_code : str14, (i12 & 1073741824) != 0 ? iapEventJsonData.sqip_card_entry_base_app_error_message : str15, (i12 & PKIFailureInfo.systemUnavail) != 0 ? iapEventJsonData.sqip_card_entry_base_flow_type : str16, (i13 & 1) != 0 ? iapEventJsonData.sqip_card_entry_base_amount : i8, (i13 & 2) != 0 ? iapEventJsonData.sqip_card_entry_base_buyer_action : str17, (i13 & 4) != 0 ? iapEventJsonData.sqip_card_entry_base_contact_empty_fields : str18, (i13 & 8) != 0 ? iapEventJsonData.sqip_card_entry_base_currency : str19, (i13 & 16) != 0 ? iapEventJsonData.sqip_card_entry_base_location_id : str20, (i13 & 32) != 0 ? iapEventJsonData.sqip_card_entry_base_challenges_completed_count : i9, (i13 & 64) != 0 ? iapEventJsonData.sqip_card_entry_base_challenges_total_count : i10, (i13 & 128) != 0 ? iapEventJsonData.sqip_card_entry_base_error_code : str21, (i13 & 256) != 0 ? iapEventJsonData.sqip_card_entry_base_error_description : str22, (i13 & 512) != 0 ? iapEventJsonData.sqip_card_entry_base_has_challenged_user : z8, (i13 & 1024) != 0 ? iapEventJsonData.sqip_card_entry_base_verification_duration_in_milliseconds : j3, (i13 & 2048) != 0 ? iapEventJsonData.sqip_card_entry_base_three_ds_trans_status : str23, (i13 & 4096) != 0 ? iapEventJsonData.sqip_card_entry_base_challenge_type : str24, (i13 & PKIFailureInfo.certRevoked) != 0 ? iapEventJsonData.sqip_card_entry_base_verification_token : str25, (i13 & 16384) != 0 ? iapEventJsonData.sqip_card_entry_base_three_ds_server_trans_id : str26, (i13 & 32768) != 0 ? iapEventJsonData.sqip_card_entry_base_three_ds_warning_severity : str27, (i13 & 65536) != 0 ? iapEventJsonData.sqip_card_entry_base_three_ds_warning_code : str28, (i13 & PKIFailureInfo.unsupportedVersion) != 0 ? iapEventJsonData.sqip_card_entry_base_three_ds_warning_description : str29, (i13 & PKIFailureInfo.transactionIdInUse) != 0 ? iapEventJsonData.sqip_base_device_model : str30, (i13 & PKIFailureInfo.signerNotTrusted) != 0 ? iapEventJsonData.sqip_android_base_device_sdk_int : i11, (i13 & PKIFailureInfo.badCertTemplate) != 0 ? iapEventJsonData.sqip_android_base_device_manufacturer : str31, (i13 & PKIFailureInfo.badSenderNonce) != 0 ? iapEventJsonData.sqip_android_base_device_brand : str32, (i13 & 4194304) != 0 ? iapEventJsonData.u_library_name : str33, (i13 & 8388608) != 0 ? iapEventJsonData.u_library_version : str34);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRecordedAtMs() {
        return this.recordedAtMs;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSqip_base_orientation() {
        return this.sqip_base_orientation;
    }

    /* renamed from: component11, reason: from getter */
    public final int getSqip_base_screen_width_pixels() {
        return this.sqip_base_screen_width_pixels;
    }

    /* renamed from: component12, reason: from getter */
    public final int getSqip_base_screen_height_pixels() {
        return this.sqip_base_screen_height_pixels;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSqip_base_time_zone() {
        return this.sqip_base_time_zone;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getSqip_base_is_app_debug_build() {
        return this.sqip_base_is_app_debug_build;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getSqip_base_is_sdk_debug_build() {
        return this.sqip_base_is_sdk_debug_build;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSqip_android_base_app_package_name() {
        return this.sqip_android_base_app_package_name;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSqip_android_base_app_version_name() {
        return this.sqip_android_base_app_version_name;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSqip_android_base_app_version_code() {
        return this.sqip_android_base_app_version_code;
    }

    /* renamed from: component19, reason: from getter */
    public final int getSqip_android_base_target_api_version() {
        return this.sqip_android_base_target_api_version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSqip_base_square_application_id() {
        return this.sqip_base_square_application_id;
    }

    /* renamed from: component20, reason: from getter */
    public final int getSqip_android_base_min_api_version() {
        return this.sqip_android_base_min_api_version;
    }

    /* renamed from: component21, reason: from getter */
    public final int getSqip_android_base_screen_density_dpi() {
        return this.sqip_android_base_screen_density_dpi;
    }

    /* renamed from: component22, reason: from getter */
    public final long getSqip_android_base_apk_byte_size() {
        return this.sqip_android_base_apk_byte_size;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getSqip_android_base_uses_androidx() {
        return this.sqip_android_base_uses_androidx;
    }

    /* renamed from: component24, reason: from getter */
    public final String getSqip_android_base_process_uuid() {
        return this.sqip_android_base_process_uuid;
    }

    /* renamed from: component25, reason: from getter */
    public final String getSqip_card_entry_base_name() {
        return this.sqip_card_entry_base_name;
    }

    /* renamed from: component26, reason: from getter */
    public final String getSqip_card_entry_base_session_uuid() {
        return this.sqip_card_entry_base_session_uuid;
    }

    /* renamed from: component27, reason: from getter */
    public final int getSqip_card_entry_base_session_order() {
        return this.sqip_card_entry_base_session_order;
    }

    /* renamed from: component28, reason: from getter */
    public final String getSqip_card_entry_base_theme() {
        return this.sqip_card_entry_base_theme;
    }

    /* renamed from: component29, reason: from getter */
    public final String getSqip_card_entry_base_validation_error_field() {
        return this.sqip_card_entry_base_validation_error_field;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSqip_base_device_locale_country_code() {
        return this.sqip_base_device_locale_country_code;
    }

    /* renamed from: component30, reason: from getter */
    public final String getSqip_card_entry_base_nonce_error_code() {
        return this.sqip_card_entry_base_nonce_error_code;
    }

    /* renamed from: component31, reason: from getter */
    public final String getSqip_card_entry_base_app_error_message() {
        return this.sqip_card_entry_base_app_error_message;
    }

    /* renamed from: component32, reason: from getter */
    public final String getSqip_card_entry_base_flow_type() {
        return this.sqip_card_entry_base_flow_type;
    }

    /* renamed from: component33, reason: from getter */
    public final int getSqip_card_entry_base_amount() {
        return this.sqip_card_entry_base_amount;
    }

    /* renamed from: component34, reason: from getter */
    public final String getSqip_card_entry_base_buyer_action() {
        return this.sqip_card_entry_base_buyer_action;
    }

    /* renamed from: component35, reason: from getter */
    public final String getSqip_card_entry_base_contact_empty_fields() {
        return this.sqip_card_entry_base_contact_empty_fields;
    }

    /* renamed from: component36, reason: from getter */
    public final String getSqip_card_entry_base_currency() {
        return this.sqip_card_entry_base_currency;
    }

    /* renamed from: component37, reason: from getter */
    public final String getSqip_card_entry_base_location_id() {
        return this.sqip_card_entry_base_location_id;
    }

    /* renamed from: component38, reason: from getter */
    public final int getSqip_card_entry_base_challenges_completed_count() {
        return this.sqip_card_entry_base_challenges_completed_count;
    }

    /* renamed from: component39, reason: from getter */
    public final int getSqip_card_entry_base_challenges_total_count() {
        return this.sqip_card_entry_base_challenges_total_count;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSqip_base_device_language() {
        return this.sqip_base_device_language;
    }

    /* renamed from: component40, reason: from getter */
    public final String getSqip_card_entry_base_error_code() {
        return this.sqip_card_entry_base_error_code;
    }

    /* renamed from: component41, reason: from getter */
    public final String getSqip_card_entry_base_error_description() {
        return this.sqip_card_entry_base_error_description;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getSqip_card_entry_base_has_challenged_user() {
        return this.sqip_card_entry_base_has_challenged_user;
    }

    /* renamed from: component43, reason: from getter */
    public final long getSqip_card_entry_base_verification_duration_in_milliseconds() {
        return this.sqip_card_entry_base_verification_duration_in_milliseconds;
    }

    /* renamed from: component44, reason: from getter */
    public final String getSqip_card_entry_base_three_ds_trans_status() {
        return this.sqip_card_entry_base_three_ds_trans_status;
    }

    /* renamed from: component45, reason: from getter */
    public final String getSqip_card_entry_base_challenge_type() {
        return this.sqip_card_entry_base_challenge_type;
    }

    /* renamed from: component46, reason: from getter */
    public final String getSqip_card_entry_base_verification_token() {
        return this.sqip_card_entry_base_verification_token;
    }

    /* renamed from: component47, reason: from getter */
    public final String getSqip_card_entry_base_three_ds_server_trans_id() {
        return this.sqip_card_entry_base_three_ds_server_trans_id;
    }

    /* renamed from: component48, reason: from getter */
    public final String getSqip_card_entry_base_three_ds_warning_severity() {
        return this.sqip_card_entry_base_three_ds_warning_severity;
    }

    /* renamed from: component49, reason: from getter */
    public final String getSqip_card_entry_base_three_ds_warning_code() {
        return this.sqip_card_entry_base_three_ds_warning_code;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSqip_base_square_device_id() {
        return this.sqip_base_square_device_id;
    }

    /* renamed from: component50, reason: from getter */
    public final String getSqip_card_entry_base_three_ds_warning_description() {
        return this.sqip_card_entry_base_three_ds_warning_description;
    }

    /* renamed from: component51, reason: from getter */
    public final String getSqip_base_device_model() {
        return this.sqip_base_device_model;
    }

    /* renamed from: component52, reason: from getter */
    public final int getSqip_android_base_device_sdk_int() {
        return this.sqip_android_base_device_sdk_int;
    }

    /* renamed from: component53, reason: from getter */
    public final String getSqip_android_base_device_manufacturer() {
        return this.sqip_android_base_device_manufacturer;
    }

    /* renamed from: component54, reason: from getter */
    public final String getSqip_android_base_device_brand() {
        return this.sqip_android_base_device_brand;
    }

    /* renamed from: component55, reason: from getter */
    public final String getU_library_name() {
        return this.u_library_name;
    }

    /* renamed from: component56, reason: from getter */
    public final String getU_library_version() {
        return this.u_library_version;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSqip_base_has_flutter_plugin() {
        return this.sqip_base_has_flutter_plugin;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSqip_base_has_flutter() {
        return this.sqip_base_has_flutter;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSqip_base_has_react_native() {
        return this.sqip_base_has_react_native;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getSqip_base_has_react_native_plugin() {
        return this.sqip_base_has_react_native_plugin;
    }

    public final IapEventJsonData copy(long recordedAtMs, String sqip_base_square_application_id, String sqip_base_device_locale_country_code, String sqip_base_device_language, String sqip_base_square_device_id, boolean sqip_base_has_flutter_plugin, boolean sqip_base_has_flutter, boolean sqip_base_has_react_native, boolean sqip_base_has_react_native_plugin, String sqip_base_orientation, int sqip_base_screen_width_pixels, int sqip_base_screen_height_pixels, String sqip_base_time_zone, boolean sqip_base_is_app_debug_build, boolean sqip_base_is_sdk_debug_build, String sqip_android_base_app_package_name, String sqip_android_base_app_version_name, int sqip_android_base_app_version_code, int sqip_android_base_target_api_version, int sqip_android_base_min_api_version, int sqip_android_base_screen_density_dpi, long sqip_android_base_apk_byte_size, boolean sqip_android_base_uses_androidx, String sqip_android_base_process_uuid, String sqip_card_entry_base_name, String sqip_card_entry_base_session_uuid, int sqip_card_entry_base_session_order, String sqip_card_entry_base_theme, String sqip_card_entry_base_validation_error_field, String sqip_card_entry_base_nonce_error_code, String sqip_card_entry_base_app_error_message, String sqip_card_entry_base_flow_type, int sqip_card_entry_base_amount, String sqip_card_entry_base_buyer_action, String sqip_card_entry_base_contact_empty_fields, String sqip_card_entry_base_currency, String sqip_card_entry_base_location_id, int sqip_card_entry_base_challenges_completed_count, int sqip_card_entry_base_challenges_total_count, String sqip_card_entry_base_error_code, String sqip_card_entry_base_error_description, boolean sqip_card_entry_base_has_challenged_user, long sqip_card_entry_base_verification_duration_in_milliseconds, String sqip_card_entry_base_three_ds_trans_status, String sqip_card_entry_base_challenge_type, String sqip_card_entry_base_verification_token, String sqip_card_entry_base_three_ds_server_trans_id, String sqip_card_entry_base_three_ds_warning_severity, String sqip_card_entry_base_three_ds_warning_code, String sqip_card_entry_base_three_ds_warning_description, String sqip_base_device_model, int sqip_android_base_device_sdk_int, String sqip_android_base_device_manufacturer, String sqip_android_base_device_brand, String u_library_name, String u_library_version) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(sqip_base_square_application_id, sqip_base_device_locale_country_code, sqip_base_device_language, sqip_base_square_device_id, sqip_base_orientation);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(sqip_base_time_zone, sqip_android_base_app_package_name, sqip_android_base_app_version_name, sqip_android_base_process_uuid, sqip_card_entry_base_name);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(sqip_card_entry_base_session_uuid, sqip_card_entry_base_theme, sqip_card_entry_base_flow_type, sqip_base_device_model, sqip_android_base_device_manufacturer);
        sqip_android_base_device_brand.getClass();
        u_library_name.getClass();
        u_library_version.getClass();
        return new IapEventJsonData(recordedAtMs, sqip_base_square_application_id, sqip_base_device_locale_country_code, sqip_base_device_language, sqip_base_square_device_id, sqip_base_has_flutter_plugin, sqip_base_has_flutter, sqip_base_has_react_native, sqip_base_has_react_native_plugin, sqip_base_orientation, sqip_base_screen_width_pixels, sqip_base_screen_height_pixels, sqip_base_time_zone, sqip_base_is_app_debug_build, sqip_base_is_sdk_debug_build, sqip_android_base_app_package_name, sqip_android_base_app_version_name, sqip_android_base_app_version_code, sqip_android_base_target_api_version, sqip_android_base_min_api_version, sqip_android_base_screen_density_dpi, sqip_android_base_apk_byte_size, sqip_android_base_uses_androidx, sqip_android_base_process_uuid, sqip_card_entry_base_name, sqip_card_entry_base_session_uuid, sqip_card_entry_base_session_order, sqip_card_entry_base_theme, sqip_card_entry_base_validation_error_field, sqip_card_entry_base_nonce_error_code, sqip_card_entry_base_app_error_message, sqip_card_entry_base_flow_type, sqip_card_entry_base_amount, sqip_card_entry_base_buyer_action, sqip_card_entry_base_contact_empty_fields, sqip_card_entry_base_currency, sqip_card_entry_base_location_id, sqip_card_entry_base_challenges_completed_count, sqip_card_entry_base_challenges_total_count, sqip_card_entry_base_error_code, sqip_card_entry_base_error_description, sqip_card_entry_base_has_challenged_user, sqip_card_entry_base_verification_duration_in_milliseconds, sqip_card_entry_base_three_ds_trans_status, sqip_card_entry_base_challenge_type, sqip_card_entry_base_verification_token, sqip_card_entry_base_three_ds_server_trans_id, sqip_card_entry_base_three_ds_warning_severity, sqip_card_entry_base_three_ds_warning_code, sqip_card_entry_base_three_ds_warning_description, sqip_base_device_model, sqip_android_base_device_sdk_int, sqip_android_base_device_manufacturer, sqip_android_base_device_brand, u_library_name, u_library_version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IapEventJsonData)) {
            return false;
        }
        IapEventJsonData iapEventJsonData = (IapEventJsonData) other;
        return this.recordedAtMs == iapEventJsonData.recordedAtMs && Intrinsics.areEqual(this.sqip_base_square_application_id, iapEventJsonData.sqip_base_square_application_id) && Intrinsics.areEqual(this.sqip_base_device_locale_country_code, iapEventJsonData.sqip_base_device_locale_country_code) && Intrinsics.areEqual(this.sqip_base_device_language, iapEventJsonData.sqip_base_device_language) && Intrinsics.areEqual(this.sqip_base_square_device_id, iapEventJsonData.sqip_base_square_device_id) && this.sqip_base_has_flutter_plugin == iapEventJsonData.sqip_base_has_flutter_plugin && this.sqip_base_has_flutter == iapEventJsonData.sqip_base_has_flutter && this.sqip_base_has_react_native == iapEventJsonData.sqip_base_has_react_native && this.sqip_base_has_react_native_plugin == iapEventJsonData.sqip_base_has_react_native_plugin && Intrinsics.areEqual(this.sqip_base_orientation, iapEventJsonData.sqip_base_orientation) && this.sqip_base_screen_width_pixels == iapEventJsonData.sqip_base_screen_width_pixels && this.sqip_base_screen_height_pixels == iapEventJsonData.sqip_base_screen_height_pixels && Intrinsics.areEqual(this.sqip_base_time_zone, iapEventJsonData.sqip_base_time_zone) && this.sqip_base_is_app_debug_build == iapEventJsonData.sqip_base_is_app_debug_build && this.sqip_base_is_sdk_debug_build == iapEventJsonData.sqip_base_is_sdk_debug_build && Intrinsics.areEqual(this.sqip_android_base_app_package_name, iapEventJsonData.sqip_android_base_app_package_name) && Intrinsics.areEqual(this.sqip_android_base_app_version_name, iapEventJsonData.sqip_android_base_app_version_name) && this.sqip_android_base_app_version_code == iapEventJsonData.sqip_android_base_app_version_code && this.sqip_android_base_target_api_version == iapEventJsonData.sqip_android_base_target_api_version && this.sqip_android_base_min_api_version == iapEventJsonData.sqip_android_base_min_api_version && this.sqip_android_base_screen_density_dpi == iapEventJsonData.sqip_android_base_screen_density_dpi && this.sqip_android_base_apk_byte_size == iapEventJsonData.sqip_android_base_apk_byte_size && this.sqip_android_base_uses_androidx == iapEventJsonData.sqip_android_base_uses_androidx && Intrinsics.areEqual(this.sqip_android_base_process_uuid, iapEventJsonData.sqip_android_base_process_uuid) && Intrinsics.areEqual(this.sqip_card_entry_base_name, iapEventJsonData.sqip_card_entry_base_name) && Intrinsics.areEqual(this.sqip_card_entry_base_session_uuid, iapEventJsonData.sqip_card_entry_base_session_uuid) && this.sqip_card_entry_base_session_order == iapEventJsonData.sqip_card_entry_base_session_order && Intrinsics.areEqual(this.sqip_card_entry_base_theme, iapEventJsonData.sqip_card_entry_base_theme) && Intrinsics.areEqual(this.sqip_card_entry_base_validation_error_field, iapEventJsonData.sqip_card_entry_base_validation_error_field) && Intrinsics.areEqual(this.sqip_card_entry_base_nonce_error_code, iapEventJsonData.sqip_card_entry_base_nonce_error_code) && Intrinsics.areEqual(this.sqip_card_entry_base_app_error_message, iapEventJsonData.sqip_card_entry_base_app_error_message) && Intrinsics.areEqual(this.sqip_card_entry_base_flow_type, iapEventJsonData.sqip_card_entry_base_flow_type) && this.sqip_card_entry_base_amount == iapEventJsonData.sqip_card_entry_base_amount && Intrinsics.areEqual(this.sqip_card_entry_base_buyer_action, iapEventJsonData.sqip_card_entry_base_buyer_action) && Intrinsics.areEqual(this.sqip_card_entry_base_contact_empty_fields, iapEventJsonData.sqip_card_entry_base_contact_empty_fields) && Intrinsics.areEqual(this.sqip_card_entry_base_currency, iapEventJsonData.sqip_card_entry_base_currency) && Intrinsics.areEqual(this.sqip_card_entry_base_location_id, iapEventJsonData.sqip_card_entry_base_location_id) && this.sqip_card_entry_base_challenges_completed_count == iapEventJsonData.sqip_card_entry_base_challenges_completed_count && this.sqip_card_entry_base_challenges_total_count == iapEventJsonData.sqip_card_entry_base_challenges_total_count && Intrinsics.areEqual(this.sqip_card_entry_base_error_code, iapEventJsonData.sqip_card_entry_base_error_code) && Intrinsics.areEqual(this.sqip_card_entry_base_error_description, iapEventJsonData.sqip_card_entry_base_error_description) && this.sqip_card_entry_base_has_challenged_user == iapEventJsonData.sqip_card_entry_base_has_challenged_user && this.sqip_card_entry_base_verification_duration_in_milliseconds == iapEventJsonData.sqip_card_entry_base_verification_duration_in_milliseconds && Intrinsics.areEqual(this.sqip_card_entry_base_three_ds_trans_status, iapEventJsonData.sqip_card_entry_base_three_ds_trans_status) && Intrinsics.areEqual(this.sqip_card_entry_base_challenge_type, iapEventJsonData.sqip_card_entry_base_challenge_type) && Intrinsics.areEqual(this.sqip_card_entry_base_verification_token, iapEventJsonData.sqip_card_entry_base_verification_token) && Intrinsics.areEqual(this.sqip_card_entry_base_three_ds_server_trans_id, iapEventJsonData.sqip_card_entry_base_three_ds_server_trans_id) && Intrinsics.areEqual(this.sqip_card_entry_base_three_ds_warning_severity, iapEventJsonData.sqip_card_entry_base_three_ds_warning_severity) && Intrinsics.areEqual(this.sqip_card_entry_base_three_ds_warning_code, iapEventJsonData.sqip_card_entry_base_three_ds_warning_code) && Intrinsics.areEqual(this.sqip_card_entry_base_three_ds_warning_description, iapEventJsonData.sqip_card_entry_base_three_ds_warning_description) && Intrinsics.areEqual(this.sqip_base_device_model, iapEventJsonData.sqip_base_device_model) && this.sqip_android_base_device_sdk_int == iapEventJsonData.sqip_android_base_device_sdk_int && Intrinsics.areEqual(this.sqip_android_base_device_manufacturer, iapEventJsonData.sqip_android_base_device_manufacturer) && Intrinsics.areEqual(this.sqip_android_base_device_brand, iapEventJsonData.sqip_android_base_device_brand) && Intrinsics.areEqual(this.u_library_name, iapEventJsonData.u_library_name) && Intrinsics.areEqual(this.u_library_version, iapEventJsonData.u_library_version);
    }

    public final long getRecordedAtMs() {
        return this.recordedAtMs;
    }

    public final long getSqip_android_base_apk_byte_size() {
        return this.sqip_android_base_apk_byte_size;
    }

    public final String getSqip_android_base_app_package_name() {
        return this.sqip_android_base_app_package_name;
    }

    public final int getSqip_android_base_app_version_code() {
        return this.sqip_android_base_app_version_code;
    }

    public final String getSqip_android_base_app_version_name() {
        return this.sqip_android_base_app_version_name;
    }

    public final String getSqip_android_base_device_brand() {
        return this.sqip_android_base_device_brand;
    }

    public final String getSqip_android_base_device_manufacturer() {
        return this.sqip_android_base_device_manufacturer;
    }

    public final int getSqip_android_base_device_sdk_int() {
        return this.sqip_android_base_device_sdk_int;
    }

    public final int getSqip_android_base_min_api_version() {
        return this.sqip_android_base_min_api_version;
    }

    public final String getSqip_android_base_process_uuid() {
        return this.sqip_android_base_process_uuid;
    }

    public final int getSqip_android_base_screen_density_dpi() {
        return this.sqip_android_base_screen_density_dpi;
    }

    public final int getSqip_android_base_target_api_version() {
        return this.sqip_android_base_target_api_version;
    }

    public final boolean getSqip_android_base_uses_androidx() {
        return this.sqip_android_base_uses_androidx;
    }

    public final String getSqip_base_device_language() {
        return this.sqip_base_device_language;
    }

    public final String getSqip_base_device_locale_country_code() {
        return this.sqip_base_device_locale_country_code;
    }

    public final String getSqip_base_device_model() {
        return this.sqip_base_device_model;
    }

    public final boolean getSqip_base_has_flutter() {
        return this.sqip_base_has_flutter;
    }

    public final boolean getSqip_base_has_flutter_plugin() {
        return this.sqip_base_has_flutter_plugin;
    }

    public final boolean getSqip_base_has_react_native() {
        return this.sqip_base_has_react_native;
    }

    public final boolean getSqip_base_has_react_native_plugin() {
        return this.sqip_base_has_react_native_plugin;
    }

    public final boolean getSqip_base_is_app_debug_build() {
        return this.sqip_base_is_app_debug_build;
    }

    public final boolean getSqip_base_is_sdk_debug_build() {
        return this.sqip_base_is_sdk_debug_build;
    }

    public final String getSqip_base_orientation() {
        return this.sqip_base_orientation;
    }

    public final int getSqip_base_screen_height_pixels() {
        return this.sqip_base_screen_height_pixels;
    }

    public final int getSqip_base_screen_width_pixels() {
        return this.sqip_base_screen_width_pixels;
    }

    public final String getSqip_base_square_application_id() {
        return this.sqip_base_square_application_id;
    }

    public final String getSqip_base_square_device_id() {
        return this.sqip_base_square_device_id;
    }

    public final String getSqip_base_time_zone() {
        return this.sqip_base_time_zone;
    }

    public final int getSqip_card_entry_base_amount() {
        return this.sqip_card_entry_base_amount;
    }

    public final String getSqip_card_entry_base_app_error_message() {
        return this.sqip_card_entry_base_app_error_message;
    }

    public final String getSqip_card_entry_base_buyer_action() {
        return this.sqip_card_entry_base_buyer_action;
    }

    public final String getSqip_card_entry_base_challenge_type() {
        return this.sqip_card_entry_base_challenge_type;
    }

    public final int getSqip_card_entry_base_challenges_completed_count() {
        return this.sqip_card_entry_base_challenges_completed_count;
    }

    public final int getSqip_card_entry_base_challenges_total_count() {
        return this.sqip_card_entry_base_challenges_total_count;
    }

    public final String getSqip_card_entry_base_contact_empty_fields() {
        return this.sqip_card_entry_base_contact_empty_fields;
    }

    public final String getSqip_card_entry_base_currency() {
        return this.sqip_card_entry_base_currency;
    }

    public final String getSqip_card_entry_base_error_code() {
        return this.sqip_card_entry_base_error_code;
    }

    public final String getSqip_card_entry_base_error_description() {
        return this.sqip_card_entry_base_error_description;
    }

    public final String getSqip_card_entry_base_flow_type() {
        return this.sqip_card_entry_base_flow_type;
    }

    public final boolean getSqip_card_entry_base_has_challenged_user() {
        return this.sqip_card_entry_base_has_challenged_user;
    }

    public final String getSqip_card_entry_base_location_id() {
        return this.sqip_card_entry_base_location_id;
    }

    public final String getSqip_card_entry_base_name() {
        return this.sqip_card_entry_base_name;
    }

    public final String getSqip_card_entry_base_nonce_error_code() {
        return this.sqip_card_entry_base_nonce_error_code;
    }

    public final int getSqip_card_entry_base_session_order() {
        return this.sqip_card_entry_base_session_order;
    }

    public final String getSqip_card_entry_base_session_uuid() {
        return this.sqip_card_entry_base_session_uuid;
    }

    public final String getSqip_card_entry_base_theme() {
        return this.sqip_card_entry_base_theme;
    }

    public final String getSqip_card_entry_base_three_ds_server_trans_id() {
        return this.sqip_card_entry_base_three_ds_server_trans_id;
    }

    public final String getSqip_card_entry_base_three_ds_trans_status() {
        return this.sqip_card_entry_base_three_ds_trans_status;
    }

    public final String getSqip_card_entry_base_three_ds_warning_code() {
        return this.sqip_card_entry_base_three_ds_warning_code;
    }

    public final String getSqip_card_entry_base_three_ds_warning_description() {
        return this.sqip_card_entry_base_three_ds_warning_description;
    }

    public final String getSqip_card_entry_base_three_ds_warning_severity() {
        return this.sqip_card_entry_base_three_ds_warning_severity;
    }

    public final String getSqip_card_entry_base_validation_error_field() {
        return this.sqip_card_entry_base_validation_error_field;
    }

    public final long getSqip_card_entry_base_verification_duration_in_milliseconds() {
        return this.sqip_card_entry_base_verification_duration_in_milliseconds;
    }

    public final String getSqip_card_entry_base_verification_token() {
        return this.sqip_card_entry_base_verification_token;
    }

    public final String getU_library_name() {
        return this.u_library_name;
    }

    public final String getU_library_version() {
        return this.u_library_version;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_card_entry_base_session_order, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_android_base_screen_density_dpi, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_android_base_min_api_version, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_android_base_target_api_version, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_android_base_app_version_code, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_base_screen_height_pixels, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_base_screen_width_pixels, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.recordedAtMs) * 31, 31, this.sqip_base_square_application_id), 31, this.sqip_base_device_locale_country_code), 31, this.sqip_base_device_language), 31, this.sqip_base_square_device_id), 31, this.sqip_base_has_flutter_plugin), 31, this.sqip_base_has_flutter), 31, this.sqip_base_has_react_native), 31, this.sqip_base_has_react_native_plugin), 31, this.sqip_base_orientation), 31), 31), 31, this.sqip_base_time_zone), 31, this.sqip_base_is_app_debug_build), 31, this.sqip_base_is_sdk_debug_build), 31, this.sqip_android_base_app_package_name), 31, this.sqip_android_base_app_version_name), 31), 31), 31), 31), 31, this.sqip_android_base_apk_byte_size), 31, this.sqip_android_base_uses_androidx), 31, this.sqip_android_base_process_uuid), 31, this.sqip_card_entry_base_name), 31, this.sqip_card_entry_base_session_uuid), 31), 31, this.sqip_card_entry_base_theme);
        String str = this.sqip_card_entry_base_validation_error_field;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sqip_card_entry_base_nonce_error_code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sqip_card_entry_base_app_error_message;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_card_entry_base_amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.sqip_card_entry_base_flow_type), 31);
        String str4 = this.sqip_card_entry_base_buyer_action;
        int hashCode3 = (m2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sqip_card_entry_base_contact_empty_fields;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sqip_card_entry_base_currency;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sqip_card_entry_base_location_id;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_card_entry_base_challenges_total_count, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_card_entry_base_challenges_completed_count, (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        String str8 = this.sqip_card_entry_base_error_code;
        int hashCode6 = (m3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sqip_card_entry_base_error_description;
        int m4 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.sqip_card_entry_base_has_challenged_user), 31, this.sqip_card_entry_base_verification_duration_in_milliseconds);
        String str10 = this.sqip_card_entry_base_three_ds_trans_status;
        int hashCode7 = (m4 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sqip_card_entry_base_challenge_type;
        int hashCode8 = (hashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sqip_card_entry_base_verification_token;
        int hashCode9 = (hashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.sqip_card_entry_base_three_ds_server_trans_id;
        int hashCode10 = (hashCode9 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sqip_card_entry_base_three_ds_warning_severity;
        int hashCode11 = (hashCode10 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sqip_card_entry_base_three_ds_warning_code;
        int hashCode12 = (hashCode11 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sqip_card_entry_base_three_ds_warning_description;
        return this.u_library_version.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sqip_android_base_device_sdk_int, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode12 + (str16 != null ? str16.hashCode() : 0)) * 31, 31, this.sqip_base_device_model), 31), 31, this.sqip_android_base_device_manufacturer), 31, this.sqip_android_base_device_brand), 31, this.u_library_name);
    }

    public String toString() {
        long j = this.recordedAtMs;
        String str = this.sqip_base_square_application_id;
        String str2 = this.sqip_base_device_locale_country_code;
        String str3 = this.sqip_base_device_language;
        String str4 = this.sqip_base_square_device_id;
        boolean z = this.sqip_base_has_flutter_plugin;
        boolean z2 = this.sqip_base_has_flutter;
        boolean z3 = this.sqip_base_has_react_native;
        boolean z4 = this.sqip_base_has_react_native_plugin;
        String str5 = this.sqip_base_orientation;
        int i = this.sqip_base_screen_width_pixels;
        int i2 = this.sqip_base_screen_height_pixels;
        String str6 = this.sqip_base_time_zone;
        boolean z5 = this.sqip_base_is_app_debug_build;
        boolean z6 = this.sqip_base_is_sdk_debug_build;
        String str7 = this.sqip_android_base_app_package_name;
        String str8 = this.sqip_android_base_app_version_name;
        int i3 = this.sqip_android_base_app_version_code;
        int i4 = this.sqip_android_base_target_api_version;
        int i5 = this.sqip_android_base_min_api_version;
        int i6 = this.sqip_android_base_screen_density_dpi;
        long j2 = this.sqip_android_base_apk_byte_size;
        boolean z7 = this.sqip_android_base_uses_androidx;
        String str9 = this.sqip_android_base_process_uuid;
        String str10 = this.sqip_card_entry_base_name;
        String str11 = this.sqip_card_entry_base_session_uuid;
        int i7 = this.sqip_card_entry_base_session_order;
        String str12 = this.sqip_card_entry_base_theme;
        String str13 = this.sqip_card_entry_base_validation_error_field;
        String str14 = this.sqip_card_entry_base_nonce_error_code;
        String str15 = this.sqip_card_entry_base_app_error_message;
        String str16 = this.sqip_card_entry_base_flow_type;
        int i8 = this.sqip_card_entry_base_amount;
        String str17 = this.sqip_card_entry_base_buyer_action;
        String str18 = this.sqip_card_entry_base_contact_empty_fields;
        String str19 = this.sqip_card_entry_base_currency;
        String str20 = this.sqip_card_entry_base_location_id;
        int i9 = this.sqip_card_entry_base_challenges_completed_count;
        int i10 = this.sqip_card_entry_base_challenges_total_count;
        String str21 = this.sqip_card_entry_base_error_code;
        String str22 = this.sqip_card_entry_base_error_description;
        boolean z8 = this.sqip_card_entry_base_has_challenged_user;
        long j3 = this.sqip_card_entry_base_verification_duration_in_milliseconds;
        String str23 = this.sqip_card_entry_base_three_ds_trans_status;
        String str24 = this.sqip_card_entry_base_challenge_type;
        String str25 = this.sqip_card_entry_base_verification_token;
        String str26 = this.sqip_card_entry_base_three_ds_server_trans_id;
        String str27 = this.sqip_card_entry_base_three_ds_warning_severity;
        String str28 = this.sqip_card_entry_base_three_ds_warning_code;
        String str29 = this.sqip_card_entry_base_three_ds_warning_description;
        String str30 = this.sqip_base_device_model;
        int i11 = this.sqip_android_base_device_sdk_int;
        String str31 = this.sqip_android_base_device_manufacturer;
        String str32 = this.sqip_android_base_device_brand;
        String str33 = this.u_library_name;
        String str34 = this.u_library_version;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("IapEventJsonData(recordedAtMs=", j, ", sqip_base_square_application_id=", str);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_base_device_locale_country_code=", str2, ", sqip_base_device_language=", str3);
        m.append(", sqip_base_square_device_id=");
        m.append(str4);
        m.append(", sqip_base_has_flutter_plugin=");
        m.append(z);
        m.append(", sqip_base_has_flutter=");
        m.append(z2);
        m.append(", sqip_base_has_react_native=");
        m.append(z3);
        m.append(", sqip_base_has_react_native_plugin=");
        m.append(z4);
        m.append(", sqip_base_orientation=");
        m.append(str5);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, ", sqip_base_screen_width_pixels=", ", sqip_base_screen_height_pixels=", m);
        m.append(", sqip_base_time_zone=");
        m.append(str6);
        m.append(", sqip_base_is_app_debug_build=");
        m.append(z5);
        m.append(", sqip_base_is_sdk_debug_build=");
        m.append(z6);
        m.append(", sqip_android_base_app_package_name=");
        m.append(str7);
        m.append(", sqip_android_base_app_version_name=");
        m.append(str8);
        m.append(", sqip_android_base_app_version_code=");
        m.append(i3);
        Fragment$5$$ExternalSyntheticOutline0.m(i4, i5, ", sqip_android_base_target_api_version=", ", sqip_android_base_min_api_version=", m);
        m.append(", sqip_android_base_screen_density_dpi=");
        m.append(i6);
        m.append(", sqip_android_base_apk_byte_size=");
        m.append(j2);
        m.append(", sqip_android_base_uses_androidx=");
        m.append(z7);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_android_base_process_uuid=", str9, ", sqip_card_entry_base_name=", str10);
        m.append(", sqip_card_entry_base_session_uuid=");
        m.append(str11);
        m.append(", sqip_card_entry_base_session_order=");
        m.append(i7);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_theme=", str12, ", sqip_card_entry_base_validation_error_field=", str13);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_nonce_error_code=", str14, ", sqip_card_entry_base_app_error_message=", str15);
        m.append(", sqip_card_entry_base_flow_type=");
        m.append(str16);
        m.append(", sqip_card_entry_base_amount=");
        m.append(i8);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_buyer_action=", str17, ", sqip_card_entry_base_contact_empty_fields=", str18);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_currency=", str19, ", sqip_card_entry_base_location_id=", str20);
        Fragment$5$$ExternalSyntheticOutline0.m(i9, i10, ", sqip_card_entry_base_challenges_completed_count=", ", sqip_card_entry_base_challenges_total_count=", m);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_error_code=", str21, ", sqip_card_entry_base_error_description=", str22);
        m.append(", sqip_card_entry_base_has_challenged_user=");
        m.append(z8);
        m.append(", sqip_card_entry_base_verification_duration_in_milliseconds=");
        Fragment$5$$ExternalSyntheticOutline0.m(j3, ", sqip_card_entry_base_three_ds_trans_status=", str23, m);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_challenge_type=", str24, ", sqip_card_entry_base_verification_token=", str25);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_three_ds_server_trans_id=", str26, ", sqip_card_entry_base_three_ds_warning_severity=", str27);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_card_entry_base_three_ds_warning_code=", str28, ", sqip_card_entry_base_three_ds_warning_description=", str29);
        m.append(", sqip_base_device_model=");
        m.append(str30);
        m.append(", sqip_android_base_device_sdk_int=");
        m.append(i11);
        Boxes$$ExternalSyntheticOutline1.m(m, ", sqip_android_base_device_manufacturer=", str31, ", sqip_android_base_device_brand=", str32);
        Boxes$$ExternalSyntheticOutline1.m(m, ", u_library_name=", str33, ", u_library_version=", str34);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeLong(this.recordedAtMs);
        parcel.writeString(this.sqip_base_square_application_id);
        parcel.writeString(this.sqip_base_device_locale_country_code);
        parcel.writeString(this.sqip_base_device_language);
        parcel.writeString(this.sqip_base_square_device_id);
        parcel.writeInt(this.sqip_base_has_flutter_plugin ? 1 : 0);
        parcel.writeInt(this.sqip_base_has_flutter ? 1 : 0);
        parcel.writeInt(this.sqip_base_has_react_native ? 1 : 0);
        parcel.writeInt(this.sqip_base_has_react_native_plugin ? 1 : 0);
        parcel.writeString(this.sqip_base_orientation);
        parcel.writeInt(this.sqip_base_screen_width_pixels);
        parcel.writeInt(this.sqip_base_screen_height_pixels);
        parcel.writeString(this.sqip_base_time_zone);
        parcel.writeInt(this.sqip_base_is_app_debug_build ? 1 : 0);
        parcel.writeInt(this.sqip_base_is_sdk_debug_build ? 1 : 0);
        parcel.writeString(this.sqip_android_base_app_package_name);
        parcel.writeString(this.sqip_android_base_app_version_name);
        parcel.writeInt(this.sqip_android_base_app_version_code);
        parcel.writeInt(this.sqip_android_base_target_api_version);
        parcel.writeInt(this.sqip_android_base_min_api_version);
        parcel.writeInt(this.sqip_android_base_screen_density_dpi);
        parcel.writeLong(this.sqip_android_base_apk_byte_size);
        parcel.writeInt(this.sqip_android_base_uses_androidx ? 1 : 0);
        parcel.writeString(this.sqip_android_base_process_uuid);
        parcel.writeString(this.sqip_card_entry_base_name);
        parcel.writeString(this.sqip_card_entry_base_session_uuid);
        parcel.writeInt(this.sqip_card_entry_base_session_order);
        parcel.writeString(this.sqip_card_entry_base_theme);
        parcel.writeString(this.sqip_card_entry_base_validation_error_field);
        parcel.writeString(this.sqip_card_entry_base_nonce_error_code);
        parcel.writeString(this.sqip_card_entry_base_app_error_message);
        parcel.writeString(this.sqip_card_entry_base_flow_type);
        parcel.writeInt(this.sqip_card_entry_base_amount);
        parcel.writeString(this.sqip_card_entry_base_buyer_action);
        parcel.writeString(this.sqip_card_entry_base_contact_empty_fields);
        parcel.writeString(this.sqip_card_entry_base_currency);
        parcel.writeString(this.sqip_card_entry_base_location_id);
        parcel.writeInt(this.sqip_card_entry_base_challenges_completed_count);
        parcel.writeInt(this.sqip_card_entry_base_challenges_total_count);
        parcel.writeString(this.sqip_card_entry_base_error_code);
        parcel.writeString(this.sqip_card_entry_base_error_description);
        parcel.writeInt(this.sqip_card_entry_base_has_challenged_user ? 1 : 0);
        parcel.writeLong(this.sqip_card_entry_base_verification_duration_in_milliseconds);
        parcel.writeString(this.sqip_card_entry_base_three_ds_trans_status);
        parcel.writeString(this.sqip_card_entry_base_challenge_type);
        parcel.writeString(this.sqip_card_entry_base_verification_token);
        parcel.writeString(this.sqip_card_entry_base_three_ds_server_trans_id);
        parcel.writeString(this.sqip_card_entry_base_three_ds_warning_severity);
        parcel.writeString(this.sqip_card_entry_base_three_ds_warning_code);
        parcel.writeString(this.sqip_card_entry_base_three_ds_warning_description);
        parcel.writeString(this.sqip_base_device_model);
        parcel.writeInt(this.sqip_android_base_device_sdk_int);
        parcel.writeString(this.sqip_android_base_device_manufacturer);
        parcel.writeString(this.sqip_android_base_device_brand);
        parcel.writeString(this.u_library_name);
        parcel.writeString(this.u_library_version);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IapEventJsonData> {
        @Override // android.os.Parcelable.Creator
        public final IapEventJsonData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            parcel.getClass();
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z10 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
                z4 = z;
            } else {
                z3 = z;
                z4 = z2;
            }
            String readString5 = parcel.readString();
            boolean z13 = z3;
            int readInt = parcel.readInt();
            boolean z14 = z4;
            int readInt2 = parcel.readInt();
            boolean z15 = z13;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = z14;
            } else {
                z5 = z14;
                z14 = z15;
            }
            if (parcel.readInt() != 0) {
                z6 = z15;
                z15 = z5;
                z7 = z15;
            } else {
                z6 = z15;
                z7 = z5;
            }
            String readString7 = parcel.readString();
            boolean z16 = z6;
            String readString8 = parcel.readString();
            boolean z17 = z7;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            boolean z18 = z16;
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z8 = z18;
                z18 = z17;
                z9 = z18;
            } else {
                z8 = z18;
                z9 = z17;
            }
            String readString9 = parcel.readString();
            boolean z19 = z8;
            String readString10 = parcel.readString();
            boolean z20 = z9;
            String readString11 = parcel.readString();
            int readInt7 = parcel.readInt();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            int readInt8 = parcel.readInt();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            boolean z21 = z20;
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            if (parcel.readInt() == 0) {
                z21 = z19;
            }
            return new IapEventJsonData(readLong, readString, readString2, readString3, readString4, z12, z10, z11, z, readString5, readInt, readInt2, readString6, z14, z15, readString7, readString8, readInt3, readInt4, readInt5, readInt6, readLong2, z18, readString9, readString10, readString11, readInt7, readString12, readString13, readString14, readString15, readString16, readInt8, readString17, readString18, readString19, readString20, readInt9, readInt10, readString21, readString22, z21, parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IapEventJsonData[] newArray(int i) {
            return new IapEventJsonData[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IapEventJsonData(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i, int i2, String str6, boolean z5, boolean z6, String str7, String str8, int i3, int i4, int i5, int i6, long j2, boolean z7, String str9, String str10, String str11, int i7, String str12, String str13, String str14, String str15, String str16, int i8, String str17, String str18, String str19, String str20, int i9, int i10, String str21, String str22, boolean z8, long j3, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i11, String str31, String str32, String str33, String str34, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, str, str2, str3, str4, z, z2, z3, z4, str5, i, i2, str6, z5, z6, str7, str8, i3, i4, i5, i6, j2, z7, str9, str10, str11, i7, str12, str13, str14, str15, str16, i8, str17, str18, str19, str20, i9, i10, str21, str22, z8, j3, str23, str24, str25, str26, str27, str28, str29, r56, r57, r58, r59, (i13 & 4194304) != 0 ? "sqip-android" : str33, (i13 & 8388608) != 0 ? BuildConfig.SQIP_RELEASE_VERSION : str34);
        String str35;
        String str36;
        String str37;
        long currentTimeMillis = (i12 & 1) != 0 ? System.currentTimeMillis() : j;
        if ((i13 & PKIFailureInfo.transactionIdInUse) != 0) {
            String str38 = Build.MODEL;
            str38.getClass();
            str35 = str38;
        } else {
            str35 = str30;
        }
        int i14 = (i13 & PKIFailureInfo.signerNotTrusted) != 0 ? Build.VERSION.SDK_INT : i11;
        if ((i13 & PKIFailureInfo.badCertTemplate) != 0) {
            String str39 = Build.MANUFACTURER;
            str39.getClass();
            str36 = str39;
        } else {
            str36 = str31;
        }
        if ((i13 & PKIFailureInfo.badSenderNonce) != 0) {
            String str40 = Build.BRAND;
            str40.getClass();
            str37 = str40;
        } else {
            str37 = str32;
        }
    }
}
