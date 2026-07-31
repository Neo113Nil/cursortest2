package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u001c\b!\u0018\u0000 Ç\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Æ\u0002Ç\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u00104\u001a\u00020\fH\u0002J-\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00104\u001a\u00020\f2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002060:H\u0086\bJ:\u00105\u001a\u000206\"\u0006\b\u0000\u0010;\u0018\u00012\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002060:H\u0086\b¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\u0004\u0018\u00010\u00152\n\u0010<\u001a\u0006\u0012\u0002\b\u00030=¢\u0006\u0004\bD\u0010EJ\u0006\u0010U\u001a\u00020\fJ\r\u0010\\\u001a\u000206H\u0010¢\u0006\u0002\b]J\b\u0010q\u001a\u000206H&J\u0018\u0010v\u001a\u0002062\u0006\u0010w\u001a\u0002082\u0006\u0010x\u001a\u000208H\u0014J\u000f\u0010\u0087\u0001\u001a\u000206H\u0000¢\u0006\u0003\b\u0088\u0001J0\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030\u0099\u00012\u0010\b\u0004\u00109\u001a\n\u0012\u0005\u0012\u00030¨\u00010ª\u0001H\u0084\b¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0007\u0010\u00ad\u0001\u001a\u000206J\u0007\u0010®\u0001\u001a\u000206J=\u0010¯\u0001\u001a\u0002062\u0006\u0010z\u001a\u00020y2\u0006\u0010\u007f\u001a\u00020%2\u0019\u0010N\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bMH\u0014¢\u0006\u0006\b°\u0001\u0010±\u0001J,\u0010¯\u0001\u001a\u0002062\u0006\u0010z\u001a\u00020y2\u0006\u0010\u007f\u001a\u00020%2\b\u0010²\u0001\u001a\u00030³\u0001H\u0014¢\u0006\u0006\b°\u0001\u0010´\u0001JI\u0010µ\u0001\u001a\u0002062\u0006\u0010z\u001a\u00020y2\u0006\u0010\u007f\u001a\u00020%2\u0019\u0010N\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bM2\n\u0010¶\u0001\u001a\u0005\u0018\u00010³\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0007\u0010¹\u0001\u001a\u000206JG\u0010º\u0001\u001a\u0002062\u0006\u0010z\u001a\u00020y2\u0006\u0010\u007f\u001a\u00020%2\u0019\u0010N\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bM2\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001¢\u0006\u0006\b»\u0001\u0010¸\u0001J\u001d\u0010¼\u0001\u001a\u0002062\b\u0010½\u0001\u001a\u00030¾\u00012\n\u0010¿\u0001\u001a\u0005\u0018\u00010³\u0001J\u001f\u0010À\u0001\u001a\u0002062\b\u0010½\u0001\u001a\u00030¾\u00012\n\u0010¿\u0001\u001a\u0005\u0018\u00010³\u0001H\u0002J\u001f\u0010Á\u0001\u001a\u0002062\b\u0010½\u0001\u001a\u00030¾\u00012\n\u0010¿\u0001\u001a\u0005\u0018\u00010³\u0001H\u0016J\u0007\u0010Â\u0001\u001a\u000206J-\u0010Ê\u0001\u001a\u0002062\u0019\u0010N\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bM2\t\b\u0002\u0010Ë\u0001\u001a\u00020\fJ\u0014\u0010Ì\u0001\u001a\u0002062\t\b\u0002\u0010Í\u0001\u001a\u00020\fH\u0002JA\u0010Ø\u0001\u001a\u0002062\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\f¢\u0006\u0006\bâ\u0001\u0010ã\u0001JI\u0010ä\u0001\u001a\u000206*\u0004\u0018\u00010\u00152\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\fH\u0002¢\u0006\u0006\bå\u0001\u0010æ\u0001J[\u0010ç\u0001\u001a\u000206*\u0004\u0018\u00010\u00152\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\f2\u0007\u0010è\u0001\u001a\u00020%2\u0007\u0010é\u0001\u001a\u00020\fH\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001JR\u0010ì\u0001\u001a\u000206*\u0004\u0018\u00010\u00152\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\f2\u0007\u0010è\u0001\u001a\u00020%H\u0002¢\u0006\u0006\bí\u0001\u0010î\u0001JR\u0010ï\u0001\u001a\u000206*\u0004\u0018\u00010\u00152\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\f2\u0007\u0010è\u0001\u001a\u00020%H\u0002¢\u0006\u0006\bð\u0001\u0010î\u0001J,\u0010ñ\u0001\u001a\u00020\f*\u0004\u0018\u00010\u00152\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010ß\u0001\u001a\u00030à\u0001H\u0002¢\u0006\u0006\bò\u0001\u0010ó\u0001JC\u0010ô\u0001\u001a\u0002062\b\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u00012\u0007\u0010á\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\bõ\u0001\u0010ã\u0001J\b\u0010ö\u0001\u001a\u00030÷\u0001J\u001d\u0010ø\u0001\u001a\u00030Ü\u00012\b\u0010ù\u0001\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\bú\u0001\u0010û\u0001J\u001d\u0010ü\u0001\u001a\u00030Ü\u00012\b\u0010ý\u0001\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\bþ\u0001\u0010û\u0001J\u001d\u0010ÿ\u0001\u001a\u00030Ü\u00012\b\u0010\u0080\u0002\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\b\u0081\u0002\u0010û\u0001J\u001d\u0010\u0082\u0002\u001a\u00030Ü\u00012\b\u0010ý\u0001\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\b\u0083\u0002\u0010û\u0001J\r\u0010\u0084\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002J&\u0010\u0085\u0002\u001a\u00030Ü\u00012\u0007\u0010\u0086\u0002\u001a\u00020\u00032\b\u0010\u0087\u0002\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J/\u0010\u0085\u0002\u001a\u00030Ü\u00012\u0007\u0010\u0086\u0002\u001a\u00020\u00032\b\u0010\u0087\u0002\u001a\u00030Ü\u00012\u0007\u0010\u008a\u0002\u001a\u00020\fH\u0016¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J%\u0010\u008d\u0002\u001a\u0002062\u0007\u0010\u0086\u0002\u001a\u00020\u00032\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002H\u0016¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002J\u001c\u0010\u0092\u0002\u001a\u0002062\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002H\u0016¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J%\u0010\u0095\u0002\u001a\u0002062\u0007\u0010\u0096\u0002\u001a\u00020\u00002\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002H\u0002¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J%\u0010\u0099\u0002\u001a\u0002062\u0007\u0010\u0096\u0002\u001a\u00020\u00002\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002H\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u0098\u0002J\u001c\u0010\u009b\u0002\u001a\u00030÷\u00012\u0007\u0010\u0086\u0002\u001a\u00020\u00032\u0007\u0010\u009c\u0002\u001a\u00020\fH\u0016J/\u0010\u009d\u0002\u001a\u00030Ü\u00012\u0007\u0010\u0096\u0002\u001a\u00020\u00002\b\u0010\u009e\u0002\u001a\u00030Ü\u00012\u0007\u0010\u008a\u0002\u001a\u00020\fH\u0002¢\u0006\u0006\b\u009f\u0002\u0010 \u0002J%\u0010\u009d\u0002\u001a\u0002062\u0007\u0010\u0096\u0002\u001a\u00020\u00002\b\u0010¡\u0002\u001a\u00030\u008e\u00012\u0007\u0010\u009c\u0002\u001a\u00020\fH\u0002J\u001d\u0010¢\u0002\u001a\u00030Ü\u00012\b\u0010ý\u0001\u001a\u00030Ü\u0001H\u0016¢\u0006\u0006\b£\u0002\u0010û\u0001J)\u0010¤\u0002\u001a\u0002062\b\u0010½\u0001\u001a\u00030¾\u00012\u0013\u00109\u001a\u000f\u0012\u0005\u0012\u00030¾\u0001\u0012\u0004\u0012\u0002060:H\u0084\bJ'\u0010¥\u0002\u001a\u00030Ü\u00012\u0007\u0010z\u001a\u00030Ü\u00012\t\b\u0002\u0010\u008a\u0002\u001a\u00020\fH\u0016¢\u0006\u0006\b¦\u0002\u0010§\u0002J'\u0010¨\u0002\u001a\u00030Ü\u00012\u0007\u0010z\u001a\u00030Ü\u00012\t\b\u0002\u0010\u008a\u0002\u001a\u00020\fH\u0016¢\u0006\u0006\b©\u0002\u0010§\u0002J\u001d\u0010ª\u0002\u001a\u0002062\b\u0010½\u0001\u001a\u00030¾\u00012\b\u0010«\u0002\u001a\u00030¬\u0002H\u0004J\u0007\u0010\u00ad\u0002\u001a\u000206J\u0007\u0010®\u0002\u001a\u000206J-\u0010¯\u0002\u001a\u0002062\b\u0010°\u0002\u001a\u00030\u008e\u00012\u0007\u0010\u009c\u0002\u001a\u00020\f2\t\b\u0002\u0010±\u0002\u001a\u00020\fH\u0000¢\u0006\u0003\b²\u0002J\u001c\u0010³\u0002\u001a\u0002062\b\u0010°\u0002\u001a\u00030\u008e\u00012\u0007\u0010\u009c\u0002\u001a\u00020\fH\u0002J\u001c\u0010´\u0002\u001a\u00020\f2\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0004¢\u0006\u0006\bµ\u0002\u0010¶\u0002J\u001c\u0010·\u0002\u001a\u00020\f2\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0004¢\u0006\u0006\b¸\u0002\u0010¶\u0002J\t\u0010¹\u0002\u001a\u000206H\u0016J\t\u0010º\u0002\u001a\u000206H\u0016J\u0018\u0010»\u0002\u001a\u00020\u00002\u0007\u0010¼\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b½\u0002J\u0007\u0010¾\u0002\u001a\u00020\fJ\u001d\u0010¿\u0002\u001a\u00030Ü\u00012\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0002¢\u0006\u0006\bÀ\u0002\u0010û\u0001J\u001d\u0010Á\u0002\u001a\u00030Ö\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u0001H\u0004¢\u0006\u0006\bÂ\u0002\u0010û\u0001J&\u0010Ã\u0002\u001a\u00020%2\b\u0010Û\u0001\u001a\u00030Ü\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u0001H\u0004¢\u0006\u0006\bÄ\u0002\u0010Å\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000eR\u000e\u00102\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010F\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000RD\u0010N\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bM2\u0019\u0010K\u001a\u0015\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u000206\u0018\u00010:¢\u0006\u0002\bM@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010,R\u0014\u0010^\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u000eR\u0014\u0010`\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u000eR\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010c\u001a\u00020b2\u0006\u0010K\u001a\u00020b8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR&\u0010i\u001a\u0004\u0018\u00010h2\b\u0010K\u001a\u0004\u0018\u00010h@dX¦\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010n\u001a\n\u0012\u0004\u0012\u00020p\u0018\u00010oX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020p0s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR&\u0010z\u001a\u00020y2\u0006\u0010K\u001a\u00020y@TX\u0096\u000e¢\u0006\u0010\n\u0002\u0010~\u001a\u0004\b{\u0010I\"\u0004\b|\u0010}R'\u0010\u007f\u001a\u00020%2\u0006\u0010K\u001a\u00020%@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0080\u0001\u0010'\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010/R\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010/R\u0012\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0012\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0098\u0001\u001a\u00030\u0099\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010IR \u0010\u009b\u0001\u001a\u00030\u009c\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¡\u0001\u001a\u00020\fX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010\u000e\"\u0005\b£\u0001\u0010\u0010R\u001d\u0010¤\u0001\u001a\u00020\fX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u000e\"\u0005\b¦\u0001\u0010\u0010R\u0012\u0010Ã\u0001\u001a\u0005\u0018\u00010³\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010Å\u0001\u001a\u001b\u0012\u0005\u0012\u00030¾\u0001\u0012\u0007\u0012\u0005\u0018\u00010³\u0001\u0012\u0004\u0012\u000206\u0018\u00010Æ\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010Ç\u0001\u001a\u0019\u0012\u0005\u0012\u00030¾\u0001\u0012\u0007\u0012\u0005\u0018\u00010³\u0001\u0012\u0004\u0012\u0002060Æ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u0002060ª\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010Ï\u0001\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f@BX\u0080\u000e¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010\u000eR'\u0010²\u0001\u001a\u0005\u0018\u00010Ñ\u00012\t\u0010K\u001a\u0005\u0018\u00010Ñ\u0001@BX\u0086\u000e¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0012\u0010¶\u0001\u001a\u0005\u0018\u00010³\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Ô\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u000eR\u0014\u0010Õ\u0001\u001a\u00030Ö\u00018F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010I¨\u0006È\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "forcePlaceWithLookaheadOffset", "", "getForcePlaceWithLookaheadOffset$ui", "()Z", "setForcePlaceWithLookaheadOffset$ui", "(Z)V", "forceMeasureWithLookaheadConstraints", "getForceMeasureWithLookaheadConstraints$ui", "setForceMeasureWithLookaheadConstraints$ui", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui", "setWrappedBy$ui", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "parent", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "introducesMotionFrameOfReference", "getIntroducesMotionFrameOfReference", "released", "headNode", "includeTail", "visitNodes", "", "mask", "", "block", "Lkotlin/Function1;", ExifInterface.GPS_DIRECTION_TRUE, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "hasNode", "hasNode-H91voCI", "(I)Z", "head", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "isClipping", "value", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "lastLayerAlpha", "isTransparent", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "replace", "replace$ui", "hasMeasureResult", "getHasMeasureResult", "isAttached", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "getMeasureResult$ui", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui", "(Landroidx/compose/ui/layout/MeasureResult;)V", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "oldAlignmentLines", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "ensureLookaheadDelegateCreated", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "onMeasureResultChanged", "width", "height", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "zIndex", "getZIndex", "setZIndex", "(F)V", "parentData", "", "getParentData", "()Ljava/lang/Object;", "onCoordinatesUsed", "onCoordinatesUsed$ui", "parentLayoutCoordinates", "getParentLayoutCoordinates", "parentCoordinates", "getParentCoordinates", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui", "lastShape", "Landroidx/compose/ui/graphics/Shape;", "getLastShape$ui", "()Landroidx/compose/ui/graphics/Shape;", "setLastShape$ui", "(Landroidx/compose/ui/graphics/Shape;)V", "lastClip", "getLastClip$ui", "setLastClip$ui", "wasLayerBlockInvoked", "getWasLayerBlockInvoked$ui", "setWasLayerBlockInvoked$ui", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Lkotlin/Function0;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "onMeasured", "onUnplaced", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelf", "explicitLayer", "placeSelf-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "releaseLayer", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset-MLgxB_4", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "graphicsLayer", "drawContainedDrawModifiers", "performDraw", "onPlaced", "drawBlockParentLayer", "drawBlockCanvas", "_drawBlock", "Lkotlin/Function2;", "drawBlock", "getDrawBlock", "()Lkotlin/jvm/functions/Function2;", "updateLayerBlock", "forceUpdateLayerParameters", "updateLayerParameters", "invokeOnLayoutChange", "invalidateParentLayer", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "isValidOwnerScope", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "hitTest", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "hitTest-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hit", "hit-5ShdDok", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "outOfBoundsHit", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "outOfBoundsHit-8NAm7pk", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "hitNear", "hitNear-Fh5PU_I", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "speculativeHit", "speculativeHit-Fh5PU_I", "isInExpandedTouchBounds", "isInExpandedTouchBounds-ThD-n1k", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "hitTestChild", "hitTestChild-qzLsGqo", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "screenToLocal", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "localToScreen", "relativeToLocal", "localToScreen-MK-Hz9U", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "toCoordinator", "localPositionOf", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformToScreen", "transformToScreen-58bKbWc", "([F)V", "transformToAncestor", "ancestor", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "localBoundingBoxOf", "clipBounds", "ancestorToLocal", TypedValues.CycleType.S_WAVE_OFFSET, "ancestorToLocal-S_NoaFU", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "rect", "localToRoot", "localToRoot-MK-Hz9U", "withPositionTranslation", "toParentPosition", "toParentPosition-8S9VItk", "(JZ)J", "fromParentPosition", "fromParentPosition-8S9VItk", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "onLayoutNodeDetach", "onRelease", "rectInParent", "bounds", "clipToMinimumTouchTargetSize", "rectInParent$ui", "fromParentRect", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "(J)Z", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "invalidateLayer", "onLayoutModifierNodeChanged", "findCommonAncestor", "other", "findCommonAncestor$ui", "shouldSharePointerInputWithSiblings", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "distanceInMinimumTouchTarget", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "HitTestSource", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastClip;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;
    private boolean wasLayerBlockInvoked;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            try {
                if (nodeCoordinator.isValidOwnerScope()) {
                    NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                layoutNode.rethrowWithComposeStackTrace(th);
                throw new KotlinNothingValueException();
            }
        }
    };
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m5639constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo7159childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m7073hitTest6fMxITs$ui(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo7160entityTypeOLwlOKw() {
            return NodeKind.m7164constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int m7164constructorimpl = NodeKind.m7164constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet() & m7164constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate = node.getDelegate();
                    int i = 0;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(node);
                                    }
                                    node = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        delegate = delegate.getChild();
                        node = node;
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfiguration = parentLayoutNode.getSemanticsConfiguration();
            boolean z = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo7159childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.m7074hitTestSemantics6fMxITs$ui(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo7160entityTypeOLwlOKw() {
            return NodeKind.m7164constructorimpl(8);
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.INSTANCE.m8366getZeronOccac();
    private Shape lastShape = RectangleShapeKt.getRectangleShape();
    private final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator wrappedBy = NodeCoordinator.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.invalidateLayer();
            }
        }
    };

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J7\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "childHitTest", "", "layoutNode", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "isInLayer", "childHitTest-qzLsGqo", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo7159childHitTestqzLsGqo(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer);

        /* renamed from: entityType-OLwlOKw */
        int mo7160entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode parentLayoutNode);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract LookaheadDelegate getLookaheadDelegate();

    public abstract Modifier.Node getTail();

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getForcePlaceWithLookaheadOffset$ui, reason: from getter */
    public final boolean getForcePlaceWithLookaheadOffset() {
        return this.forcePlaceWithLookaheadOffset;
    }

    public final void setForcePlaceWithLookaheadOffset$ui(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    /* renamed from: getForceMeasureWithLookaheadConstraints$ui, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final void setForceMeasureWithLookaheadConstraints$ui(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    /* renamed from: getWrapped$ui, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    public final void setWrapped$ui(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    /* renamed from: getWrappedBy$ui, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
                return null;
            }
            return tail.getChild();
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            return nodeCoordinator2.getTail();
        }
        return null;
    }

    public final void visitNodes(int mask, boolean includeTail, Function1<? super Modifier.Node, Unit> block) {
        Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(includeTail); headNode != null && (headNode.getAggregateChildKindSet() & mask) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & mask) != 0) {
                block.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m7157visitNodesaLcG6gQ(int type, Function1<? super T, Unit> block) {
        boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!m7173getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & type) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & type) != 0) {
                Modifier.Node node = headNode;
                MutableVector mutableVector = null;
                while (node != null) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    if (node instanceof Object) {
                        block.invoke(node);
                    } else if ((node.getKindSet() & type) != 0 && (node instanceof DelegatingNode)) {
                        int i = 0;
                        for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & type) != 0) {
                                i++;
                                if (i == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = null;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m7134hasNodeH91voCI(int type) {
        Modifier.Node headNode = headNode(NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(type));
        return headNode != null && DelegatableNodeKt.m7013has64DMado(headNode, type);
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m7150headH91voCI(int type) {
        boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!m7173getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & type) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & type) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo6852getSizeYbymL2g() {
        return getMeasuredSize();
    }

    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo6907placeAtf8xVGno(getPosition(), this.zIndex, graphicsLayer);
        } else {
            mo6845placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().getIsAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.isNotEmpty() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMeasureResult$ui(MeasureResult measureResult) {
        boolean compareEquals;
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.get$width() != measureResult2.get$width() || measureResult.get$height() != measureResult2.get$height()) {
                onMeasureResultChanged(measureResult.get$width(), measureResult.get$height());
            }
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMap = this.oldAlignmentLines;
            if (mutableObjectIntMap != null) {
                Intrinsics.checkNotNull(mutableObjectIntMap);
            }
            if (measureResult.getAlignmentLines().isEmpty()) {
                return;
            }
            compareEquals = NodeCoordinatorKt.compareEquals(this.oldAlignmentLines, measureResult.getAlignmentLines());
            if (compareEquals) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMap2 = this.oldAlignmentLines;
            if (mutableObjectIntMap2 == null) {
                mutableObjectIntMap2 = ObjectIntMapKt.mutableObjectIntMapOf();
                this.oldAlignmentLines = mutableObjectIntMap2;
            }
            mutableObjectIntMap2.clear();
            for (Map.Entry<AlignmentLine, Integer> entry : measureResult.getAlignmentLines().entrySet()) {
                mutableObjectIntMap2.set(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        while (this != null) {
            MeasureResult measureResult = this._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
            this = this.wrapped;
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void onMeasureResultChanged(int width, int height) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo7226resizeozmzZPI(IntSize.m8393constructorimpl((width << 32) | (height & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m6908setMeasuredSizeozmzZPI(IntSize.m8393constructorimpl((height & 4294967295L) | (width << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int m7164constructorimpl = NodeKind.m7164constructorimpl(4);
        boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(m7164constructorimpl);
        Modifier.Node tail = getTail();
        if (m7173getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m7164constructorimpl) != 0; headNode = headNode.getChild()) {
                if ((headNode.getKindSet() & m7164constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNode.getDelegate();
                            int i = 0;
                            delegatingNode = delegatingNode;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNode = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(delegatingNode);
                                            }
                                            delegatingNode = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNode = delegatingNode;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m7155setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes().m7125hasH91voCI$ui(NodeKind.m7164constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((NodeKind.m7164constructorimpl(64) & tail.getKindSet()) != 0) {
                int m7164constructorimpl = NodeKind.m7164constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNode = tail;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate = delegatingNode.getDelegate();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(delegatingNode);
                                        }
                                        delegatingNode = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            delegate = delegate.getChild();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    public final void onCoordinatesUsed$ui() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            StringBuilder sb = new StringBuilder(ExpectAttachedLayoutCoordinates);
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.getParent$ui()) {
                Intrinsics.checkNotNullExpressionValue(sb.append('\n'), "append(...)");
                sb.append("|");
                sb.append(layoutNode);
                sb.append(" isAttached=");
                sb.append(layoutNode.isAttached());
                sb.append(" modifier=");
                sb.append(layoutNode.get_modifier());
                sb.append(" tail=");
                sb.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        onCoordinatesUsed$ui();
        return getLayoutNode().getOuterCoordinator$ui().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        return this.wrappedBy;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m7148getLastMeasurementConstraintsmsEJaDk$ui() {
        return getMeasurementConstraints();
    }

    /* renamed from: getLastShape$ui, reason: from getter */
    public final Shape getLastShape() {
        return this.lastShape;
    }

    public final void setLastShape$ui(Shape shape) {
        this.lastShape = shape;
    }

    /* renamed from: getLastClip$ui, reason: from getter */
    public final boolean getLastClip() {
        return this.lastClip;
    }

    public final void setLastClip$ui(boolean z) {
        this.lastClip = z;
    }

    /* renamed from: getWasLayerBlockInvoked$ui, reason: from getter */
    public final boolean getWasLayerBlockInvoked() {
        return this.wasLayerBlockInvoked;
    }

    public final void setWasLayerBlockInvoked$ui(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final Placeable m7153performingMeasureK40F9xA(long constraints, Function0<? extends Placeable> block) {
        m6909setMeasurementConstraintsBRTryo0(constraints);
        return block.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    protected void mo6845placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m7140placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, layerBlock, null);
            return;
        }
        m7140placeSelfMLgxB_4(position, zIndex, layerBlock, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    protected void mo6907placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m7140placeSelfMLgxB_4(lookaheadDelegate.getPosition(), zIndex, null, layer);
            return;
        }
        m7140placeSelfMLgxB_4(position, zIndex, null, layer);
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m7140placeSelfMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                OwnedLayer createLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, explicitLayer);
                createLayer.mo7226resizeozmzZPI(getMeasuredSize());
                createLayer.mo7225movegyyYBs(position);
                this.layer = createLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, layerBlock, false, 2, null);
        }
        if (!IntOffset.m8354equalsimpl0(getPosition(), position)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.INSTANCE.m4876getHighNSsRyOo());
            m7155setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo7225movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorPositionChanged$ui();
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (this == getLayoutNode().getOuterCoordinator$ui()) {
            RectManager.onLayoutPositionChanged$default(LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager(), getLayoutNode(), false, 2, null);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m7154placeSelfApparentToRealOffsetMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock, GraphicsLayer layer) {
        m7140placeSelfMLgxB_4(IntOffset.m8359plusqkQi6aY(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float m8355getXimpl = IntOffset.m8355getXimpl(getPosition());
        float m8356getYimpl = IntOffset.m8356getYimpl(getPosition());
        canvas.translate(m8355getXimpl, m8356getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-m8355getXimpl, -m8356getYimpl);
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    private final Function2<Canvas, GraphicsLayer, Unit> getDrawBlock() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Canvas canvas;
                GraphicsLayer graphicsLayer;
                NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                canvas = nodeCoordinator.drawBlockCanvas;
                Intrinsics.checkNotNull(canvas);
                graphicsLayer = NodeCoordinator.this.drawBlockParentLayer;
                nodeCoordinator.drawContainedDrawModifiers(canvas, graphicsLayer);
            }
        };
        Function2<Canvas, GraphicsLayer, Unit> function22 = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                invoke2(canvas, graphicsLayer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Canvas canvas, GraphicsLayer graphicsLayer) {
                OwnerSnapshotObserver snapshotObserver;
                Function1 function1;
                if (NodeCoordinator.this.getLayoutNode().isPlaced()) {
                    NodeCoordinator.this.drawBlockCanvas = canvas;
                    NodeCoordinator.this.drawBlockParentLayer = graphicsLayer;
                    snapshotObserver = NodeCoordinator.this.getSnapshotObserver();
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    function1 = NodeCoordinator.onCommitAffectingLayer;
                    snapshotObserver.observer.observeReads(nodeCoordinator, function1, function0);
                    NodeCoordinator.this.lastLayerDrawingWasSkipped = false;
                    return;
                }
                NodeCoordinator.this.lastLayerDrawingWasSkipped = true;
            }
        };
        this._drawBlock = function22;
        return function22;
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && layerBlock != null) {
            this.layerBlock = layerBlock;
            if (this.layer != null) {
                if (z) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer createLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
            createLayer$default.mo7226resizeozmzZPI(getMeasuredSize());
            createLayer$default.mo7225movegyyYBs(getPosition());
            this.layer = createLayer$default;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m5664isIdentity58bKbWc(ownedLayer.mo7221getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorPositionChanged$ui();
            }
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner = layoutNode.getOwner()) != null) {
                owner.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    private final void updateLayerParameters(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.setLayoutDirection$ui(getLayoutNode().getLayoutDirection());
                reusableGraphicsLayerScope.m5723setSizeuvyYCjk(IntSizeKt.m8410toSizeozmzZPI(mo6852getSizeYbymL2g()));
                getSnapshotObserver().observer.observeReads(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope3;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope4;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope5;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope6;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope7;
                        Function1<GraphicsLayerScope, Unit> function12 = function1;
                        reusableGraphicsLayerScope2 = NodeCoordinator.graphicsLayerScope;
                        function12.invoke(reusableGraphicsLayerScope2);
                        Shape lastShape = this.getLastShape();
                        reusableGraphicsLayerScope3 = NodeCoordinator.graphicsLayerScope;
                        boolean z = lastShape != reusableGraphicsLayerScope3.getShape();
                        boolean lastClip = this.getLastClip();
                        reusableGraphicsLayerScope4 = NodeCoordinator.graphicsLayerScope;
                        boolean z2 = lastClip != reusableGraphicsLayerScope4.getClip();
                        if (z || z2) {
                            NodeCoordinator nodeCoordinator = this;
                            reusableGraphicsLayerScope5 = NodeCoordinator.graphicsLayerScope;
                            nodeCoordinator.setLastShape$ui(reusableGraphicsLayerScope5.getShape());
                            NodeCoordinator nodeCoordinator2 = this;
                            reusableGraphicsLayerScope6 = NodeCoordinator.graphicsLayerScope;
                            nodeCoordinator2.setLastClip$ui(reusableGraphicsLayerScope6.getClip());
                            if (this.getWasLayerBlockInvoked() && (z2 || (this.getLastClip() && z))) {
                                this.getLayoutNode().invalidateSemantics$ui();
                            }
                        }
                        this.setWasLayerBlockInvoked$ui(true);
                        reusableGraphicsLayerScope7 = NodeCoordinator.graphicsLayerScope;
                        reusableGraphicsLayerScope7.updateOutline$ui();
                    }
                });
                LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties;
                }
                LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
                layerPositionalProperties2.copyFrom(layerPositionalProperties);
                layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
                ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
                boolean z = this.isClipping;
                this.isClipping = reusableGraphicsLayerScope.getClip();
                this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
                boolean hasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
                if (invokeOnLayoutChange && ((!hasSameValuesAs || z != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
                    owner.onLayoutChange(getLayoutNode());
                }
                if (hasSameValuesAs) {
                    return;
                }
                LayoutNode layoutNode = getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                layoutNode.onCoordinatorPositionChanged$ui();
                Owner requireOwner = LayoutNodeKt.requireOwner(layoutNode);
                RectManager rectManager = requireOwner.getRectManager();
                if (this == layoutNode.getOuterCoordinator$ui()) {
                    RectManager.onLayoutPositionChanged$default(rectManager, layoutNode, false, 2, null);
                } else {
                    rectManager.onLayoutLayerPositionalPropertiesChanged(layoutNode);
                }
                if (layoutNode.getGloballyPositionedObservers() > 0) {
                    requireOwner.requestOnPositionedCallback(layoutNode);
                    return;
                }
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        if (this.layerBlock == null) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
    }

    /* renamed from: getLastLayerDrawingWasSkipped$ui, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m7149getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo466toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo7080getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m7151hitTestqzLsGqo(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        boolean z;
        Modifier.Node m7150headH91voCI = m7150headH91voCI(hitTestSource.mo7160entityTypeOLwlOKw());
        boolean z2 = false;
        if (!m7158withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (PointerType.m6784equalsimpl0(pointerType, PointerType.INSTANCE.m6791getTouchT8wyACA())) {
                float m7146distanceInMinimumTouchTargettz77jQw = m7146distanceInMinimumTouchTargettz77jQw(pointerPosition, m7149getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(m7146distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(m7146distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m7136hitNearFh5PU_I(m7150headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, false, m7146distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (m7150headH91voCI == null) {
            mo7061hitTestChildqzLsGqo(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (m7152isPointerInBoundsk4lQ0M(pointerPosition)) {
            m7135hit5ShdDok(m7150headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float m7146distanceInMinimumTouchTargettz77jQw2 = !PointerType.m6784equalsimpl0(pointerType, PointerType.INSTANCE.m6791getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m7146distanceInMinimumTouchTargettz77jQw(pointerPosition, m7149getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(m7146distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z = isInLayer;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m7146distanceInMinimumTouchTargettz77jQw2, z)) {
                z2 = true;
            }
        } else {
            z = isInLayer;
        }
        m7139outOfBoundsHit8NAm7pk(m7150headH91voCI, hitTestSource, pointerPosition, hitTestResult, pointerType, z, m7146distanceInMinimumTouchTargettz77jQw2, z2);
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m7135hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        long DistanceAndFlags;
        Modifier.Node m7162nextUntilhw7D004;
        if (node != null) {
            int i2 = hitTestResult.hitDepth;
            hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
            hitTestResult.hitDepth++;
            hitTestResult.values.add(node);
            MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
            DistanceAndFlags = HitTestResultKt.DistanceAndFlags(-1.0f, z, false);
            mutableLongList.add(DistanceAndFlags);
            m7162nextUntilhw7D004 = NodeCoordinatorKt.m7162nextUntilhw7D004(node, hitTestSource.mo7160entityTypeOLwlOKw(), NodeKind.m7164constructorimpl(2));
            m7135hit5ShdDok(m7162nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z);
            hitTestResult.hitDepth = i2;
            return;
        }
        mo7061hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m7139outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f, final boolean z2) {
        if (node == null) {
            mo7061hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (m7137isInExpandedTouchBoundsThDn1k(node, j, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Modifier.Node m7162nextUntilhw7D004;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m7162nextUntilhw7D004 = NodeCoordinatorKt.m7162nextUntilhw7D004(node, hitTestSource.mo7160entityTypeOLwlOKw(), NodeKind.m7164constructorimpl(2));
                    nodeCoordinator.m7139outOfBoundsHit8NAm7pk(m7162nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, z2);
                }
            });
        } else if (z2) {
            m7136hitNearFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        } else {
            m7141speculativeHitFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        }
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m7136hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        long DistanceAndFlags;
        Modifier.Node m7162nextUntilhw7D004;
        if (node != null) {
            int i2 = hitTestResult.hitDepth;
            hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
            hitTestResult.hitDepth++;
            hitTestResult.values.add(node);
            MutableLongList mutableLongList = hitTestResult.distanceFromEdgeAndFlags;
            DistanceAndFlags = HitTestResultKt.DistanceAndFlags(f, z, false);
            mutableLongList.add(DistanceAndFlags);
            m7162nextUntilhw7D004 = NodeCoordinatorKt.m7162nextUntilhw7D004(node, hitTestSource.mo7160entityTypeOLwlOKw(), NodeKind.m7164constructorimpl(2));
            m7139outOfBoundsHit8NAm7pk(m7162nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, true);
            hitTestResult.hitDepth = i2;
            return;
        }
        mo7061hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m7141speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f) {
        Modifier.Node m7162nextUntilhw7D004;
        if (node == null) {
            mo7061hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
        } else if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m7162nextUntilhw7D004 = NodeCoordinatorKt.m7162nextUntilhw7D004(node, hitTestSource.mo7160entityTypeOLwlOKw(), NodeKind.m7164constructorimpl(2));
            m7139outOfBoundsHit8NAm7pk(m7162nextUntilhw7D004, hitTestSource, j, hitTestResult, i, z, f, false);
        } else {
            hitTestResult.speculativeHit(node, f, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Modifier.Node m7162nextUntilhw7D0042;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    m7162nextUntilhw7D0042 = NodeCoordinatorKt.m7162nextUntilhw7D004(node, hitTestSource.mo7160entityTypeOLwlOKw(), NodeKind.m7164constructorimpl(2));
                    nodeCoordinator.m7139outOfBoundsHit8NAm7pk(m7162nextUntilhw7D0042, hitTestSource, j, hitTestResult, i, z, f, false);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m7137isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j, int i) {
        if (node == 0) {
            return false;
        }
        if (!PointerType.m6784equalsimpl0(i, PointerType.INSTANCE.m6790getStylusT8wyACA()) && !PointerType.m6784equalsimpl0(i, PointerType.INSTANCE.m6788getEraserT8wyACA())) {
            return false;
        }
        int m7164constructorimpl = NodeKind.m7164constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long mo1522getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1522getTouchBoundsExpansionRZrCHBk();
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) >= (-TouchBoundsExpansion.m7250computeLeftimpl$ui(mo1522getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) && Float.intBitsToFloat(i2) < getMeasuredWidth() + TouchBoundsExpansion.m7251computeRightimpl$ui(mo1522getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) {
                    int i3 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i3) >= (-TouchBoundsExpansion.m7258getTopimpl(mo1522getTouchBoundsExpansionRZrCHBk)) && Float.intBitsToFloat(i3) < getMeasuredHeight() + TouchBoundsExpansion.m7255getBottomimpl(mo1522getTouchBoundsExpansionRZrCHBk)) {
                        return true;
                    }
                }
                return false;
            }
            if ((node.getKindSet() & m7164constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate = node.getDelegate();
                int i4 = 0;
                node = node;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                        i4++;
                        if (i4 == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    node = node;
                }
                if (i4 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo7061hitTestChildqzLsGqo(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m7151hitTestqzLsGqo(hitTestSource, m7133fromParentPosition8S9VItk$default(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m7145calculateMinimumTouchTargetPaddingE7KxVPU = m7145calculateMinimumTouchTargetPaddingE7KxVPU(m7149getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (m7145calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i2 = (int) (m7145calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i2));
        rectCache.setRight(getMeasuredWidth() + Float.intBitsToFloat(i));
        rectCache.setBottom(getMeasuredHeight() + Float.intBitsToFloat(i2));
        while (this != findRootCoordinates) {
            this.rectInParent$ui(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            this = this.wrappedBy;
            Intrinsics.checkNotNull(this);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo6858screenToLocalMKHz9U(long relativeToScreen) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo6853localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo6794screenToLocalMKHz9U(relativeToScreen));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo6856localToScreenMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo6793localToScreenMKHz9U(mo6855localToRootMKHz9U(relativeToLocal));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo6861windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo6853localPositionOfR5De75A(findRootCoordinates, Offset.m5152minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo7228calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo6857localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo7229calculatePositionInWindowMKHz9U(mo6855localToRootMKHz9U(relativeToLocal));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo6853localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo6854localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo6854localPositionOfS_NoaFU(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) sourceCoordinates;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui();
            return Offset.m5140constructorimpl(lookaheadLayoutCoordinates.mo6854localPositionOfS_NoaFU(this, Offset.m5140constructorimpl(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != findCommonAncestor$ui) {
            relativeToSource = coordinator.m7156toParentPosition8S9VItk(relativeToSource, includeMotionFrameOfReference);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m7132ancestorToLocalS_NoaFU(findCommonAncestor$ui, relativeToSource, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo6859transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m5648resetimpl(matrix);
        coordinator.m7144transformToAncestorEL8BTi8(findCommonAncestor$ui, matrix);
        m7143transformFromAncestorEL8BTi8(findCommonAncestor$ui, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo6860transformToScreen58bKbWc(float[] matrix) {
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m7144transformToAncestorEL8BTi8(coordinator, matrix);
        if (requireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) requireOwner).mo6629localToScreen58bKbWc(matrix);
            return;
        }
        long positionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & positionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m5660translateimpl(matrix, Float.intBitsToFloat((int) (positionOnScreen >> 32)), Float.intBitsToFloat((int) (positionOnScreen & 4294967295L)), 0.0f);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m7144transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        while (!Intrinsics.areEqual(this, ancestor)) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo7227transform58bKbWc(matrix);
            }
            if (!IntOffset.m8354equalsimpl0(this.getPosition(), IntOffset.INSTANCE.m8366getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m5648resetimpl(fArr);
                Matrix.m5661translateimpl$default(fArr, IntOffset.m8355getXimpl(r0), IntOffset.m8356getYimpl(r0), 0.0f, 4, null);
                Matrix.m5658timesAssign58bKbWc(matrix, fArr);
            }
            this = this.wrappedBy;
            Intrinsics.checkNotNull(this);
        }
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m7143transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.areEqual(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m7143transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m8354equalsimpl0(getPosition(), IntOffset.INSTANCE.m8366getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m5648resetimpl(fArr);
            Matrix.m5661translateimpl$default(fArr, -IntOffset.m8355getXimpl(getPosition()), -IntOffset.m8356getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m5658timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo7222inverseTransform58bKbWc(matrix);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!sourceCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator findCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (sourceCoordinates.mo6852getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (sourceCoordinates.mo6852getSizeYbymL2g() & 4294967295L));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != findCommonAncestor$ui) {
            boolean z = clipBounds;
            rectInParent$ui$default(nodeCoordinator, rectCache, z, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
            clipBounds = z;
        }
        ancestorToLocal(findCommonAncestor$ui, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m7132ancestorToLocalS_NoaFU(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator == null || Intrinsics.areEqual(ancestor, nodeCoordinator)) {
            return m7147fromParentPosition8S9VItk(offset, includeMotionFrameOfReference);
        }
        return m7147fromParentPosition8S9VItk(nodeCoordinator.m7132ancestorToLocalS_NoaFU(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo6855localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        long j = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            if (ComposeUiFlags.isRectManagerOffsetUsageFromLayoutCoordinatesEnabled) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                    long m7433getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNode).getRectManager().m7433getOffsetFromRectListForBjo55l4(layoutNode);
                    if (!IntOffset.m8354equalsimpl0(m7433getOffsetFromRectListForBjo55l4, IntOffset.INSTANCE.m8365getMaxnOccac())) {
                        return IntOffsetKt.m8370plusNvtHpc(j, m7433getOffsetFromRectListForBjo55l4);
                    }
                }
            }
            j = m7142toParentPosition8S9VItk$default(nodeCoordinator, j, false, 2, null);
        }
        return j;
    }

    protected final void withPositionTranslation(Canvas canvas, Function1<? super Canvas, Unit> block) {
        float m8355getXimpl = IntOffset.m8355getXimpl(getPosition());
        float m8356getYimpl = IntOffset.m8356getYimpl(getPosition());
        canvas.translate(m8355getXimpl, m8356getYimpl);
        block.invoke(canvas);
        canvas.translate(-m8355getXimpl, -m8356getYimpl);
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m7142toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m7156toParentPosition8S9VItk(j, z);
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m7156toParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo7224mapOffset8S9VItk(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m8370plusNvtHpc(position, getPosition()) : position;
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m7133fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m7147fromParentPosition8S9VItk(j, z);
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m7147fromParentPosition8S9VItk(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = IntOffsetKt.m8368minusNvtHpc(position, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo7224mapOffset8S9VItk(position, true) : position;
    }

    protected final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, paint);
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
        if (getLayoutNode().isPlaced()) {
            onUnplaced();
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m8354equalsimpl0(getPosition(), IntOffset.INSTANCE.m8366getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorPositionChanged$ui();
    }

    public static /* synthetic */ void rectInParent$ui$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui(mutableRect, z, z2);
    }

    public final void rectInParent$ui(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long m7149getMinimumTouchTargetSizeNHjbRc = m7149getMinimumTouchTargetSizeNHjbRc();
                    float intBitsToFloat = Float.intBitsToFloat((int) (m7149getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (m7149getMinimumTouchTargetSizeNHjbRc & 4294967295L)) / 2.0f;
                    bounds.intersect(-intBitsToFloat, -intBitsToFloat2, ((int) (mo6852getSizeYbymL2g() >> 32)) + intBitsToFloat, ((int) (4294967295L & mo6852getSizeYbymL2g())) + intBitsToFloat2);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, (int) (mo6852getSizeYbymL2g() >> 32), (int) (4294967295L & mo6852getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m8355getXimpl = IntOffset.m8355getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + m8355getXimpl);
        bounds.setRight(bounds.getRight() + m8355getXimpl);
        float m8356getYimpl = IntOffset.m8356getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + m8356getYimpl);
        bounds.setBottom(bounds.getBottom() + m8356getYimpl);
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float m8355getXimpl = IntOffset.m8355getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - m8355getXimpl);
        bounds.setRight(bounds.getRight() - m8355getXimpl);
        float m8356getYimpl = IntOffset.m8356getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - m8356getYimpl);
        bounds.setBottom(bounds.getBottom() - m8356getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, (int) (mo6852getSizeYbymL2g() >> 32), (int) (mo6852getSizeYbymL2g() & 4294967295L));
                bounds.isEmpty();
            }
        }
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m7158withinLayerBoundsk4lQ0M(long pointerPosition) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (pointerPosition & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo7223isInLayerk4lQ0M(pointerPosition);
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final NodeCoordinator findCommonAncestor$ui(NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int m7164constructorimpl = NodeKind.m7164constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & m7164constructorimpl) != 0 && parent == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode2 = layoutNode2.getParent$ui();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui();
            }
            return other;
        }
        return this;
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m7146distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m7145calculateMinimumTouchTargetPaddingE7KxVPU = m7145calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float intBitsToFloat = Float.intBitsToFloat((int) (m7145calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m7145calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long m7138offsetFromEdgeMKHz9U = m7138offsetFromEdgeMKHz9U(pointerPosition);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (m7138offsetFromEdgeMKHz9U >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (m7138offsetFromEdgeMKHz9U & 4294967295L)) <= intBitsToFloat2) {
            return Offset.m5147getDistanceSquaredimpl(m7138offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "ExpectAttachedLayoutCoordinates", "", "UnmeasuredError", "onCommitAffectingLayerParams", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent;
        if (m7134hasNodeH91voCI(NodeKind.m7164constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int m7164constructorimpl = NodeKind.m7164constructorimpl(128);
                boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(m7164constructorimpl);
                if (m7173getIncludeSelfInTraversalH91voCI) {
                    parent = getTail();
                } else {
                    parent = getTail().getParent();
                    if (parent == null) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m7164constructorimpl) != 0; headNode = headNode.getChild()) {
                    if ((headNode.getKindSet() & m7164constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNode = headNode;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) delegatingNode).mo454onRemeasuredozmzZPI(getMeasuredSize());
                            } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (headNode == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void onUnplaced() {
        if (m7134hasNodeH91voCI(NodeKind.m7164constructorimpl(1048576))) {
            int m7164constructorimpl = NodeKind.m7164constructorimpl(1048576);
            boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(m7164constructorimpl);
            Modifier.Node tail = getTail();
            if (!m7173getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
                return;
            }
            for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m7164constructorimpl) != 0; headNode = headNode.getChild()) {
                if ((headNode.getKindSet() & m7164constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof UnplacedAwareModifierNode) {
                            ((UnplacedAwareModifierNode) delegatingNode).onUnplaced();
                        } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate = delegatingNode.getDelegate();
                            int i = 0;
                            delegatingNode = delegatingNode;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNode = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(delegatingNode);
                                            }
                                            delegatingNode = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNode = delegatingNode;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node m7150headH91voCI = m7150headH91voCI(NodeKind.m7164constructorimpl(4));
        if (m7150headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui().m7086draweZhPAX0$ui(canvas, IntSizeKt.m8410toSizeozmzZPI(mo6852getSizeYbymL2g()), this, m7150headH91voCI, graphicsLayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        int m7164constructorimpl = NodeKind.m7164constructorimpl(4194304);
        boolean m7173getIncludeSelfInTraversalH91voCI = NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(m7164constructorimpl);
        Modifier.Node tail = getTail();
        if (!m7173getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node headNode = headNode(m7173getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m7164constructorimpl) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & m7164constructorimpl) != 0) {
                DelegatingNode delegatingNode = headNode;
                MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
                    } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate = delegatingNode.getDelegate();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(delegatingNode);
                                        }
                                        delegatingNode = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            delegate = delegate.getChild();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m7152isPointerInBoundsk4lQ0M(long pointerPosition) {
        float intBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < ((float) getMeasuredWidth()) && intBitsToFloat2 < ((float) getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m7173getIncludeSelfInTraversalH91voCI(NodeKind.m7164constructorimpl(16)));
        if (headNode != null && headNode.getIsAttached()) {
            Modifier.Node node = headNode;
            int m7164constructorimpl = NodeKind.m7164constructorimpl(16);
            if (!node.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node2 = node.getNode();
            if ((node2.getAggregateChildKindSet() & m7164constructorimpl) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & m7164constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node2;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((delegatingNode.getKindSet() & m7164constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7164constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node2 = node2.getChild();
                }
            }
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m7138offsetFromEdgeMKHz9U(long pointerPosition) {
        float intBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float max = Math.max(0.0f, intBitsToFloat < 0.0f ? -intBitsToFloat : intBitsToFloat - getMeasuredWidth());
        return Offset.m5140constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (pointerPosition & 4294967295L)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & 4294967295L));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m7145calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        float intBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - getMeasuredWidth();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L)) - getMeasuredHeight();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return Size.m5208constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }
}
