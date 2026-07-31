package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusOrderModifierToProperties;
import androidx.compose.ui.focus.FocusPropertiesModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4834q2;
import com.ironsource.Y3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 ß\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\bß\u0002à\u0002á\u0002â\u0002B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u0012J\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\rJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010,J-\u00100\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.2\n\u0010&\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00104J!\u00109\u001a\u0004\u0018\u0001082\u0006\u00106\u001a\u0002052\u0006\u0010\"\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000bH\u0002¢\u0006\u0004\b;\u0010\rJ\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b<\u0010$J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\u001aJ\u000f\u0010>\u001a\u00020\u000bH\u0002¢\u0006\u0004\b>\u0010\rJ\u000f\u0010?\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010\rJ\u001f\u0010D\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0000H\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0000¢\u0006\u0004\bF\u0010GJ\u000f\u0010J\u001a\u00020\u000bH\u0000¢\u0006\u0004\bI\u0010\rJ'\u0010O\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0000¢\u0006\u0004\bM\u0010NJ\u0017\u0010T\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010V\u001a\u00020\u000bH\u0000¢\u0006\u0004\bU\u0010\rJ\u000f\u0010W\u001a\u00020\u0015H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020\u000bH\u0000¢\u0006\u0004\bY\u0010\rJ!\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\\0[0'H\u0000¢\u0006\u0004\b]\u0010^J\u001f\u0010c\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u00132\u0006\u0010a\u001a\u00020\u0013H\u0000¢\u0006\u0004\bb\u0010GJ\u000f\u0010e\u001a\u00020\u000bH\u0000¢\u0006\u0004\bd\u0010\rJ\u0017\u0010j\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020fH\u0000¢\u0006\u0004\bh\u0010iJ?\u0010t\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020k2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m2\b\b\u0002\u0010p\u001a\u00020\u00072\b\b\u0002\u0010q\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJ?\u0010x\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020k2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020u0m2\b\b\u0002\u0010p\u001a\u00020\u00072\b\b\u0002\u0010q\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010sJ\u000f\u0010z\u001a\u00020\u000bH\u0000¢\u0006\u0004\by\u0010\rJ\u000f\u0010|\u001a\u00020\u000bH\u0000¢\u0006\u0004\b{\u0010\rJ\u000f\u0010~\u001a\u00020\u000bH\u0000¢\u0006\u0004\b}\u0010\rJ\u001f\u0010\u0083\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u00130\u007fH\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u000b2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008b\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u008a\u0001\u0010\nJ\u001c\u0010\u008d\u0001\u001a\u00020\u000b2\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0005\b\u008c\u0001\u0010\nJ\u0011\u0010\u008f\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u008e\u0001\u0010\rJ\u0011\u0010\u0091\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0090\u0001\u0010\rJ#\u0010\u0097\u0001\u001a\u00030\u0094\u00012\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J&\u0010\u009a\u0001\u001a\u00020\u00072\f\b\u0002\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009c\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u009b\u0001\u0010\rJ\u0011\u0010\u009e\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u009d\u0001\u0010\rJ\"\u0010¡\u0001\u001a\u00020\u000b2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001b\u0010£\u0001\u001a\u00020\u00132\u0007\u0010¢\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¥\u0001\u001a\u00020\u00132\u0007\u0010¢\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b¥\u0001\u0010¤\u0001J\u001b\u0010§\u0001\u001a\u00020\u00132\u0007\u0010¦\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b§\u0001\u0010¤\u0001J\u001b\u0010¨\u0001\u001a\u00020\u00132\u0007\u0010¦\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b¨\u0001\u0010¤\u0001J\u0011\u0010©\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b©\u0001\u0010\rJ\u0011\u0010ª\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bª\u0001\u0010\rJ\u0011\u0010¬\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0005\b«\u0001\u0010\rR\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R!\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010±\u0001R\u0019\u0010³\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u00ad\u0001R\u001b\u0010´\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R,\u0010Q\u001a\u0004\u0018\u00010P2\t\u0010¶\u0001\u001a\u0004\u0018\u00010P8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bQ\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R'\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0014\u0010¯\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R,\u0010¿\u0001\u001a\u00030¾\u00012\b\u0010¶\u0001\u001a\u00030¾\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001f\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u0002080'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010±\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u00ad\u0001R\u001d\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010±\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u00ad\u0001R4\u0010É\u0001\u001a\u00030Ç\u00012\b\u0010È\u0001\u001a\u00030Ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R \u0010Ð\u0001\u001a\u00030Ï\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R4\u0010Õ\u0001\u001a\u00030Ô\u00012\b\u0010È\u0001\u001a\u00030Ô\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R \u0010Ü\u0001\u001a\u00030Û\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R4\u0010á\u0001\u001a\u00030à\u00012\b\u0010È\u0001\u001a\u00030à\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R*\u0010è\u0001\u001a\u00030ç\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R \u0010ï\u0001\u001a\u00030î\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R)\u0010ó\u0001\u001a\u00020\u00072\u0007\u0010¶\u0001\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\bó\u0001\u0010\u00ad\u0001\u001a\u0005\bó\u0001\u0010\u001aR*\u0010ô\u0001\u001a\u00020\u00132\u0007\u0010¶\u0001\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bô\u0001\u0010¯\u0001\u001a\u0006\bõ\u0001\u0010»\u0001R\u0019\u0010ö\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010¯\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010¯\u0001R*\u0010ù\u0001\u001a\u00030ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R*\u0010ÿ\u0001\u001a\u00030ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÿ\u0001\u0010ú\u0001\u001a\u0006\b\u0080\u0002\u0010ü\u0001\"\u0006\b\u0081\u0002\u0010þ\u0001R\u001a\u0010\u0082\u0002\u001a\u00030ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010ú\u0001R.\u0010\u0083\u0002\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b\u0083\u0002\u0010\u00ad\u0001\u0012\u0005\b\u0086\u0002\u0010\r\u001a\u0005\b\u0084\u0002\u0010\u001a\"\u0005\b\u0085\u0002\u0010\nR\u001f\u0010\u0087\u0002\u001a\u0002058\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001a\u0010\u008f\u0002\u001a\u00030\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R,\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001b\u0010\u0098\u0002\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0088\u0002R'\u0010\u0099\u0002\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0099\u0002\u0010\u00ad\u0001\u001a\u0005\b\u009a\u0002\u0010\u001a\"\u0005\b\u009b\u0002\u0010\nR\u001f\u0010\u009c\u0002\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R*\u0010 \u0002\u001a\u00020.2\u0007\u0010¶\u0001\u001a\u00020.8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b \u0002\u0010\u009d\u0002\u001a\u0006\b¡\u0002\u0010\u009f\u0002R/\u0010\"\u001a\u00020!2\u0007\u0010È\u0001\u001a\u00020!8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\"\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0005\b¥\u0002\u0010$R8\u0010§\u0002\u001a\u0011\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u000b\u0018\u00010¦\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R8\u0010\u00ad\u0002\u001a\u0011\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u000b\u0018\u00010¦\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010¨\u0002\u001a\u0006\b®\u0002\u0010ª\u0002\"\u0006\b¯\u0002\u0010¬\u0002R-\u0010°\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\\0[\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0001R'\u0010±\u0002\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b±\u0002\u0010\u00ad\u0001\u001a\u0005\b²\u0002\u0010\u001a\"\u0005\b³\u0002\u0010\nR\u0019\u0010´\u0002\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010\u00ad\u0001R)\u0010µ\u0002\u001a\u00020\u00072\u0007\u0010¶\u0001\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bµ\u0002\u0010\u00ad\u0001\u001a\u0005\b¶\u0002\u0010\u001aR)\u0010·\u0002\u001a\u00020\u00072\u0007\u0010¶\u0001\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b·\u0002\u0010\u00ad\u0001\u001a\u0005\b¸\u0002\u0010\u001aR\u001e\u0010º\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0019\u0010½\u0002\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010\u008a\u0002R\u001e\u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R#\u0010Ä\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000'8@X\u0080\u0004¢\u0006\u000e\u0012\u0005\bÃ\u0002\u0010\r\u001a\u0005\bÂ\u0002\u0010^R\u001e\u0010Æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010À\u0002R\u0019\u0010É\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002R\u0016\u0010Ê\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0002\u0010\u001aR#\u0010Í\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000'8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bÌ\u0002\u0010\r\u001a\u0005\bË\u0002\u0010^R\u0016\u0010Î\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0002\u0010\u001aR\u0017\u0010¦\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010»\u0001R\u0017\u0010¢\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010»\u0001R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0017\u0010Ö\u0002\u001a\u0002058@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010\u008a\u0002R\u0018\u0010Ú\u0002\u001a\u00030×\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Þ\u0002\u001a\u0005\u0018\u00010Û\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010Ý\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006ã\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "isVirtual", "<init>", "(Z)V", "", "recreateUnfoldedChildrenIfDirty", "()V", "invalidateUnfoldedVirtualChildren", "onZSortedChildrenInvalidated", "child", "onChildRemoved", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "depth", "", "debugTreeToString", "(I)Ljava/lang/String;", "onDensityOrLayoutDirectionChanged", "hasNewPositioningCallback", "()Z", "markNodeAndSubtreeAsPlaced", "it", "rescheduleRemeasureOrRelayout", "markSubtreeAsNotPlaced", "onBeforeLayoutChildren", "alignmentLinesQueriedByModifier", "Landroidx/compose/ui/Modifier;", "modifier", "setModifierLocals", "(Landroidx/compose/ui/Modifier;)V", "Landroidx/compose/ui/focus/FocusOrderModifier;", "mod", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/ModifierLocalConsumerEntity;", "consumers", "Landroidx/compose/ui/focus/FocusPropertiesModifier;", "findFocusPropertiesModifier", "(Landroidx/compose/ui/focus/FocusOrderModifier;Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/focus/FocusPropertiesModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", IronSourceConstants.EVENTS_PROVIDER, "addModifierLocalConsumer", "(Landroidx/compose/ui/modifier/ModifierLocalConsumer;Landroidx/compose/ui/node/ModifierLocalProviderEntity;Landroidx/compose/runtime/collection/MutableVector;)V", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "addModifierLocalProvider", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;Landroidx/compose/ui/node/ModifierLocalProviderEntity;)Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "toWrap", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/node/ModifiedLayoutNode;", "reuseLayoutNodeWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)Landroidx/compose/ui/node/ModifiedLayoutNode;", "copyWrappersToCache", "markReusedModifiers", "shouldInvalidateParentLayer", "clearSubtreeIntrinsicsUsage", "clearSubtreePlacementIntrinsicsUsage", "index", C4834q2.p, "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "removeAll", "from", "to", "move$ui_release", "(III)V", "move", "Landroidx/compose/ui/node/Owner;", "owner", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "toString", "()Ljava/lang/String;", "invalidateLayer$ui_release", "invalidateLayer", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "getOrCreateOnPositionedCallbacks$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "getOrCreateOnPositionedCallbacks", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "place$ui_release", "place", "replace$ui_release", "replace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "Landroidx/compose/ui/semantics/SemanticsEntity;", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "onNodePlaced$ui_release", "onNodePlaced", "layoutChildren$ui_release", "layoutChildren", "onAlignmentsChanged$ui_release", "onAlignmentsChanged", "", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLines$ui_release", "()Ljava/util/Map;", "calculateAlignmentLines", "Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "handleMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "handleMeasureResult", "forceRequest", "requestRemeasure$ui_release", "requestRemeasure", "requestRelayout$ui_release", "requestRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "remeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "performMeasure-BRTryo0$ui_release", "(J)V", "performMeasure", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRemeasure", "onLayoutComplete", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "Z", "virtualChildrenCount", "I", "_foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "_foldedParent", "Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "wrapperCache", "ignoreRemeasureRequests", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope$ui_release", "()Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "getAlignmentLines$ui_release", "()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "isPlaced", "placeOrder", "getPlaceOrder$ui_release", "previousPlaceOrder", "nextChildPlaceOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "getIntrinsicsUsageByParent$ui_release", "setIntrinsicsUsageByParent$ui_release", "previousIntrinsicsUsageByParent", "canMultiMeasure", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "innerLayoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "getInnerLayoutNodeWrapper$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "outerMeasurablePlaceable", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "", "zIndex", "F", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "_innerLayerWrapper", "innerLayerWrapperIsDirty", "getInnerLayerWrapperIsDirty$ui_release", "setInnerLayerWrapperIsDirty$ui_release", "modifierLocalsHead", "Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "getModifierLocalsHead$ui_release", "()Landroidx/compose/ui/node/ModifierLocalProviderEntity;", "modifierLocalsTail", "getModifierLocalsTail$ui_release", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "Lkotlin/Function1;", "onAttach", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onPositionedCallbacks", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "relayoutWithoutParentInProgress", "measurePending", "getMeasurePending$ui_release", "layoutPending", "getLayoutPending$ui_release", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "getInnerLayerWrapper", "innerLayerWrapper", "", "getFoldedChildren$ui_release", "()Ljava/util/List;", "foldedChildren", "get_children$ui_release", "get_children$ui_release$annotations", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parent", "isAttached", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValid", "getWidth", "getHeight", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "getOuterLayoutNodeWrapper$ui_release", "outerLayoutNodeWrapper", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "", "getParentData", "()Ljava/lang/Object;", "parentData", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LayoutNode implements Measurable, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, Owner.OnLayoutCompletedListener {
    private final Comparator ZComparator;
    private final MutableVector _foldedChildren;
    private LayoutNode _foldedParent;
    private LayoutNodeWrapper _innerLayerWrapper;
    private MutableVector _unfoldedChildren;
    private final MutableVector _zSortedChildren;
    private final LayoutNodeAlignmentLines alignmentLines;
    private boolean canMultiMeasure;
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerWrapperIsDirty;
    private final LayoutNodeWrapper innerLayoutNodeWrapper;
    private final IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isPlaced;
    private final boolean isVirtual;
    private LayoutDirection layoutDirection;
    private boolean layoutPending;
    private LayoutState layoutState;
    private boolean measurePending;
    private MeasurePolicy measurePolicy;
    private final MeasureScope measureScope;
    private UsageByParent measuredByParent;
    private Modifier modifier;
    private final ModifierLocalProviderEntity modifierLocalsHead;
    private ModifierLocalProviderEntity modifierLocalsTail;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;
    private Function1 onAttach;
    private Function1 onDetach;
    private MutableVector onPositionedCallbacks;
    private final OuterMeasurablePlaceable outerMeasurablePlaceable;
    private Owner owner;
    private int placeOrder;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private MutableVector wrapperCache;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo37measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m2021measure3p2s80s(measureScope, list, j);
        }

        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m2021measure3p2s80s(MeasureScope measure, List measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };
    private static final Function0 Constructor = new Function0() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final LayoutNode mo4828invoke() {
            return new LayoutNode(false, 1, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo2020getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m2544getZeroMYxV2XQ();
        }
    };
    private static final ProvidableModifierLocal ModifierLocalNothing = ModifierLocalKt.modifierLocalOf(new Function0() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ModifierLocalNothing$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Void mo4828invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read");
        }
    });
    private static final LayoutNode$Companion$SentinelModifierLocalProvider$1 SentinelModifierLocalProvider = new ModifierLocalProvider() { // from class: androidx.compose.ui.node.LayoutNode$Companion$SentinelModifierLocalProvider$1
        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public ProvidableModifierLocal getKey() {
            ProvidableModifierLocal providableModifierLocal;
            providableModifierLocal = LayoutNode.ModifierLocalNothing;
            return providableModifierLocal;
        }

        @Override // androidx.compose.ui.modifier.ModifierLocalProvider
        public Void getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read");
        }
    };

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode(boolean z) {
        this.isVirtual = z;
        this._foldedChildren = new MutableVector(new LayoutNode[16], 0);
        this.layoutState = LayoutState.Idle;
        this.wrapperCache = new MutableVector(new ModifiedLayoutNode[16], 0);
        this._zSortedChildren = new MutableVector(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.measureScope = new LayoutNode$measureScope$1(this);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.measuredByParent = usageByParent;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.innerLayoutNodeWrapper = innerPlaceable;
        this.outerMeasurablePlaceable = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.innerLayerWrapperIsDirty = true;
        ModifierLocalProviderEntity modifierLocalProviderEntity = new ModifierLocalProviderEntity(this, SentinelModifierLocalProvider);
        this.modifierLocalsHead = modifierLocalProviderEntity;
        this.modifierLocalsTail = modifierLocalProviderEntity;
        this.modifier = Modifier.INSTANCE;
        this.ZComparator = new Comparator() { // from class: androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m2012ZComparator$lambda52;
                m2012ZComparator$lambda52 = LayoutNode.m2012ZComparator$lambda52((LayoutNode) obj, (LayoutNode) obj2);
                return m2012ZComparator$lambda52;
            }
        };
    }

    public /* synthetic */ LayoutNode(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final List getFoldedChildren$ui_release() {
        return this._foldedChildren.asMutableList();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector mutableVector2 = this._foldedChildren;
            int size = mutableVector2.getSize();
            if (size > 0) {
                Object[] content = mutableVector2.getContent();
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (parent$ui_release = getParent$ui_release()) == null) {
            return;
        }
        parent$ui_release.unfoldedVirtualChildrenListDirty = true;
    }

    public final MutableVector get_children$ui_release() {
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren;
        }
        recreateUnfoldedChildrenIfDirty();
        MutableVector mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final List getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode == null || !layoutNode.isVirtual) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.getParent$ui_release();
        }
        return null;
    }

    /* renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    public boolean isAttached() {
        return this.owner != null;
    }

    /* renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: getLayoutState$ui_release, reason: from getter */
    public final LayoutState getLayoutState() {
        return this.layoutState;
    }

    public final void insertAt$ui_release(int index, LayoutNode instance) {
        MutableVector mutableVector;
        int size;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i = 0;
        LayoutNodeWrapper layoutNodeWrapper = null;
        if (instance._foldedParent != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance.owner != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated();
        if (instance.isVirtual) {
            if (this.isVirtual) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent");
            }
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = instance.getOuterLayoutNodeWrapper$ui_release();
        if (this.isVirtual) {
            LayoutNode layoutNode2 = this._foldedParent;
            if (layoutNode2 != null) {
                layoutNodeWrapper = layoutNode2.innerLayoutNodeWrapper;
            }
        } else {
            layoutNodeWrapper = this.innerLayoutNodeWrapper;
        }
        outerLayoutNodeWrapper$ui_release.setWrappedBy$ui_release(layoutNodeWrapper);
        if (instance.isVirtual && (size = (mutableVector = instance._foldedChildren).getSize()) > 0) {
            Object[] content = mutableVector.getContent();
            do {
                ((LayoutNode) content[i]).getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(this.innerLayoutNodeWrapper);
                i++;
            } while (i < size);
        }
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onZSortedChildrenInvalidated() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int index, int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("count (" + count + ") must be greater than 0").toString());
        }
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            onChildRemoved((LayoutNode) this._foldedChildren.removeAt(i));
            if (i == index) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved((LayoutNode) this._foldedChildren.getContent()[size]);
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    private final void onChildRemoved(LayoutNode child) {
        if (this.owner != null) {
            child.detach$ui_release();
        }
        child._foldedParent = null;
        child.getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector mutableVector = child._foldedChildren;
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated();
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i = 0; i < count; i++) {
            this._foldedChildren.add(from > to ? to + i : (to + count) - 2, (LayoutNode) this._foldedChildren.removeAt(from > to ? from + i : from));
        }
        onZSortedChildrenInvalidated();
        invalidateUnfoldedVirtualChildren();
        requestRemeasure$ui_release$default(this, false, 1, null);
    }

    public final void attach$ui_release(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode != null) {
            if (!Intrinsics.areEqual(layoutNode != null ? layoutNode.owner : null, owner)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(owner);
                sb.append(") than the parent's owner(");
                LayoutNode parent$ui_release = getParent$ui_release();
                sb.append(parent$ui_release != null ? parent$ui_release.owner : null);
                sb.append("). This tree: ");
                sb.append(debugTreeToString$default(this, 0, 1, null));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode2 = this._foldedParent;
                sb.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            this.isPlaced = true;
        }
        this.owner = owner;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onAttach(this);
        MutableVector mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).attach$ui_release(owner);
                i++;
            } while (i < size);
        }
        requestRemeasure$ui_release$default(this, false, 1, null);
        if (parent$ui_release2 != null) {
            requestRemeasure$ui_release$default(parent$ui_release2, false, 1, null);
        }
        LayoutNodeWrapper wrapped = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            outerLayoutNodeWrapper$ui_release.attach();
        }
        for (ModifierLocalProviderEntity modifierLocalProviderEntity = this.modifierLocalsHead; modifierLocalProviderEntity != null; modifierLocalProviderEntity = modifierLocalProviderEntity.getNext()) {
            modifierLocalProviderEntity.attach();
        }
        Function1 function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            requestRemeasure$ui_release$default(parent$ui_release2, false, 1, null);
        }
        this.alignmentLines.reset$ui_release();
        Function1 function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        for (ModifierLocalProviderEntity modifierLocalProviderEntity = this.modifierLocalsHead; modifierLocalProviderEntity != null; modifierLocalProviderEntity = modifierLocalProviderEntity.getNext()) {
            modifierLocalProviderEntity.detach();
        }
        LayoutNodeWrapper wrapped = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            outerLayoutNodeWrapper$ui_release.detach();
        }
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).detach$ui_release();
                i++;
            } while (i < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FocusPropertiesModifier findFocusPropertiesModifier(FocusOrderModifier mod, MutableVector consumers) {
        Object obj;
        int size = consumers.getSize();
        if (size > 0) {
            Object[] content = consumers.getContent();
            int i = 0;
            do {
                obj = content[i];
                ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) obj;
                if ((modifierLocalConsumerEntity.getModifier() instanceof FocusPropertiesModifier) && (((FocusPropertiesModifier) modifierLocalConsumerEntity.getModifier()).getFocusPropertiesScope() instanceof FocusOrderModifierToProperties) && ((FocusOrderModifierToProperties) ((FocusPropertiesModifier) modifierLocalConsumerEntity.getModifier()).getFocusPropertiesScope()).getModifier() == mod) {
                    break;
                }
                i++;
            } while (i < size);
        }
        obj = null;
        ModifierLocalConsumerEntity modifierLocalConsumerEntity2 = (ModifierLocalConsumerEntity) obj;
        ModifierLocalConsumer modifier = modifierLocalConsumerEntity2 != null ? modifierLocalConsumerEntity2.getModifier() : null;
        if (modifier instanceof FocusPropertiesModifier) {
            return (FocusPropertiesModifier) modifier;
        }
        return null;
    }

    public final MutableVector getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(this.ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* renamed from: isValid */
    public boolean getIsAttached() {
        return isAttached();
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                sb.append(((LayoutNode) content[i2]).debugTreeToString(depth + 1));
                i2++;
            } while (i2 < size);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "tree.toString()");
        if (depth != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        private final String error;

        public NoIntrinsicsMeasurePolicy(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2022maxIntrinsicHeight(intrinsicMeasureScope, list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2023maxIntrinsicWidth(intrinsicMeasureScope, list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2024minIntrinsicHeight(intrinsicMeasureScope, list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2025minIntrinsicWidth(intrinsicMeasureScope, list, i)).intValue();
        }

        /* renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m2025minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m2024minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m2023maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        /* renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m2022maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        requestRemeasure$ui_release$default(this, false, 1, null);
    }

    /* renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.density, value)) {
            return;
        }
        this.density = value;
        onDensityOrLayoutDirectionChanged();
    }

    /* renamed from: getMeasureScope$ui_release, reason: from getter */
    public final MeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "<set-?>");
        this.viewConfiguration = viewConfiguration;
    }

    private final void onDensityOrLayoutDirectionChanged() {
        requestRemeasure$ui_release$default(this, false, 1, null);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    public int getWidth() {
        return this.outerMeasurablePlaceable.getWidth();
    }

    public int getHeight() {
        return this.outerMeasurablePlaceable.getHeight();
    }

    /* renamed from: getAlignmentLines$ui_release, reason: from getter */
    public final LayoutNodeAlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* renamed from: isPlaced, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    /* renamed from: getPlaceOrder$ui_release, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    /* renamed from: getMeasuredByParent$ui_release, reason: from getter */
    public final UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void setMeasuredByParent$ui_release(UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    /* renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    /* renamed from: getInnerLayoutNodeWrapper$ui_release, reason: from getter */
    public final LayoutNodeWrapper getInnerLayoutNodeWrapper() {
        return this.innerLayoutNodeWrapper;
    }

    public final LayoutNodeWrapper getOuterLayoutNodeWrapper$ui_release() {
        return this.outerMeasurablePlaceable.getOuterWrapper();
    }

    /* renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public final void setInnerLayerWrapperIsDirty$ui_release(boolean z) {
        this.innerLayerWrapperIsDirty = z;
    }

    private final LayoutNodeWrapper getInnerLayerWrapper() {
        if (this.innerLayerWrapperIsDirty) {
            LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
            LayoutNodeWrapper wrappedBy = getOuterLayoutNodeWrapper$ui_release().getWrappedBy();
            this._innerLayerWrapper = null;
            while (true) {
                if (Intrinsics.areEqual(layoutNodeWrapper, wrappedBy)) {
                    break;
                }
                if ((layoutNodeWrapper != null ? layoutNodeWrapper.getLayer() : null) != null) {
                    this._innerLayerWrapper = layoutNodeWrapper;
                    break;
                }
                layoutNodeWrapper = layoutNodeWrapper != null ? layoutNodeWrapper.getWrappedBy() : null;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this._innerLayerWrapper;
        if (layoutNodeWrapper2 == null || layoutNodeWrapper2.getLayer() != null) {
            return layoutNodeWrapper2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: getModifierLocalsHead$ui_release, reason: from getter */
    public final ModifierLocalProviderEntity getModifierLocalsHead() {
        return this.modifierLocalsHead;
    }

    /* renamed from: getModifierLocalsTail$ui_release, reason: from getter */
    public final ModifierLocalProviderEntity getModifierLocalsTail() {
        return this.modifierLocalsTail;
    }

    public final void invalidateLayer$ui_release() {
        LayoutNodeWrapper innerLayerWrapper = getInnerLayerWrapper();
        if (innerLayerWrapper != null) {
            innerLayerWrapper.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier value) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        Owner owner;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, this.modifier)) {
            return;
        }
        if (!Intrinsics.areEqual(getModifier(), Modifier.INSTANCE) && this.isVirtual) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.modifier = value;
        boolean shouldInvalidateParentLayer = shouldInvalidateParentLayer();
        copyWrappersToCache();
        LayoutNodeWrapper wrapped = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            EntityList.m1990clearimpl(outerLayoutNodeWrapper$ui_release.getEntities());
        }
        markReusedModifiers(value);
        LayoutNodeWrapper outerWrapper = this.outerMeasurablePlaceable.getOuterWrapper();
        if (SemanticsNodeKt.getOuterSemantics(this) != null && isAttached()) {
            Owner owner2 = this.owner;
            Intrinsics.checkNotNull(owner2);
            owner2.onSemanticsChange();
        }
        boolean hasNewPositioningCallback = hasNewPositioningCallback();
        MutableVector mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        this.innerLayoutNodeWrapper.onInitialize();
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) getModifier().foldOut(this.innerLayoutNodeWrapper, new Function2() { // from class: androidx.compose.ui.node.LayoutNode$modifier$outerWrapper$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final LayoutNodeWrapper invoke(@NotNull Modifier.Element mod, @NotNull LayoutNodeWrapper toWrap) {
                ModifiedLayoutNode reuseLayoutNodeWrapper;
                Intrinsics.checkNotNullParameter(mod, "mod");
                Intrinsics.checkNotNullParameter(toWrap, "toWrap");
                if (mod instanceof RemeasurementModifier) {
                    ((RemeasurementModifier) mod).onRemeasurementAvailable(LayoutNode.this);
                }
                EntityList.m1989addBeforeLayoutModifierimpl(toWrap.getEntities(), toWrap, mod);
                if (mod instanceof OnGloballyPositionedModifier) {
                    LayoutNode.this.getOrCreateOnPositionedCallbacks$ui_release().add(TuplesKt.to(toWrap, mod));
                }
                if (mod instanceof LayoutModifier) {
                    LayoutModifier layoutModifier = (LayoutModifier) mod;
                    reuseLayoutNodeWrapper = LayoutNode.this.reuseLayoutNodeWrapper(toWrap, layoutModifier);
                    if (reuseLayoutNodeWrapper == null) {
                        reuseLayoutNodeWrapper = new ModifiedLayoutNode(toWrap, layoutModifier);
                    }
                    toWrap = reuseLayoutNodeWrapper;
                    toWrap.onInitialize();
                }
                EntityList.m1988addAfterLayoutModifierimpl(toWrap.getEntities(), toWrap, mod);
                return toWrap;
            }
        });
        setModifierLocals(value);
        LayoutNode parent$ui_release3 = getParent$ui_release();
        layoutNodeWrapper.setWrappedBy$ui_release(parent$ui_release3 != null ? parent$ui_release3.innerLayoutNodeWrapper : null);
        this.outerMeasurablePlaceable.setOuterWrapper(layoutNodeWrapper);
        if (isAttached()) {
            MutableVector mutableVector2 = this.wrapperCache;
            int size = mutableVector2.getSize();
            if (size > 0) {
                Object[] content = mutableVector2.getContent();
                int i = 0;
                do {
                    ((ModifiedLayoutNode) content[i]).detach();
                    i++;
                } while (i < size);
            }
            LayoutNodeWrapper wrapped2 = this.innerLayoutNodeWrapper.getWrapped();
            for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release2 = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release2, wrapped2) && outerLayoutNodeWrapper$ui_release2 != null; outerLayoutNodeWrapper$ui_release2 = outerLayoutNodeWrapper$ui_release2.getWrapped()) {
                if (!outerLayoutNodeWrapper$ui_release2.isAttached()) {
                    outerLayoutNodeWrapper$ui_release2.attach();
                } else {
                    for (LayoutNodeEntity layoutNodeEntity : outerLayoutNodeWrapper$ui_release2.getEntities()) {
                        for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
                            layoutNodeEntity.onAttach();
                        }
                    }
                }
            }
        }
        this.wrapperCache.clear();
        LayoutNodeWrapper wrapped3 = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release3 = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release3, wrapped3) && outerLayoutNodeWrapper$ui_release3 != null; outerLayoutNodeWrapper$ui_release3 = outerLayoutNodeWrapper$ui_release3.getWrapped()) {
            outerLayoutNodeWrapper$ui_release3.onModifierChanged();
        }
        if (!Intrinsics.areEqual(outerWrapper, this.innerLayoutNodeWrapper) || !Intrinsics.areEqual(layoutNodeWrapper, this.innerLayoutNodeWrapper)) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        } else if (this.layoutState == LayoutState.Idle && !this.measurePending && hasNewPositioningCallback) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        } else if (EntityList.m1994has0OSVbXo(this.innerLayoutNodeWrapper.getEntities(), EntityList.INSTANCE.m2000getOnPlacedEntityTypeEEbPh1w()) && (owner = this.owner) != null) {
            owner.registerOnLayoutCompletedListener(this);
        }
        Object parentData = getParentData();
        this.outerMeasurablePlaceable.recalculateParentData();
        if (!Intrinsics.areEqual(parentData, getParentData()) && (parent$ui_release2 = getParent$ui_release()) != null) {
            requestRemeasure$ui_release$default(parent$ui_release2, false, 1, null);
        }
        if ((shouldInvalidateParentLayer || shouldInvalidateParentLayer()) && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return this.innerLayoutNodeWrapper;
    }

    public final void setOnAttach$ui_release(Function1 function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(Function1 function1) {
        this.onDetach = function1;
    }

    public final MutableVector getOrCreateOnPositionedCallbacks$ui_release() {
        MutableVector mutableVector = this.onPositionedCallbacks;
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(new Pair[16], 0);
        this.onPositionedCallbacks = mutableVector2;
        return mutableVector2;
    }

    /* renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void place$ui_release(int x, int y) {
        int parentWidth;
        LayoutDirection parentLayoutDirection;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = this.outerMeasurablePlaceable.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        parentWidth = companion.getParentWidth();
        parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        Placeable.PlacementScope.placeRelative$default(companion, this.outerMeasurablePlaceable, x, y, 0.0f, 4, null);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            this.outerMeasurablePlaceable.replace();
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    public final void draw$ui_release(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterLayoutNodeWrapper$ui_release().draw(canvas);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m2013hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m2016hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z2);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m2016hitTestM_7yMNQ$ui_release(long pointerPosition, HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterLayoutNodeWrapper$ui_release().m2045hitTestYqVAtuI(LayoutNodeWrapper.INSTANCE.getPointerInputSource(), getOuterLayoutNodeWrapper$ui_release().m2041fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m2017hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, HitTestResult hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterLayoutNodeWrapper$ui_release().m2045hitTestYqVAtuI(LayoutNodeWrapper.INSTANCE.getSemanticsSource(), getOuterLayoutNodeWrapper$ui_release().m2041fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    private final boolean hasNewPositioningCallback() {
        final MutableVector mutableVector = this.onPositionedCallbacks;
        return ((Boolean) getModifier().foldOut(Boolean.FALSE, new Function2() { // from class: androidx.compose.ui.node.LayoutNode$hasNewPositioningCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((Modifier.Element) obj, ((Boolean) obj2).booleanValue());
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
            
                if (r1 == null) goto L18;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[]] */
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(@NotNull Modifier.Element mod, boolean z) {
                boolean z2;
                Intrinsics.checkNotNullParameter(mod, "mod");
                if (!z) {
                    z2 = false;
                    if (mod instanceof OnGloballyPositionedModifier) {
                        MutableVector<Pair<LayoutNodeWrapper, OnGloballyPositionedModifier>> mutableVector2 = mutableVector;
                        Pair pair = null;
                        if (mutableVector2 != null) {
                            int size = mutableVector2.getSize();
                            if (size > 0) {
                                ?? content = mutableVector2.getContent();
                                int i = 0;
                                while (true) {
                                    ?? r4 = content[i];
                                    if (Intrinsics.areEqual(mod, ((Pair) r4).getSecond())) {
                                        pair = r4;
                                        break;
                                    }
                                    i++;
                                    if (i >= size) {
                                        break;
                                    }
                                }
                            }
                            pair = pair;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = true;
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex = this.innerLayoutNodeWrapper.getZIndex();
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            zIndex += modifiedLayoutNode.getZIndex();
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!getIsPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release != null) {
            if (!this.relayoutWithoutParentInProgress && parent$ui_release.layoutState == LayoutState.LayingOut) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                int i = parent$ui_release.nextChildPlaceOrder;
                this.placeOrder = i;
                parent$ui_release.nextChildPlaceOrder = i + 1;
            }
        } else {
            this.placeOrder = 0;
        }
        layoutChildren$ui_release();
    }

    public final void layoutChildren$ui_release() {
        this.alignmentLines.recalculateQueryOwner$ui_release();
        if (this.layoutPending) {
            onBeforeLayoutChildren();
        }
        if (this.layoutPending) {
            this.layoutPending = false;
            this.layoutState = LayoutState.LayingOut;
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(this, new Function0() { // from class: androidx.compose.ui.node.LayoutNode$layoutChildren$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2026invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2026invoke() {
                    int i;
                    int i2 = 0;
                    LayoutNode.this.nextChildPlaceOrder = 0;
                    MutableVector mutableVector = LayoutNode.this.get_children$ui_release();
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i3 = 0;
                        do {
                            LayoutNode layoutNode = (LayoutNode) content[i3];
                            layoutNode.previousPlaceOrder = layoutNode.getPlaceOrder();
                            layoutNode.placeOrder = Integer.MAX_VALUE;
                            layoutNode.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            if (layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.InLayoutBlock) {
                                layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                            }
                            i3++;
                        } while (i3 < size);
                    }
                    LayoutNode.this.getInnerLayoutNodeWrapper().getMeasureResult().placeChildren();
                    MutableVector mutableVector2 = LayoutNode.this.get_children$ui_release();
                    LayoutNode layoutNode2 = LayoutNode.this;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector2.getContent();
                        do {
                            LayoutNode layoutNode3 = (LayoutNode) content2[i2];
                            i = layoutNode3.previousPlaceOrder;
                            if (i != layoutNode3.getPlaceOrder()) {
                                layoutNode2.onZSortedChildrenInvalidated();
                                layoutNode2.invalidateLayer$ui_release();
                                if (layoutNode3.getPlaceOrder() == Integer.MAX_VALUE) {
                                    layoutNode3.markSubtreeAsNotPlaced();
                                }
                            }
                            layoutNode3.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(layoutNode3.getAlignmentLines().getUsedDuringParentLayout());
                            i2++;
                        } while (i2 < size2);
                    }
                }
            });
            this.layoutState = LayoutState.Idle;
        }
        if (this.alignmentLines.getUsedDuringParentLayout()) {
            this.alignmentLines.setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (this.alignmentLines.getDirty() && this.alignmentLines.getRequired$ui_release()) {
            this.alignmentLines.recalculate();
        }
    }

    private final void markNodeAndSubtreeAsPlaced() {
        this.isPlaced = true;
        LayoutNodeWrapper wrapped = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLastLayerDrawingWasSkipped()) {
                outerLayoutNodeWrapper$ui_release.invalidateLayer();
            }
        }
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout(layoutNode);
                }
                i++;
            } while (i < size);
        }
    }

    private final void rescheduleRemeasureOrRelayout(LayoutNode it) {
        if (WhenMappings.$EnumSwitchMapping$0[it.layoutState.ordinal()] == 1) {
            if (it.measurePending) {
                it.requestRemeasure$ui_release(true);
                return;
            } else {
                if (it.layoutPending) {
                    it.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + it.layoutState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markSubtreeAsNotPlaced() {
        if (getIsPlaced()) {
            int i = 0;
            this.isPlaced = false;
            MutableVector mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    ((LayoutNode) content[i]).markSubtreeAsNotPlaced();
                    i++;
                } while (i < size);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.measurePending && layoutNode.measuredByParent == UsageByParent.InMeasureBlock && m2015remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                    requestRemeasure$ui_release$default(this, false, 1, null);
                }
                i++;
            } while (i < size);
        }
    }

    public final void onAlignmentsChanged$ui_release() {
        if (this.alignmentLines.getDirty()) {
            return;
        }
        this.alignmentLines.setDirty$ui_release(true);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        if (this.alignmentLines.getUsedDuringParentMeasurement()) {
            requestRemeasure$ui_release$default(parent$ui_release, false, 1, null);
        } else if (this.alignmentLines.getPreviousUsedDuringParentLayout()) {
            requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
        }
        if (this.alignmentLines.getUsedByModifierMeasurement()) {
            requestRemeasure$ui_release$default(this, false, 1, null);
        }
        if (this.alignmentLines.getUsedByModifierLayout()) {
            requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
        }
        parent$ui_release.onAlignmentsChanged$ui_release();
    }

    public final Map calculateAlignmentLines$ui_release() {
        if (!this.outerMeasurablePlaceable.getDuringAlignmentLinesQuery$ui_release()) {
            alignmentLinesQueriedByModifier();
        }
        layoutChildren$ui_release();
        return this.alignmentLines.getAlignmentLines();
    }

    private final void alignmentLinesQueriedByModifier() {
        if (this.layoutState == LayoutState.Measuring) {
            this.alignmentLines.setUsedByModifierMeasurement$ui_release(true);
            if (this.alignmentLines.getDirty()) {
                markLayoutPending$ui_release();
                return;
            }
            return;
        }
        this.alignmentLines.setUsedByModifierLayout$ui_release(true);
    }

    public final void handleMeasureResult$ui_release(MeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        this.innerLayoutNodeWrapper.setMeasureResult$ui_release(measureResult);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRemeasure$ui_release(z);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestMeasure(this, forceRequest);
        this.outerMeasurablePlaceable.invalidateIntrinsicsParent(forceRequest);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, forceRequest);
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        MutableVector mutableVector;
        int size;
        if (this.layoutState != LayoutState.Idle || this.layoutPending || this.measurePending || !getIsPlaced() || (mutableVector = this.onPositionedCallbacks) == null || (size = mutableVector.getSize()) <= 0) {
            return;
        }
        Object[] content = mutableVector.getContent();
        int i = 0;
        do {
            Pair pair = (Pair) content[i];
            ((OnGloballyPositionedModifier) pair.getSecond()).onGloballyPositioned((LayoutCoordinates) pair.getFirst());
            i++;
        } while (i < size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModifierLocalProviderEntity addModifierLocalProvider(ModifierLocalProvider mod, ModifierLocalProviderEntity provider) {
        ModifierLocalProviderEntity next = provider.getNext();
        while (next != null && next.getModifier() != mod) {
            next = next.getNext();
        }
        if (next == null) {
            next = new ModifierLocalProviderEntity(this, mod);
        } else {
            ModifierLocalProviderEntity prev = next.getPrev();
            if (prev != null) {
                prev.setNext(next.getNext());
            }
            ModifierLocalProviderEntity next2 = next.getNext();
            if (next2 != null) {
                next2.setPrev(next.getPrev());
            }
        }
        next.setNext(provider.getNext());
        ModifierLocalProviderEntity next3 = provider.getNext();
        if (next3 != null) {
            next3.setPrev(next);
        }
        provider.setNext(next);
        next.setPrev(provider);
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModifiedLayoutNode reuseLayoutNodeWrapper(LayoutNodeWrapper toWrap, LayoutModifier modifier) {
        int i;
        if (this.wrapperCache.isEmpty()) {
            return null;
        }
        MutableVector mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        int i2 = -1;
        if (size > 0) {
            i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) content[i];
                if (modifiedLayoutNode.getToBeReusedForSameModifier() && modifiedLayoutNode.getModifier() == modifier) {
                    break;
                }
                i--;
            } while (i >= 0);
        }
        i = -1;
        if (i < 0) {
            MutableVector mutableVector2 = this.wrapperCache;
            int size2 = mutableVector2.getSize();
            if (size2 > 0) {
                int i3 = size2 - 1;
                Object[] content2 = mutableVector2.getContent();
                while (true) {
                    if (!((ModifiedLayoutNode) content2[i3]).getToBeReusedForSameModifier()) {
                        i2 = i3;
                        break;
                    }
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                }
            }
            i = i2;
        }
        if (i < 0) {
            return null;
        }
        ModifiedLayoutNode modifiedLayoutNode2 = (ModifiedLayoutNode) this.wrapperCache.removeAt(i);
        modifiedLayoutNode2.setModifier(modifier);
        modifiedLayoutNode2.setWrapped(toWrap);
        return modifiedLayoutNode2;
    }

    private final void markReusedModifiers(Modifier modifier) {
        MutableVector mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((ModifiedLayoutNode) content[i]).setToBeReusedForSameModifier(false);
                i++;
            } while (i < size);
        }
        modifier.foldIn(Unit.INSTANCE, new Function2() { // from class: androidx.compose.ui.node.LayoutNode$markReusedModifiers$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Unit) obj, (Modifier.Element) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Unit unit, @NotNull Modifier.Element mod) {
                MutableVector mutableVector2;
                Object obj;
                Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(mod, "mod");
                mutableVector2 = LayoutNode.this.wrapperCache;
                int size2 = mutableVector2.getSize();
                if (size2 > 0) {
                    int i2 = size2 - 1;
                    Object[] content2 = mutableVector2.getContent();
                    do {
                        obj = content2[i2];
                        ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) obj;
                        if (modifiedLayoutNode.getModifier() == mod && !modifiedLayoutNode.getToBeReusedForSameModifier()) {
                            break;
                        } else {
                            i2--;
                        }
                    } while (i2 >= 0);
                }
                obj = null;
                ModifiedLayoutNode modifiedLayoutNode2 = (ModifiedLayoutNode) obj;
                if (modifiedLayoutNode2 == null) {
                    return;
                }
                modifiedLayoutNode2.setToBeReusedForSameModifier(true);
            }
        });
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo1944measureBRTryo0(long constraints) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage();
        }
        return this.outerMeasurablePlaceable.mo1944measureBRTryo0(constraints);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m2015remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.outerMeasurablePlaceable.m2065getLastConstraintsDWUhwKw();
        }
        return layoutNode.m2019remeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m2019remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage();
        }
        return this.outerMeasurablePlaceable.m2066remeasureBRTryo0(constraints.getValue());
    }

    /* renamed from: getMeasurePending$ui_release, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* renamed from: getLayoutPending$ui_release, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    /* renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m2018performMeasureBRTryo0$ui_release(final long constraints) {
        LayoutState layoutState = LayoutState.Measuring;
        this.layoutState = layoutState;
        this.measurePending = false;
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this, new Function0() { // from class: androidx.compose.ui.node.LayoutNode$performMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m2027invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2027invoke() {
                LayoutNode.this.getOuterLayoutNodeWrapper$ui_release().mo1944measureBRTryo0(constraints);
            }
        });
        if (this.layoutState == layoutState) {
            markLayoutPending$ui_release();
            this.layoutState = LayoutState.Idle;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.outerMeasurablePlaceable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        return this.outerMeasurablePlaceable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        return this.outerMeasurablePlaceable.maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        requestRemeasure$ui_release$default(this, false, 1, null);
        Constraints m2065getLastConstraintsDWUhwKw = this.outerMeasurablePlaceable.m2065getLastConstraintsDWUhwKw();
        if (m2065getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo2075measureAndLayout0kLqBqw(this, m2065getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        for (LayoutNodeEntity layoutNodeEntity = this.innerLayoutNodeWrapper.getEntities()[EntityList.INSTANCE.m2000getOnPlacedEntityTypeEEbPh1w()]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
            ((OnPlacedModifier) ((SimpleEntity) layoutNodeEntity).getModifier()).onPlaced(this.innerLayoutNodeWrapper);
        }
    }

    private final void copyWrappersToCache() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            this.wrapperCache.add(modifiedLayoutNode);
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
    }

    public final void invalidateLayers$ui_release() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, layoutNodeWrapper)) {
            ModifiedLayoutNode modifiedLayoutNode = (ModifiedLayoutNode) outerLayoutNodeWrapper$ui_release;
            OwnedLayer layer = modifiedLayoutNode.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerLayoutNodeWrapper$ui_release = modifiedLayoutNode.getWrapped();
        }
        OwnedLayer layer2 = this.innerLayoutNodeWrapper.getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        LayoutNodeWrapper wrapped = this.innerLayoutNodeWrapper.getWrapped();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped()) {
            if (outerLayoutNodeWrapper$ui_release.getLayer() != null) {
                return false;
            }
            if (EntityList.m1994has0OSVbXo(outerLayoutNodeWrapper$ui_release.getEntities(), EntityList.INSTANCE.m1999getDrawEntityTypeEEbPh1w())) {
                return true;
            }
        }
        return true;
    }

    private final void clearSubtreeIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZComparator$lambda-52, reason: not valid java name */
    public static final int m2012ZComparator$lambda52(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f = layoutNode.zIndex;
        float f2 = layoutNode2.zIndex;
        if (f == f2) {
            return Intrinsics.compare(layoutNode.placeOrder, layoutNode2.placeOrder);
        }
        return Float.compare(f, f2);
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0014\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "ModifierLocalNothing", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "NotPlacedPlaceOrder", "I", "androidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1", "SentinelModifierLocalProvider", "Landroidx/compose/ui/node/LayoutNode$Companion$SentinelModifierLocalProvider$1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function0 getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }
    }

    private final void setModifierLocals(Modifier modifier) {
        int i = 0;
        final MutableVector mutableVector = new MutableVector(new ModifierLocalConsumerEntity[16], 0);
        for (ModifierLocalProviderEntity modifierLocalProviderEntity = this.modifierLocalsHead; modifierLocalProviderEntity != null; modifierLocalProviderEntity = modifierLocalProviderEntity.getNext()) {
            mutableVector.addAll(mutableVector.getSize(), modifierLocalProviderEntity.getConsumers());
            modifierLocalProviderEntity.getConsumers().clear();
        }
        ModifierLocalProviderEntity modifierLocalProviderEntity2 = (ModifierLocalProviderEntity) modifier.foldIn(this.modifierLocalsHead, new Function2() { // from class: androidx.compose.ui.node.LayoutNode$setModifierLocals$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final ModifierLocalProviderEntity invoke(@NotNull ModifierLocalProviderEntity lastProvider, @NotNull Modifier.Element mod) {
                ModifierLocalProviderEntity addModifierLocalProvider;
                FocusPropertiesModifier findFocusPropertiesModifier;
                Intrinsics.checkNotNullParameter(lastProvider, "lastProvider");
                Intrinsics.checkNotNullParameter(mod, "mod");
                if (mod instanceof FocusOrderModifier) {
                    FocusOrderModifier focusOrderModifier = (FocusOrderModifier) mod;
                    findFocusPropertiesModifier = LayoutNode.this.findFocusPropertiesModifier(focusOrderModifier, mutableVector);
                    if (findFocusPropertiesModifier == null) {
                        final FocusOrderModifierToProperties focusOrderModifierToProperties = new FocusOrderModifierToProperties(focusOrderModifier);
                        findFocusPropertiesModifier = new FocusPropertiesModifier(focusOrderModifierToProperties, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.ui.node.LayoutNode$setModifierLocals$1$invoke$lambda-1$$inlined$debugInspectorInfo$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((InspectorInfo) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                                inspectorInfo.setName("focusProperties");
                                inspectorInfo.getProperties().set("scope", FocusOrderModifierToProperties.this);
                            }
                        } : InspectableValueKt.getNoInspectorInfo());
                    }
                    LayoutNode.this.addModifierLocalConsumer(findFocusPropertiesModifier, lastProvider, mutableVector);
                    lastProvider = LayoutNode.this.addModifierLocalProvider(findFocusPropertiesModifier, lastProvider);
                }
                if (mod instanceof ModifierLocalConsumer) {
                    LayoutNode.this.addModifierLocalConsumer((ModifierLocalConsumer) mod, lastProvider, mutableVector);
                }
                if (!(mod instanceof ModifierLocalProvider)) {
                    return lastProvider;
                }
                addModifierLocalProvider = LayoutNode.this.addModifierLocalProvider((ModifierLocalProvider) mod, lastProvider);
                return addModifierLocalProvider;
            }
        });
        this.modifierLocalsTail = modifierLocalProviderEntity2;
        this.modifierLocalsTail.setNext(null);
        if (isAttached()) {
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    ((ModifierLocalConsumerEntity) content[i]).detach();
                    i++;
                } while (i < size);
            }
            for (ModifierLocalProviderEntity next = modifierLocalProviderEntity2.getNext(); next != null; next = next.getNext()) {
                next.detach();
            }
            for (ModifierLocalProviderEntity modifierLocalProviderEntity3 = this.modifierLocalsHead; modifierLocalProviderEntity3 != null; modifierLocalProviderEntity3 = modifierLocalProviderEntity3.getNext()) {
                modifierLocalProviderEntity3.attachDelayed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addModifierLocalConsumer(ModifierLocalConsumer mod, ModifierLocalProviderEntity provider, MutableVector consumers) {
        int i;
        ModifierLocalConsumerEntity modifierLocalConsumerEntity;
        int size = consumers.getSize();
        if (size > 0) {
            Object[] content = consumers.getContent();
            i = 0;
            while (((ModifierLocalConsumerEntity) content[i]).getModifier() != mod) {
                i++;
                if (i >= size) {
                }
            }
            if (i >= 0) {
                modifierLocalConsumerEntity = new ModifierLocalConsumerEntity(provider, mod);
            } else {
                modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) consumers.removeAt(i);
                modifierLocalConsumerEntity.setProvider(provider);
            }
            provider.getConsumers().add(modifierLocalConsumerEntity);
        }
        i = -1;
        if (i >= 0) {
        }
        provider.getConsumers().add(modifierLocalConsumerEntity);
    }
}
