package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001(J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\u000eJ=\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0006H&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010\u000eR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "", "nextSelectableId", "()J", "selectableId", "notifyPositionChange", "(J)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "notifySelectionUpdateStart-d-4ec7I", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "", "isStartHandle", "notifySelectionUpdate-5iVPX68", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "()V", "notifySelectableChange", "", "Landroidx/compose/foundation/text/selection/Selection;", "getSubselections", "()Ljava/util/Map;", "subselections", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectionRegistrar {
    Map getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long selectableId);

    void notifySelectableChange(long selectableId);

    /* renamed from: notifySelectionUpdate-5iVPX68, reason: not valid java name */
    boolean mo679notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long selectableId);

    /* renamed from: notifySelectionUpdateStart-d-4ec7I, reason: not valid java name */
    void mo680notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long startPosition, SelectionAdjustment adjustment);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);

    /* compiled from: SelectionRegistrar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
