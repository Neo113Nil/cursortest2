package com.yandex.div.core.downloader;

import O1.C0786e1;
import O1.C0892k0;
import O1.S4;
import O1.Xb;
import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivDownloadActionHandler {

    @NotNull
    public static final DivDownloadActionHandler INSTANCE = new DivDownloadActionHandler();

    private DivDownloadActionHandler() {
    }

    public static final boolean canHandle(@Nullable Uri uri, @NotNull DivViewFacade divViewFacade) {
        String authority;
        Intrinsics.checkNotNullParameter(divViewFacade, "divViewFacade");
        if (uri == null || (authority = uri.getAuthority()) == null || !Intrinsics.areEqual("download", authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            Assert.fail("url param is required!");
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        Assert.fail("Div2View should be used!");
        return false;
    }

    private final boolean executeDownload(String str, final List<C0892k0> list, final List<C0892k0> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        LoadReference loadRef = div2View.getDiv2Component$div_release().getDivDownloader().downloadPatch(div2View, str, new DivPatchDownloadCallback() { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$executeDownload$callback$1
        });
        Intrinsics.checkNotNullExpressionValue(loadRef, "loadRef");
        div2View.addLoadReference(loadRef, div2View);
        return true;
    }

    public static final boolean handleAction(@NotNull C0892k0 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression expression = action.f6762k;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uri, action.f6752a, view, resolver);
    }

    public static final boolean handleVisibilityAction(@NotNull Xb action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Expression url = action.getUrl();
        if (url == null || (uri = (Uri) url.evaluate(resolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(uri, action.b(), view, resolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleAction(@NotNull C0786e1 action, @Nullable S4 s4, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        List<C0892k0> list;
        List<C0892k0> list2;
        List<C0892k0> list3;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Uri uri = (Uri) action.f6068c.evaluate(resolver);
        List<C0892k0> list4 = action.f6066a;
        if (list4 == null) {
            if (s4 == null) {
                list = null;
                list2 = action.f6067b;
                if (list2 != null) {
                    list3 = s4 != null ? s4.f4708b : null;
                } else {
                    list3 = list2;
                }
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "url.toString()");
                return executeDownload(uri2, list3, list, view, resolver);
            }
            list4 = s4.f4707a;
        }
        list = list4;
        list2 = action.f6067b;
        if (list2 != null) {
        }
        String uri22 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri22, "url.toString()");
        return executeDownload(uri22, list3, list, view, resolver);
    }

    private final boolean handleAction(Uri uri, S4 s4, Div2View div2View, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        return executeDownload(queryParameter, s4 != null ? s4.f4708b : null, s4 != null ? s4.f4707a : null, div2View, expressionResolver);
    }
}
