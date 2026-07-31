package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.EntityList;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutNodeWrapper.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b \u0018\u0000 ê\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004ê\u0001ë\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0081\u0001\u0010!\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0001\u0010\u0013\"\b\b\u0002\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0089\u0001\u0010&\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0001\u0010\u0013\"\b\b\u0002\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0089\u0001\u0010(\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0001\u0010\u0013\"\b\b\u0002\u0010\u0015*\u00020\u0014*\u0004\u0018\u00018\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%J%\u0010-\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u00101J\u001f\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020.2\u0006\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u00020\u001c¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0014¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\u0010J\u0017\u0010B\u001a\u00020:2\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020:2\u0006\u0010A\u001a\u00020@H\u0086\u0002¢\u0006\u0004\bD\u0010CJ\u000f\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\bE\u0010\u0010J;\u0010M\u001a\u00020\u00072\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\"2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u000eJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\bO\u0010\u000eJ\r\u0010P\u001a\u00020\u0007¢\u0006\u0004\bP\u0010\u0010J\u0018\u0010Q\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\bQ\u0010\u000eJ#\u0010R\u001a\u00020\u00072\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\bR\u0010SJy\u0010V\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0001\u0010\u0013\"\b\b\u0002\u0010\u0015*\u00020\u00142\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ{\u0010X\u001a\u00020\u0007\"\u0014\b\u0000\u0010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0001\u0010\u0013\"\b\b\u0002\u0010\u0015*\u00020\u00142\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010UJ\r\u0010Z\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\u001d\u0010^\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u00106J\u001d\u0010a\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u00106J%\u0010f\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010eJ\u001f\u0010g\u001a\u00020Y2\u0006\u0010b\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u001cH\u0016¢\u0006\u0004\bg\u0010hJ\u001d\u0010j\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u00106J\u001d\u0010l\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u00106J\u001d\u0010n\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u00106J\u001f\u0010q\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010p\u001a\u00020oH\u0004¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u0007H\u0016¢\u0006\u0004\bs\u0010\u0010J\u000f\u0010t\u001a\u00020\u0007H\u0016¢\u0006\u0004\bt\u0010\u0010J)\u0010x\u001a\u00020\u00072\u0006\u00102\u001a\u00020.2\u0006\u00100\u001a\u00020\u001c2\b\b\u0002\u0010u\u001a\u00020\u001cH\u0000¢\u0006\u0004\bv\u0010wJ\u001d\u0010{\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ\u001d\u0010}\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010zJ\u000f\u0010~\u001a\u00020\u0007H\u0016¢\u0006\u0004\b~\u0010\u0010J\u000f\u0010\u007f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u007f\u0010\u0010J\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u000f\u0010\u0084\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0084\u0001\u00109J\"\u0010\u0088\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0087\u0001\u00106J*\u0010\u008b\u0001\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\t\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001RD\u0010J\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010\u0097\u0001\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\bJ\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0096\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R(\u0010¨\u0001\u001a\u0011\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020:\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R1\u0010G\u001a\u00020F2\u0007\u0010\u0097\u0001\u001a\u00020F8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000f\n\u0005\bG\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R0\u0010H\u001a\u00020\"2\u0007\u0010\u0097\u0001\u001a\u00020\"8\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\bH\u0010¢\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R(\u0010±\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010\u0096\u0001\u001a\u0005\b±\u0001\u00109\"\u0006\b²\u0001\u0010³\u0001R\u001b\u0010´\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R&\u0010·\u0001\u001a\u00030¶\u00018\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u001e\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R)\u0010¾\u0001\u001a\u00020\u001c2\u0007\u0010\u0097\u0001\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b¾\u0001\u0010\u0096\u0001\u001a\u0005\b¿\u0001\u00109R0\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010À\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u00109R(\u0010Ì\u0001\u001a\u0005\u0018\u00010É\u0001*\f\u0012\u0005\u0012\u00030È\u0001\u0018\u00010Ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00008PX\u0090\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010\u0092\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001e\u0010Ù\u0001\u001a\u00030×\u00018Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\u001a\u0006\bØ\u0001\u0010¬\u0001R\u0013\u0010Ú\u0001\u001a\u00020\u001c8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u00109R,\u0010à\u0001\u001a\u00030¤\u00012\b\u0010Û\u0001\u001a\u00030¤\u00018F@@X\u0086\u000e¢\u0006\u0010\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010Ì\u0001\u001a\u0005\u0018\u00010É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010á\u0001R\u0016\u0010ä\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ç\u0001\u001a\u00020.8DX\u0084\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0016\u0010è\u0001\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u00109R\u001e\u0010\u0086\u0001\u001a\u00030\u0085\u00018Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\u001a\u0006\bé\u0001\u0010¬\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ì\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "canvas", "drawContainedDrawModifiers", "(Landroidx/compose/ui/graphics/Canvas;)V", "updateLayerParameters", "()V", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "C", "Landroidx/compose/ui/Modifier;", "M", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "", "isTouchEvent", "isInLayer", "hit-1hIXUjU", "(Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hit", "", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "hitNear", "speculativeHit-JHbHoSQ", "speculativeHit", "ancestor", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/LayoutNodeWrapper;J)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/geometry/MutableRect;Z)V", "bounds", "fromParentRect", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "offsetFromEdge-MK-Hz9U", "(J)J", "offsetFromEdge", "isTransparent", "()Z", "", "width", "height", "onMeasureResultChanged", "(II)V", "onMeasured", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "get", "onInitialize", "Landroidx/compose/ui/unit/IntOffset;", X3.i.L, "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "draw", "performDraw", "onPlaced", "invoke", "onLayerBlockUpdated", "(Lkotlin/jvm/functions/Function1;)V", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "attach", "detach", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onModifierChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/LayoutNodeWrapper;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "wrappedBy", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getWrappedBy$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrappedBy$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "isClipping", "Z", "<set-?>", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "_isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "getZIndex", "()F", "setZIndex", "(F)V", "isShallowPlacing", "setShallowPlacing", "(Z)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/EntityList;", "entities", "[Landroidx/compose/ui/node/LayoutNodeEntity;", "getEntities-CHwCgZE", "()[Landroidx/compose/ui/node/LayoutNodeEntity;", "Lkotlin/Function0;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", AdRevenueConstants.LAYER_KEY, "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "getHasMeasureResult", "hasMeasureResult", "Landroidx/compose/ui/node/SimpleEntity;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "getParentData", "(Landroidx/compose/ui/node/SimpleEntity;)Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getWrapped$ui_release", "wrapped", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "isAttached", "value", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "()Ljava/lang/Object;", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "isValid", "getMinimumTouchTargetSize-NH-jbRc", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LayoutNodeWrapper extends Placeable implements Measurable, LayoutCoordinates, OwnerScope, Function1 {
    private boolean _isAttached;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private final LayoutNodeEntity[] entities;
    private final Function0 invalidateParentLayer;
    private boolean isClipping;
    private boolean isShallowPlacing;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1 layerBlock;
    private Density layerDensity;
    private LayoutDirection layerLayoutDirection;
    private final LayoutNode layoutNode;
    private Map oldAlignmentLines;
    private long position;
    private LayoutNodeWrapper wrappedBy;
    private float zIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1 onCommitAffectingLayerParams = new Function1() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNodeWrapper) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull LayoutNodeWrapper wrapper) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            if (wrapper.getIsAttached()) {
                wrapper.updateLayerParameters();
            }
        }
    };
    private static final Function1 onCommitAffectingLayer = new Function1() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNodeWrapper) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull LayoutNodeWrapper wrapper) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            OwnedLayer layer = wrapper.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final HitTestSource PointerInputSource = new HitTestSource<PointerInputEntity, PointerInputFilter, PointerInputModifier>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* renamed from: entityType-EEbPh1w, reason: not valid java name */
        public int mo2050entityTypeEEbPh1w() {
            return EntityList.INSTANCE.m2002getPointerInputEntityTypeEEbPh1w();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public PointerInputFilter contentFrom(PointerInputEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return ((PointerInputModifier) entity.getModifier()).getPointerInputFilter();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(PointerInputEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return ((PointerInputModifier) entity.getModifier()).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo2049childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m2016hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource<SemanticsEntity, SemanticsEntity, SemanticsModifier>() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public SemanticsEntity contentFrom(SemanticsEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return entity;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(SemanticsEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return false;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* renamed from: entityType-EEbPh1w */
        public int mo2050entityTypeEEbPh1w() {
            return EntityList.INSTANCE.m2004getSemanticsEntityTypeEEbPh1w();
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration collapsedSemanticsConfiguration;
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(parentLayoutNode);
            boolean z = false;
            if (outerSemantics != null && (collapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && collapsedSemanticsConfiguration.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo2049childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m2017hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }
    };

    /* compiled from: LayoutNodeWrapper.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u0004*\b\b\u0002\u0010\u0003*\u00020\u00052\u00020\u0006JC\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0018H&ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\nH&ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "T", "Landroidx/compose/ui/node/LayoutNodeEntity;", "M", "C", "Landroidx/compose/ui/Modifier;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "contentFrom", "entity", "(Landroidx/compose/ui/node/LayoutNodeEntity;)Ljava/lang/Object;", "entityType", "Landroidx/compose/ui/node/EntityList$EntityType;", "entityType-EEbPh1w", "()I", "interceptOutOfBoundsChildEvents", "(Landroidx/compose/ui/node/LayoutNodeEntity;)Z", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface HitTestSource<T extends LayoutNodeEntity<T, M>, C, M extends Modifier> {
        /* renamed from: childHitTest-YqVAtuI */
        void mo2049childHitTestYqVAtuI(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer);

        Object contentFrom(LayoutNodeEntity entity);

        /* renamed from: entityType-EEbPh1w */
        int mo2050entityTypeEEbPh1w();

        boolean interceptOutOfBoundsChildEvents(LayoutNodeEntity entity);

        boolean shouldHitTestChildren(LayoutNode parentLayoutNode);
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public abstract MeasureScope getMeasureScope();

    /* renamed from: getWrapped$ui_release */
    public LayoutNodeWrapper getWrapped() {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Canvas) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: getLayoutNode$ui_release, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public LayoutNodeWrapper(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m2558getZeronOccac();
        this.entities = EntityList.m1992constructorimpl$default(null, 1, null);
        this.invalidateParentLayer = new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$invalidateParentLayer$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m2053invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2053invoke() {
                LayoutNodeWrapper wrappedBy = LayoutNodeWrapper.this.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
    }

    /* renamed from: getWrappedBy$ui_release, reason: from getter */
    public final LayoutNodeWrapper getWrappedBy() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(LayoutNodeWrapper layoutNodeWrapper) {
        this.wrappedBy = layoutNodeWrapper;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo1946getSizeYbymL2g() {
        return getMeasuredSize();
    }

    protected final Function1 getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            return layoutNodeWrapper.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        if (!this._isAttached || this.layoutNode.isAttached()) {
            return this._isAttached;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final MeasureResult getMeasureResult() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void setMeasureResult$ui_release(MeasureResult value) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && value.getAlignmentLines().isEmpty()) || Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                return;
            }
            LayoutNodeWrapper wrapped = getWrapped();
            if (Intrinsics.areEqual(wrapped != null ? wrapped.layoutNode : null, this.layoutNode)) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    parent$ui_release2.onAlignmentsChanged$ui_release();
                }
                if (this.layoutNode.getAlignmentLines().getUsedDuringParentMeasurement()) {
                    LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
                    if (parent$ui_release3 != null) {
                        LayoutNode.requestRemeasure$ui_release$default(parent$ui_release3, false, 1, null);
                    }
                } else if (this.layoutNode.getAlignmentLines().getUsedDuringParentLayout() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } else {
                this.layoutNode.onAlignmentsChanged$ui_release();
            }
            this.layoutNode.getAlignmentLines().setDirty$ui_release(true);
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(value.getAlignmentLines());
        }
    }

    private final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    protected void onMeasureResultChanged(int width, int height) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2071resizeozmzZPI(IntSizeKt.IntSize(width, height));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.invalidateLayer();
            }
        }
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.onLayoutChange(this.layoutNode);
        }
        m1959setMeasuredSizeozmzZPI(IntSizeKt.IntSize(width, height));
        for (LayoutNodeEntity layoutNodeEntity = this.entities[EntityList.INSTANCE.m1999getDrawEntityTypeEEbPh1w()]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
            ((DrawEntity) layoutNodeEntity).onMeasureResultChanged();
        }
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return getParentData((SimpleEntity) EntityList.m1996head0OSVbXo(this.entities, EntityList.INSTANCE.m2001getParentDataEntityTypeEEbPh1w()));
    }

    private final Object getParentData(SimpleEntity simpleEntity) {
        if (simpleEntity == null) {
            LayoutNodeWrapper wrapped = getWrapped();
            if (wrapped != null) {
                return wrapped.getParentData();
            }
            return null;
        }
        return ((ParentDataModifier) simpleEntity.getModifier()).modifyParentData(getMeasureScope(), getParentData((SimpleEntity) simpleEntity.getNext()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return this.layoutNode.getOuterLayoutNodeWrapper$ui_release().wrappedBy;
    }

    /* renamed from: isShallowPlacing, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final void setShallowPlacing(boolean z) {
        this.isShallowPlacing = z;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver();
    }

    /* renamed from: getEntities-CHwCgZE, reason: not valid java name and from getter */
    public final LayoutNodeEntity[] getEntities() {
        return this.entities;
    }

    public final void onMeasured() {
        LayoutNodeEntity[] layoutNodeEntityArr = this.entities;
        EntityList.Companion companion = EntityList.INSTANCE;
        if (EntityList.m1994has0OSVbXo(layoutNodeEntityArr, companion.m2003getRemeasureEntityTypeEEbPh1w())) {
            Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    for (LayoutNodeEntity layoutNodeEntity = this.entities[companion.m2003getRemeasureEntityTypeEEbPh1w()]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
                        ((OnRemeasuredModifier) ((SimpleEntity) layoutNodeEntity).getModifier()).mo224onRemeasuredozmzZPI(getMeasuredSize());
                    }
                    Unit unit = Unit.INSTANCE;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        int m2554getYimpl;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (!getHasMeasureResult() || (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            m2554getYimpl = IntOffset.m2553getXimpl(m1956getApparentToRealOffsetnOccac());
        } else {
            m2554getYimpl = IntOffset.m2554getYimpl(m1956getApparentToRealOffsetnOccac());
        }
        return calculateAlignmentLine + m2554getYimpl;
    }

    public void onInitialize() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo1945placeAtf8xVGno(long position, float zIndex, Function1 layerBlock) {
        onLayerBlockUpdated(layerBlock);
        if (!IntOffset.m2552equalsimpl0(this.position, position)) {
            this.position = position;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2070movegyyYBs(position);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.invalidateLayer();
                }
            }
            LayoutNodeWrapper wrapped = getWrapped();
            if (!Intrinsics.areEqual(wrapped != null ? wrapped.layoutNode : null, this.layoutNode)) {
                this.layoutNode.onAlignmentsChanged$ui_release();
            } else {
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.onAlignmentsChanged$ui_release();
                }
            }
            Owner owner = this.layoutNode.getOwner();
            if (owner != null) {
                owner.onLayoutChange(this.layoutNode);
            }
        }
        this.zIndex = zIndex;
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m2553getXimpl = IntOffset.m2553getXimpl(this.position);
        float m2554getYimpl = IntOffset.m2554getYimpl(this.position);
        canvas.translate(m2553getXimpl, m2554getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m2553getXimpl, -m2554getYimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        DrawEntity drawEntity = (DrawEntity) EntityList.m1996head0OSVbXo(this.entities, EntityList.INSTANCE.m1999getDrawEntityTypeEEbPh1w());
        if (drawEntity == null) {
            performDraw(canvas);
        } else {
            drawEntity.draw(canvas);
        }
    }

    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        LayoutNodeWrapper wrapped = getWrapped();
        if (wrapped != null) {
            wrapped.draw(canvas);
        }
    }

    public final void onPlaced() {
        for (LayoutNodeEntity layoutNodeEntity = this.entities[EntityList.INSTANCE.m2000getOnPlacedEntityTypeEEbPh1w()]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
            ((OnPlacedModifier) ((SimpleEntity) layoutNodeEntity).getModifier()).onPlaced(this);
        }
    }

    public void invoke(final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.layoutNode.getIsPlaced()) {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2054invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2054invoke() {
                    LayoutNodeWrapper.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        } else {
            this.lastLayerDrawingWasSkipped = true;
        }
    }

    public final void onLayerBlockUpdated(Function1 layerBlock) {
        Owner owner;
        boolean z = (this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, this.layoutNode.getDensity()) && this.layerLayoutDirection == this.layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = this.layoutNode.getDensity();
        this.layerLayoutDirection = this.layoutNode.getLayoutDirection();
        if (isAttached() && layerBlock != null) {
            if (this.layer != null) {
                if (z) {
                    updateLayerParameters();
                    return;
                }
                return;
            }
            OwnedLayer createLayer = LayoutNodeKt.requireOwner(this.layoutNode).createLayer(this, this.invalidateParentLayer);
            createLayer.mo2071resizeozmzZPI(getMeasuredSize());
            createLayer.mo2070movegyyYBs(this.position);
            this.layer = createLayer;
            updateLayerParameters();
            this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
            this.invalidateParentLayer.mo4828invoke();
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
            this.invalidateParentLayer.mo4828invoke();
            if (isAttached() && (owner = this.layoutNode.getOwner()) != null) {
                owner.onLayoutChange(this.layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1 function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(this.layoutNode.getDensity());
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$updateLayerParameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2056invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2056invoke() {
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
                    Function1 function12 = Function1.this;
                    reusableGraphicsLayerScope2 = LayoutNodeWrapper.graphicsLayerScope;
                    function12.invoke(reusableGraphicsLayerScope2);
                }
            });
            ownedLayer.mo2072updateLayerPropertiesNHXXZp8(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), this.layoutNode.getLayoutDirection(), this.layoutNode.getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else if (this.layerBlock != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            owner.onLayoutChange(this.layoutNode);
        }
    }

    /* renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* renamed from: isValid */
    public boolean getIsAttached() {
        return this.layer != null;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m2043getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo272toSizeXkaWNTQ(this.layoutNode.getViewConfiguration().mo2020getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final void m2045hitTestYqVAtuI(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        LayoutNodeEntity m1996head0OSVbXo = EntityList.m1996head0OSVbXo(this.entities, hitTestSource.mo2050entityTypeEEbPh1w());
        if (!m2048withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float m2040distanceInMinimumTouchTargettz77jQw = m2040distanceInMinimumTouchTargettz77jQw(pointerPosition, m2043getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(m2040distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m2040distanceInMinimumTouchTargettz77jQw) || !hitTestResult.isHitInMinimumTouchTargetBetter(m2040distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m2036hitNearJHbHoSQ(m1996head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, m2040distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (m1996head0OSVbXo == null) {
            mo2011hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m2046isPointerInBoundsk4lQ0M(pointerPosition)) {
            m2035hit1hIXUjU(m1996head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float m2040distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m2040distanceInMinimumTouchTargettz77jQw(pointerPosition, m2043getMinimumTouchTargetSizeNHjbRc());
        if (!Float.isInfinite(m2040distanceInMinimumTouchTargettz77jQw2) && !Float.isNaN(m2040distanceInMinimumTouchTargettz77jQw2)) {
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m2040distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
                m2036hitNearJHbHoSQ(m1996head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, m2040distanceInMinimumTouchTargettz77jQw2);
                return;
            }
        }
        m2038speculativeHitJHbHoSQ(m1996head0OSVbXo, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, m2040distanceInMinimumTouchTargettz77jQw2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU, reason: not valid java name */
    public final void m2035hit1hIXUjU(final LayoutNodeEntity layoutNodeEntity, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2) {
        if (layoutNodeEntity == null) {
            mo2011hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(hitTestSource.contentFrom(layoutNodeEntity), z2, new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2051invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2051invoke() {
                    LayoutNodeWrapper.this.m2035hit1hIXUjU(layoutNodeEntity.getNext(), hitTestSource, j, hitTestResult, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final void m2036hitNearJHbHoSQ(final LayoutNodeEntity layoutNodeEntity, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (layoutNodeEntity == null) {
            mo2011hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(hitTestSource.contentFrom(layoutNodeEntity), f, z2, new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2052invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2052invoke() {
                    LayoutNodeWrapper.this.m2036hitNearJHbHoSQ(layoutNodeEntity.getNext(), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final void m2038speculativeHitJHbHoSQ(final LayoutNodeEntity layoutNodeEntity, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (layoutNodeEntity == null) {
            mo2011hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(layoutNodeEntity)) {
            hitTestResult.speculativeHit(hitTestSource.contentFrom(layoutNodeEntity), f, z2, new Function0() { // from class: androidx.compose.ui.node.LayoutNodeWrapper$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2055invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2055invoke() {
                    LayoutNodeWrapper.this.m2038speculativeHitJHbHoSQ(layoutNodeEntity.getNext(), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        } else {
            m2038speculativeHitJHbHoSQ(layoutNodeEntity.getNext(), hitTestSource, j, hitTestResult, z, z2, f);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo2011hitTestChildYqVAtuI(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        LayoutNodeWrapper wrapped = getWrapped();
        if (wrapped != null) {
            wrapped.m2045hitTestYqVAtuI(hitTestSource, wrapped.m2041fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates findRoot = LayoutCoordinatesKt.findRoot(this);
        MutableRect rectCache = getRectCache();
        long m2039calculateMinimumTouchTargetPaddingE7KxVPU = m2039calculateMinimumTouchTargetPaddingE7KxVPU(m2043getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m1335getWidthimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m1333getHeightimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m1335getWidthimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m1333getHeightimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU));
        LayoutNodeWrapper layoutNodeWrapper = this;
        while (layoutNodeWrapper != findRoot) {
            layoutNodeWrapper.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo1950windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates findRoot = LayoutCoordinatesKt.findRoot(this);
        return mo1947localPositionOfR5De75A(findRoot, Offset.m1301minusMKHz9U(LayoutNodeKt.requireOwner(this.layoutNode).mo2073calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(findRoot)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo1949localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(this.layoutNode).mo2074calculatePositionInWindowMKHz9U(mo1948localToRootMKHz9U(relativeToLocal));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo1947localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper findCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        while (layoutNodeWrapper != findCommonAncestor$ui_release) {
            relativeToSource = layoutNodeWrapper.m2047toParentPositionMKHz9U(relativeToSource);
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper);
        }
        return m2034ancestorToLocalR5De75A(findCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper findCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m2567getWidthimpl(sourceCoordinates.mo1946getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m2566getHeightimpl(sourceCoordinates.mo1946getSizeYbymL2g()));
        while (layoutNodeWrapper != findCommonAncestor$ui_release) {
            rectInParent$ui_release$default(layoutNodeWrapper, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper);
        }
        ancestorToLocal(findCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    /* renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m2034ancestorToLocalR5De75A(LayoutNodeWrapper ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null || Intrinsics.areEqual(ancestor, layoutNodeWrapper)) {
            return m2041fromParentPositionMKHz9U(offset);
        }
        return m2041fromParentPositionMKHz9U(layoutNodeWrapper.m2034ancestorToLocalR5De75A(ancestor, offset));
    }

    private final void ancestorToLocal(LayoutNodeWrapper ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo1948localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for (LayoutNodeWrapper layoutNodeWrapper = this; layoutNodeWrapper != null; layoutNodeWrapper = layoutNodeWrapper.wrappedBy) {
            relativeToLocal = layoutNodeWrapper.m2047toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    /* renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2047toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo2069mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m2560plusNvtHpc(position, this.position);
    }

    /* renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2041fromParentPositionMKHz9U(long position) {
        long m2559minusNvtHpc = IntOffsetKt.m2559minusNvtHpc(position, this.position);
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo2069mapOffset8S9VItk(m2559minusNvtHpc, true) : m2559minusNvtHpc;
    }

    protected final void drawBorder(Canvas canvas, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m2567getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m2566getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public void attach() {
        this._isAttached = true;
        onLayerBlockUpdated(this.layerBlock);
        for (LayoutNodeEntity layoutNodeEntity : this.entities) {
            for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
                layoutNodeEntity.onAttach();
            }
        }
    }

    public void detach() {
        for (LayoutNodeEntity layoutNodeEntity : this.entities) {
            for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
                layoutNodeEntity.onDetach();
            }
        }
        this._isAttached = false;
        onLayerBlockUpdated(this.layerBlock);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public static /* synthetic */ void rectInParent$ui_release$default(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        layoutNodeWrapper.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void rectInParent$ui_release(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long m2043getMinimumTouchTargetSizeNHjbRc = m2043getMinimumTouchTargetSizeNHjbRc();
                    float m1335getWidthimpl = Size.m1335getWidthimpl(m2043getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m1333getHeightimpl = Size.m1333getHeightimpl(m2043getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-m1335getWidthimpl, -m1333getHeightimpl, IntSize.m2567getWidthimpl(mo1946getSizeYbymL2g()) + m1335getWidthimpl, IntSize.m2566getHeightimpl(mo1946getSizeYbymL2g()) + m1333getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m2567getWidthimpl(mo1946getSizeYbymL2g()), IntSize.m2566getHeightimpl(mo1946getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m2553getXimpl = IntOffset.m2553getXimpl(this.position);
        bounds.setLeft(bounds.getLeft() + m2553getXimpl);
        bounds.setRight(bounds.getRight() + m2553getXimpl);
        float m2554getYimpl = IntOffset.m2554getYimpl(this.position);
        bounds.setTop(bounds.getTop() + m2554getYimpl);
        bounds.setBottom(bounds.getBottom() + m2554getYimpl);
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float m2553getXimpl = IntOffset.m2553getXimpl(this.position);
        bounds.setLeft(bounds.getLeft() - m2553getXimpl);
        bounds.setRight(bounds.getRight() - m2553getXimpl);
        float m2554getYimpl = IntOffset.m2554getYimpl(this.position);
        bounds.setTop(bounds.getTop() - m2554getYimpl);
        bounds.setBottom(bounds.getBottom() - m2554getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m2567getWidthimpl(mo1946getSizeYbymL2g()), IntSize.m2566getHeightimpl(mo1946getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m2048withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m1309isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo2068isInLayerk4lQ0M(pointerPosition);
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m2046isPointerInBoundsk4lQ0M(long pointerPosition) {
        float m1297getXimpl = Offset.m1297getXimpl(pointerPosition);
        float m1298getYimpl = Offset.m1298getYimpl(pointerPosition);
        return m1297getXimpl >= 0.0f && m1298getYimpl >= 0.0f && m1297getXimpl < ((float) getMeasuredWidth()) && m1298getYimpl < ((float) getMeasuredHeight());
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.invalidateLayer();
        }
    }

    public void onModifierChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final LayoutNodeWrapper findCommonAncestor$ui_release(LayoutNodeWrapper other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.layoutNode;
        LayoutNode layoutNode2 = this.layoutNode;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode2.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper = this;
            while (layoutNodeWrapper != outerLayoutNodeWrapper$ui_release && layoutNodeWrapper != other) {
                layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
                Intrinsics.checkNotNull(layoutNodeWrapper);
            }
            return layoutNodeWrapper == other ? other : this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == this.layoutNode ? this : layoutNode == other.layoutNode ? other : layoutNode.getInnerLayoutNodeWrapper();
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        PointerInputEntity pointerInputEntity = (PointerInputEntity) EntityList.m1996head0OSVbXo(this.entities, EntityList.INSTANCE.m2002getPointerInputEntityTypeEEbPh1w());
        if (pointerInputEntity != null && pointerInputEntity.shouldSharePointerInputWithSiblings()) {
            return true;
        }
        LayoutNodeWrapper wrapped = getWrapped();
        return wrapped != null && wrapped.shouldSharePointerInputWithSiblings();
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m2037offsetFromEdgeMKHz9U(long pointerPosition) {
        float m1297getXimpl = Offset.m1297getXimpl(pointerPosition);
        float max = Math.max(0.0f, m1297getXimpl < 0.0f ? -m1297getXimpl : m1297getXimpl - getMeasuredWidth());
        float m1298getYimpl = Offset.m1298getYimpl(pointerPosition);
        return OffsetKt.Offset(max, Math.max(0.0f, m1298getYimpl < 0.0f ? -m1298getYimpl : m1298getYimpl - getMeasuredHeight()));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m2039calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1335getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1333getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m2040distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m1335getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m1333getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long m2039calculateMinimumTouchTargetPaddingE7KxVPU = m2039calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float m1335getWidthimpl = Size.m1335getWidthimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU);
        float m1333getHeightimpl = Size.m1333getHeightimpl(m2039calculateMinimumTouchTargetPaddingE7KxVPU);
        long m2037offsetFromEdgeMKHz9U = m2037offsetFromEdgeMKHz9U(pointerPosition);
        if ((m1335getWidthimpl > 0.0f || m1333getHeightimpl > 0.0f) && Offset.m1297getXimpl(m2037offsetFromEdgeMKHz9U) <= m1335getWidthimpl && Offset.m1298getYimpl(m2037offsetFromEdgeMKHz9U) <= m1333getHeightimpl) {
            return Offset.m1296getDistanceSquaredimpl(m2037offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* compiled from: LayoutNodeWrapper.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "Landroidx/compose/ui/node/PointerInputEntity;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "getPointerInputSource", "()Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "SemanticsSource", "Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "", "onCommitAffectingLayerParams", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return LayoutNodeWrapper.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return LayoutNodeWrapper.SemanticsSource;
        }
    }
}
