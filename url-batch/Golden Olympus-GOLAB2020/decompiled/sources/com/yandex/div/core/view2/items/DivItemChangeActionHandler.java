package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivItemChangeActionHandler {

    @NotNull
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    public static final boolean canHandle(@Nullable String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1789088446:
                return str.equals("set_next_item");
            case -1509135083:
                return str.equals("scroll_backward");
            case -1348467885:
                return str.equals("scroll_forward");
            case -1280379330:
                return str.equals("set_previous_item");
            case -770388272:
                return str.equals("scroll_to_start");
            case -88123690:
                return str.equals("set_current_item");
            case 633820873:
                return str.equals("scroll_to_end");
            case 1099321339:
                return str.equals("scroll_to_position");
            default:
                return false;
        }
    }

    private final Direction direction(String str) {
        return Intrinsics.areEqual(str, "set_previous_item") ? Direction.PREVIOUS : Intrinsics.areEqual(str, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }

    private final int getStepParam(Uri uri, int i4) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter != null) {
            try {
                return Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail(queryParameter + " is not a number");
                }
            }
        }
        return i4;
    }

    static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final boolean handleAction(@NotNull Uri uri, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.Companion;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController create = companion.create(queryParameter, view, resolver, divItemChangeActionHandler.direction(authority));
        if (create == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean parseBoolean = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority != null) {
            switch (authority.hashCode()) {
                case -1789088446:
                    if (authority.equals("set_next_item")) {
                        return divItemChangeActionHandler.handleNextItem(uri, parseBoolean, create);
                    }
                    break;
                case -1509135083:
                    if (authority.equals("scroll_backward")) {
                        return divItemChangeActionHandler.handleScrollBackward(uri, parseBoolean, create);
                    }
                    break;
                case -1348467885:
                    if (authority.equals("scroll_forward")) {
                        return divItemChangeActionHandler.handleScrollForward(uri, parseBoolean, create);
                    }
                    break;
                case -1280379330:
                    if (authority.equals("set_previous_item")) {
                        return divItemChangeActionHandler.handlePreviousItem(uri, parseBoolean, create);
                    }
                    break;
                case -770388272:
                    if (authority.equals("scroll_to_start")) {
                        return divItemChangeActionHandler.handleScrollToTheStart(parseBoolean, create);
                    }
                    break;
                case -88123690:
                    if (authority.equals("set_current_item")) {
                        return divItemChangeActionHandler.handleSetCurrentItem(uri, parseBoolean, create);
                    }
                    break;
                case 633820873:
                    if (authority.equals("scroll_to_end")) {
                        return divItemChangeActionHandler.handleScrollToTheEnd(parseBoolean, create);
                    }
                    break;
                case 1099321339:
                    if (authority.equals("scroll_to_position")) {
                        return divItemChangeActionHandler.handleScrollTo(uri, parseBoolean, create);
                    }
                    break;
            }
        }
        return false;
    }

    private final boolean handleNextItem(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z4);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z4);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z4);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z4);
        return true;
    }

    private final boolean handleScrollTo(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollTo(getStepParam$default(this, uri, 0, 1, null), z4);
        return true;
    }

    private final boolean handleScrollToTheEnd(boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToEnd(z4);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean z4, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToStart(z4);
        return true;
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean z4, DivViewWithItemsController divViewWithItemsController) {
        String queryParameter = uri.getQueryParameter("item");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            divViewWithItemsController.setCurrentItem(Integer.parseInt(queryParameter), z4);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter + " is not a number");
            }
            return false;
        }
    }
}
