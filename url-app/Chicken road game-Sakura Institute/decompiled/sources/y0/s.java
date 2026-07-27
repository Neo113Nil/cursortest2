package y0;

import M2.F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ S2.e[] f11639a;

    static {
        M2.t tVar = new M2.t("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        F.f3581a.getClass();
        f11639a = new S2.e[]{tVar, new M2.t("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new M2.t("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new M2.t("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new M2.t("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new M2.t("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new M2.t("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new M2.t("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new M2.t("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new M2.t("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new M2.t("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new M2.t("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new M2.t("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new M2.t("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new M2.t("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new M2.t("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new M2.t("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new M2.t("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new M2.t("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new M2.t("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new M2.t("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        t tVar2 = q.f11612a;
        t tVar3 = h.f11550a;
    }

    public static final t a(String str) {
        t tVar = new t(str);
        tVar.f11642c = true;
        return tVar;
    }

    public static final t b(String str, Function2 function2) {
        return new t(str, true, function2);
    }

    public static void c(i iVar, Function1 function1) {
        iVar.s(h.f11550a, new C1317a(null, function1));
    }

    public static final void d(i iVar, int i2) {
        t tVar = q.f11630s;
        S2.e eVar = f11639a[12];
        tVar.a(iVar, new f(i2));
    }
}
