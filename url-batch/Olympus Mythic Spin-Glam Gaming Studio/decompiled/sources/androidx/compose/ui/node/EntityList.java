package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifier;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EntityList.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0081@\u0018\u0000 32\u00020\u0001:\u000234B$\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00030\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0017\u001a\u00020\u000b\"\u0012\b\u0000\u0010\u0011*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00032\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0014\b\u0000\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0018*\u00020\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u001e2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0010\u0010(\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010/\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R'\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u00102\u0088\u0001\u0004\u0092\u0001\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00030\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/node/EntityList;", "", "", "Landroidx/compose/ui/node/LayoutNodeEntity;", "entities", "constructor-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)[Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "layoutNodeWrapper", "Landroidx/compose/ui/Modifier;", "modifier", "", "addBeforeLayoutModifier-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier;)V", "addBeforeLayoutModifier", "addAfterLayoutModifier-impl", "addAfterLayoutModifier", "T", "entity", "", "index", "add-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Landroidx/compose/ui/node/LayoutNodeEntity;I)V", m.l, "M", "Landroidx/compose/ui/node/EntityList$EntityType;", "entityType", "head-0OSVbXo", "([Landroidx/compose/ui/node/LayoutNodeEntity;I)Landroidx/compose/ui/node/LayoutNodeEntity;", "head", "", "has-0OSVbXo", "([Landroidx/compose/ui/node/LayoutNodeEntity;I)Z", "has", "clear-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)V", "clear", "", "toString-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)Ljava/lang/String;", "toString", "hashCode-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;)I", "hashCode", "other", "equals-impl", "([Landroidx/compose/ui/node/LayoutNodeEntity;Ljava/lang/Object;)Z", "equals", "[Landroidx/compose/ui/node/LayoutNodeEntity;", "getEntities", "()[Landroidx/compose/ui/node/LayoutNodeEntity;", "Companion", "EntityType", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EntityList {
    private final LayoutNodeEntity[] entities;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DrawEntityType = EntityType.m2005constructorimpl(0);
    private static final int PointerInputEntityType = EntityType.m2005constructorimpl(1);
    private static final int SemanticsEntityType = EntityType.m2005constructorimpl(2);
    private static final int ParentDataEntityType = EntityType.m2005constructorimpl(3);
    private static final int OnPlacedEntityType = EntityType.m2005constructorimpl(4);
    private static final int RemeasureEntityType = EntityType.m2005constructorimpl(5);

    /* compiled from: EntityList.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0007\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/EntityList$EntityType;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "T", "Landroidx/compose/ui/Modifier;", "M", "", "", "index", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getIndex", "()I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class EntityType<T extends LayoutNodeEntity<T, M>, M extends Modifier> {
        private final int index;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m2005constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2006equalsimpl(int i, Object obj) {
            return (obj instanceof EntityType) && i == ((EntityType) obj).getIndex();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2007hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2008toStringimpl(int i) {
            return "EntityType(index=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m2006equalsimpl(this.index, obj);
        }

        public int hashCode() {
            return m2007hashCodeimpl(this.index);
        }

        public String toString() {
            return m2008toStringimpl(this.index);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getIndex() {
            return this.index;
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static LayoutNodeEntity[] m1991constructorimpl(LayoutNodeEntity[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        return entities;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1993equalsimpl(LayoutNodeEntity[] layoutNodeEntityArr, Object obj) {
        return (obj instanceof EntityList) && Intrinsics.areEqual(layoutNodeEntityArr, ((EntityList) obj).getEntities());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1995hashCodeimpl(LayoutNodeEntity[] layoutNodeEntityArr) {
        return Arrays.hashCode(layoutNodeEntityArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1997toStringimpl(LayoutNodeEntity[] layoutNodeEntityArr) {
        return "EntityList(entities=" + Arrays.toString(layoutNodeEntityArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1993equalsimpl(this.entities, obj);
    }

    public int hashCode() {
        return m1995hashCodeimpl(this.entities);
    }

    public String toString() {
        return m1997toStringimpl(this.entities);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ LayoutNodeEntity[] getEntities() {
        return this.entities;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ LayoutNodeEntity[] m1992constructorimpl$default(LayoutNodeEntity[] layoutNodeEntityArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            layoutNodeEntityArr = new LayoutNodeEntity[6];
        }
        return m1991constructorimpl(layoutNodeEntityArr);
    }

    /* renamed from: addBeforeLayoutModifier-impl, reason: not valid java name */
    public static final void m1989addBeforeLayoutModifierimpl(LayoutNodeEntity[] layoutNodeEntityArr, LayoutNodeWrapper layoutNodeWrapper, Modifier modifier) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (modifier instanceof DrawModifier) {
            m1987addimpl(layoutNodeEntityArr, new DrawEntity(layoutNodeWrapper, (DrawModifier) modifier), DrawEntityType);
        }
        if (modifier instanceof PointerInputModifier) {
            m1987addimpl(layoutNodeEntityArr, new PointerInputEntity(layoutNodeWrapper, (PointerInputModifier) modifier), PointerInputEntityType);
        }
        if (modifier instanceof SemanticsModifier) {
            m1987addimpl(layoutNodeEntityArr, new SemanticsEntity(layoutNodeWrapper, (SemanticsModifier) modifier), SemanticsEntityType);
        }
        if (modifier instanceof ParentDataModifier) {
            m1987addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), ParentDataEntityType);
        }
    }

    /* renamed from: addAfterLayoutModifier-impl, reason: not valid java name */
    public static final void m1988addAfterLayoutModifierimpl(LayoutNodeEntity[] layoutNodeEntityArr, LayoutNodeWrapper layoutNodeWrapper, Modifier modifier) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (modifier instanceof OnPlacedModifier) {
            m1987addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), OnPlacedEntityType);
        }
        if (modifier instanceof OnRemeasuredModifier) {
            m1987addimpl(layoutNodeEntityArr, new SimpleEntity(layoutNodeWrapper, modifier), RemeasureEntityType);
        }
    }

    /* renamed from: add-impl, reason: not valid java name */
    private static final void m1987addimpl(LayoutNodeEntity[] layoutNodeEntityArr, LayoutNodeEntity layoutNodeEntity, int i) {
        layoutNodeEntity.setNext(layoutNodeEntityArr[i]);
        layoutNodeEntityArr[i] = layoutNodeEntity;
    }

    /* renamed from: head-0OSVbXo, reason: not valid java name */
    public static final LayoutNodeEntity m1996head0OSVbXo(LayoutNodeEntity[] layoutNodeEntityArr, int i) {
        return layoutNodeEntityArr[i];
    }

    /* renamed from: has-0OSVbXo, reason: not valid java name */
    public static final boolean m1994has0OSVbXo(LayoutNodeEntity[] layoutNodeEntityArr, int i) {
        return layoutNodeEntityArr[i] != null;
    }

    /* compiled from: EntityList.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR2\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00140\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR8\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\u0004\u0012\u00020\u00170\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\b\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\nR2\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0013\u0012\u0004\u0012\u00020\u001b0\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001d\u0010\nR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/EntityList$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/node/EntityList$EntityType;", "Landroidx/compose/ui/node/DrawEntity;", "Landroidx/compose/ui/draw/DrawModifier;", "DrawEntityType", "I", "getDrawEntityType-EEbPh1w", "()I", "Landroidx/compose/ui/node/PointerInputEntity;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "PointerInputEntityType", "getPointerInputEntityType-EEbPh1w", "Landroidx/compose/ui/semantics/SemanticsEntity;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "SemanticsEntityType", "getSemanticsEntityType-EEbPh1w", "Landroidx/compose/ui/node/SimpleEntity;", "Landroidx/compose/ui/layout/ParentDataModifier;", "ParentDataEntityType", "getParentDataEntityType-EEbPh1w", "Landroidx/compose/ui/layout/OnPlacedModifier;", "OnPlacedEntityType", "getOnPlacedEntityType-EEbPh1w", "getOnPlacedEntityType-EEbPh1w$annotations", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "RemeasureEntityType", "getRemeasureEntityType-EEbPh1w", "", "TypeCount", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getDrawEntityType-EEbPh1w, reason: not valid java name */
        public final int m1999getDrawEntityTypeEEbPh1w() {
            return EntityList.DrawEntityType;
        }

        /* renamed from: getPointerInputEntityType-EEbPh1w, reason: not valid java name */
        public final int m2002getPointerInputEntityTypeEEbPh1w() {
            return EntityList.PointerInputEntityType;
        }

        /* renamed from: getSemanticsEntityType-EEbPh1w, reason: not valid java name */
        public final int m2004getSemanticsEntityTypeEEbPh1w() {
            return EntityList.SemanticsEntityType;
        }

        /* renamed from: getParentDataEntityType-EEbPh1w, reason: not valid java name */
        public final int m2001getParentDataEntityTypeEEbPh1w() {
            return EntityList.ParentDataEntityType;
        }

        /* renamed from: getOnPlacedEntityType-EEbPh1w, reason: not valid java name */
        public final int m2000getOnPlacedEntityTypeEEbPh1w() {
            return EntityList.OnPlacedEntityType;
        }

        /* renamed from: getRemeasureEntityType-EEbPh1w, reason: not valid java name */
        public final int m2003getRemeasureEntityTypeEEbPh1w() {
            return EntityList.RemeasureEntityType;
        }
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m1990clearimpl(LayoutNodeEntity[] layoutNodeEntityArr) {
        for (LayoutNodeEntity layoutNodeEntity : layoutNodeEntityArr) {
            for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.getNext()) {
                if (layoutNodeEntity.getIsAttached()) {
                    layoutNodeEntity.onDetach();
                }
            }
        }
        int length = layoutNodeEntityArr.length;
        for (int i = 0; i < length; i++) {
            layoutNodeEntityArr[i] = null;
        }
    }
}
