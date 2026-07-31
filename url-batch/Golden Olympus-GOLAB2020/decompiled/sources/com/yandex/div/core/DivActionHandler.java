package com.yandex.div.core;

import O1.C0892k0;
import O1.M4;
import O1.Wf;
import O1.Xb;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.yandex.div.core.actions.DivActionTypedHandlerProxy;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.items.DivItemChangeActionHandler;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DivActionHandler {
    private static final String AUTHORITY_HIDE_TOOLTIP = "hide_tooltip";
    private static final String AUTHORITY_SET_VARIABLE = "set_variable";
    private static final String AUTHORITY_SHOW_TOOLTIP = "show_tooltip";
    private static final String AUTHORITY_SWITCH_STATE = "set_state";
    private static final String AUTHORITY_TIMER = "timer";
    private static final String AUTHORITY_VIDEO = "video";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_ID = "id";
    private static final String PARAM_MULTIPLE = "multiple";
    private static final String PARAM_STATE_ID = "state_id";
    private static final String PARAM_TEMPORARY = "temporary";
    private static final String PARAM_VARIABLE_NAME = "name";
    private static final String PARAM_VARIABLE_VALUE = "value";
    private static final String SCHEME_DIV_ACTION = "div-action";

    private static ExpressionResolver findExpressionResolverById(Div2View div2View, String str) {
        BindingContext bindingContext;
        if (str == null) {
            return null;
        }
        KeyEvent.Callback findSingleViewWithTag = ViewLocator.findSingleViewWithTag(div2View, str);
        if (!(findSingleViewWithTag instanceof DivHolderView) || (bindingContext = ((DivHolderView) findSingleViewWithTag).getBindingContext()) == null) {
            return null;
        }
        return bindingContext.getExpressionResolver();
    }

    private boolean handleActionInternal(String str, Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View;
        String authority = uri.getAuthority();
        if (AUTHORITY_SWITCH_STATE.equals(authority)) {
            String queryParameter = uri.getQueryParameter(PARAM_STATE_ID);
            if (queryParameter == null) {
                Assert.fail("state_id param is required");
                return false;
            }
            try {
                divViewFacade.switchToState(DivStatePath.parse(queryParameter), uri.getBooleanQueryParameter(PARAM_TEMPORARY, true));
                return true;
            } catch (PathFormatException e4) {
                Assert.fail("Invalid format of " + queryParameter, e4);
                return false;
            }
        }
        if (AUTHORITY_SHOW_TOOLTIP.equals(authority)) {
            String queryParameter2 = uri.getQueryParameter("id");
            if (queryParameter2 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.showTooltip(queryParameter2, uri.getBooleanQueryParameter(PARAM_MULTIPLE, false));
            return true;
        }
        if (AUTHORITY_HIDE_TOOLTIP.equals(authority)) {
            String queryParameter3 = uri.getQueryParameter("id");
            if (queryParameter3 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.hideTooltip(queryParameter3);
            return true;
        }
        if (AUTHORITY_SET_VARIABLE.equals(authority)) {
            String queryParameter4 = uri.getQueryParameter("name");
            if (queryParameter4 == null) {
                Assert.fail("name param is required");
                return false;
            }
            String queryParameter5 = uri.getQueryParameter("value");
            if (queryParameter5 == null) {
                Assert.fail("value param unspecified for " + queryParameter4);
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                Assert.fail("Variable '" + queryParameter4 + "' mutation failed! View(" + divViewFacade.getClass().getSimpleName() + ") not supports variables!");
                return false;
            }
            try {
                VariableMutationHandler.setVariable(div2View, queryParameter4, queryParameter5, expressionResolver);
                return true;
            } catch (VariableMutationException e5) {
                Assert.fail("Variable '" + queryParameter4 + "' mutation failed: " + e5.getMessage(), e5);
                return false;
            }
        }
        if (!AUTHORITY_TIMER.equals(authority)) {
            if (!AUTHORITY_VIDEO.equals(authority)) {
                if (DivItemChangeActionHandler.canHandle(authority)) {
                    return DivItemChangeActionHandler.handleAction(uri, divViewFacade, expressionResolver);
                }
                if (StoredValuesActionHandler.canHandle(authority)) {
                    return StoredValuesActionHandler.handleAction(uri, divViewFacade);
                }
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                Assert.fail("Handler view is not instance of Div2View");
                return false;
            }
            String queryParameter6 = uri.getQueryParameter("id");
            if (queryParameter6 == null) {
                Assert.fail("Video action has no id param");
                return false;
            }
            String queryParameter7 = uri.getQueryParameter("action");
            if (queryParameter7 != null) {
                return div2View.applyVideoCommand(queryParameter6, queryParameter7, expressionResolver);
            }
            Assert.fail("Video action has no action param");
            return false;
        }
        String queryParameter8 = uri.getQueryParameter("id");
        if (queryParameter8 == null) {
            Assert.fail("id param is required");
            return false;
        }
        String queryParameter9 = uri.getQueryParameter("action");
        if (queryParameter9 == null) {
            Assert.fail("action param is required");
            return false;
        }
        div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View != null) {
            div2View.applyTimerCommand(queryParameter8, queryParameter9);
            return true;
        }
        Assert.fail("Timer '" + queryParameter8 + "' state changing failed! View(" + divViewFacade.getClass().getSimpleName() + ") not supports timers!");
        return false;
    }

    public boolean getUseActionUid() {
        return false;
    }

    public boolean handleAction(@NonNull C0892k0 c0892k0, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver findExpressionResolverById = findExpressionResolverById(div2View, c0892k0.f6759h);
        if (findExpressionResolverById == null) {
            findExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleAction(c0892k0, divViewFacade, findExpressionResolverById)) {
            return true;
        }
        Expression expression = c0892k0.f6762k;
        Uri uri = expression != null ? (Uri) expression.evaluate(expressionResolver) : null;
        return DivDownloadActionHandler.canHandle(uri, divViewFacade) ? DivDownloadActionHandler.handleAction(c0892k0, div2View, findExpressionResolverById) : handleAction(c0892k0.f6759h, uri, divViewFacade, findExpressionResolverById);
    }

    public boolean handleActionUrl(Uri uri, @NonNull DivViewFacade divViewFacade) {
        return handleActionUrl(uri, divViewFacade, divViewFacade.getExpressionResolver());
    }

    public boolean handleActionWithReason(@NonNull C0892k0 c0892k0, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(c0892k0, divViewFacade, expressionResolver);
    }

    public void handlePayload(@NonNull JSONObject jSONObject) {
    }

    public final boolean handleActionUrl(Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        return handleActionUrl(null, uri, divViewFacade, expressionResolver);
    }

    public boolean handleActionWithReason(@NonNull C0892k0 c0892k0, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str, @NonNull String str2) {
        return handleAction(c0892k0, divViewFacade, expressionResolver, str);
    }

    public final boolean handleActionUrl(String str, Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        ExpressionResolver findExpressionResolverById = findExpressionResolverById((Div2View) divViewFacade, str);
        if (findExpressionResolverById != null) {
            expressionResolver = findExpressionResolverById;
        }
        return handleAction(str, uri, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull C0892k0 c0892k0, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(c0892k0, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull Wf wf, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        return handleAction((Xb) wf, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull M4 m4, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        return handleAction((Xb) m4, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull Xb xb, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver findExpressionResolverById = findExpressionResolverById(div2View, xb.d());
        if (findExpressionResolverById == null) {
            findExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleVisibilityAction(xb, divViewFacade, findExpressionResolverById)) {
            return true;
        }
        Uri uri = xb.getUrl() != null ? (Uri) xb.getUrl().evaluate(expressionResolver) : null;
        if (DivDownloadActionHandler.canHandle(uri, divViewFacade)) {
            return DivDownloadActionHandler.handleVisibilityAction(xb, div2View, findExpressionResolverById);
        }
        return handleAction(xb.d(), uri, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull Wf wf, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(wf, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull M4 m4, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(m4, divViewFacade, expressionResolver);
    }

    public boolean handleAction(@NonNull Xb xb, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver, @NonNull String str) {
        return handleAction(xb, divViewFacade, expressionResolver);
    }

    private boolean handleAction(String str, Uri uri, @NonNull DivViewFacade divViewFacade, @NonNull ExpressionResolver expressionResolver) {
        if (uri != null && SCHEME_DIV_ACTION.equals(uri.getScheme())) {
            return handleActionInternal(str, uri, divViewFacade, expressionResolver);
        }
        return false;
    }
}
