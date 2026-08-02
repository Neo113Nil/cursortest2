package com.stripe.hcaptcha;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import com.appsflyer.AdRevenueScheme;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.LinkAuthIntent;
import com.stripe.android.model.MobileFallbackWebviewParams;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.address.NameType;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.ParameterDestination;
import com.stripe.android.view.PaymentAuthWebView;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class HCaptchaHtmlKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HCaptchaHtmlKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                return "\n<!DOCTYPE HTML>\n<html lang=\"en\">\n<head>\n    <title>hCaptcha Android</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n    <style>\n        * {\n            padding: 0;\n            margin: 0;\n        }\n        html {\n            height: 100%;\n        }\n        body {\n            display: table;\n            width: 100%;\n            height: 100%;\n            text-align: center;\n        }\n        #hcaptcha-container {\n            margin-top: 5px;\n            display: table-cell;\n            vertical-align: middle;\n        }\n        /* overwrite hCaptcha iframe overlay which adds a #FFF background with opacity 0.05 */\n        div > div:nth-child(2) {\n            opacity: 0 !important;\n        }\n    </style>\n</head>\n<body>\n<div id=\"hcaptcha-container\"></div>\n<script type=\"text/javascript\">\n    if (window.JSDI) {\n        JSON.parse(window.JSDI.getDebugInfo()).forEach(function (v) { window[v] = true; });\n    }\n</script>\n<script type=\"text/javascript\">\n    // Android will inject this bridge object as `JSInterface`\n    // Browser is missing it, so we mock it\n    var BridgeObject = window.JSInterface || {\n        getConfig: function getConfig() {\n            return JSON.stringify({\n                siteKey: '10000000-ffff-ffff-ffff-000000000001',\n                locale: 'ro',\n                size: 'compact',\n                orientation: 'portrait',\n                theme: 'dark',\n                sentry: true,\n                rqdata: null,\n                jsSrc: 'https://js.hcaptcha.com/1/api.js',\n                endpoint: null,\n                assethost: null,\n                imghost: null,\n                reportapi: null\n            });\n        },\n        onPass: function onPass(token) {\n            return console.log(\"pass: token \".concat(token));\n        },\n        onError: function onError(errCode) {\n            return console.log(\"error: code \".concat(errCode));\n        },\n        onLoaded: function onLoaded() {\n            return console.log('cb: api is loaded');\n        },\n        onOpen: function onOpen() {\n            return console.log('cb: challenge is visible');\n        }\n    };\n    var bridgeConfig = JSON.parse(BridgeObject.getConfig());\n    var hCaptchaID = null;\n    /**\n     * Called programmatically from HCaptchaWebViewHelper.\n     */\n    function resetAndExecute() {\n        hcaptcha.reset();\n        hcaptcha.execute(hCaptchaID);\n    }\n    function reset() {\n        hcaptcha.reset();\n    }\n    function getTheme(bridgeConfig) {\n        var theme = bridgeConfig.theme;\n        var customTheme = bridgeConfig.customTheme;\n        if (customTheme) {\n            try {\n                return JSON.parse(customTheme);\n            } catch (e) {\n                console.error(e);\n                BridgeObject.onError(32);\n            }\n        }\n        return theme;\n    }\n    function getRenderConfig() {\n        return {\n            sitekey: bridgeConfig.siteKey,\n            size: bridgeConfig.size,\n            orientation: bridgeConfig.orientation,\n            theme: getTheme(bridgeConfig),\n            callback: function callback(token) {\n                return BridgeObject.onPass(token);\n            },\n            'chalexpired-callback': function chalexpiredCallback() {\n                return BridgeObject.onError(15);\n            },\n            'close-callback': function closeCallback() {\n                return BridgeObject.onError(30);\n            },\n            'error-callback': function errorCallback(error) {\n                switch(error) {\n                    case \"rate-limited\":\n                        return BridgeObject.onError(31);\n                    case \"network-error\":\n                        return BridgeObject.onError(7);\n                    case \"invalid-data\":\n                        return BridgeObject.onError(8);\n                    case \"challenge-error\":\n                        return BridgeObject.onError(9);\n                    case \"internal-error\":\n                        return BridgeObject.onError(10);\n                    default:\n                        // Error not handled? Log it for debugging purposes\n                        console.error(error);\n                        return BridgeObject.onError(29);\n                }\n            },\n            'open-callback': function openCallback() {\n                return BridgeObject.onOpen();\n            }\n        };\n    }\n    function onHcaptchaLoaded() {\n        try {\n            var renderConfig = getRenderConfig();\n            hCaptchaID = hcaptcha.render('hcaptcha-container', renderConfig);\n            BridgeObject.onLoaded();\n            var rqdata = bridgeConfig.rqdata;\n            if (rqdata) {\n                hcaptcha.setData(hCaptchaID, { rqdata: rqdata });\n            }\n            if (renderConfig.size === 'invisible' && !bridgeConfig.hideDialog) {\n                // We want to auto execute in case of `invisible` checkbox.\n                // But not in case of `hideDialog` since verification process\n                // might be desired to happen at a later time.\n                hcaptcha.execute(hCaptchaID);\n            }\n        } catch (e) {\n            console.error(e);\n            BridgeObject.onError(29);\n        }\n    }\n    function addQueryParamIfDefined(url, queryName, queryValue) {\n        if (queryValue !== undefined && queryValue !== null) {\n            var link = url.indexOf('?') !== -1 ? '&' : '?';\n            return url + link + queryName + '=' + encodeURIComponent(queryValue);\n        }\n        return url;\n    }\n    function loadApi() {\n        var siteKey = bridgeConfig.siteKey;\n        var locale = bridgeConfig.locale;\n        var sentry = bridgeConfig.sentry;\n        var jsSrc = bridgeConfig.jsSrc;\n        var endpoint = bridgeConfig.endpoint;\n        var assethost = bridgeConfig.assethost;\n        var imghost = bridgeConfig.imghost;\n        var reportapi = bridgeConfig.reportapi;\n        var host = bridgeConfig.host || siteKey + '.android-sdk.hcaptcha.com';\n        var scriptSrc = jsSrc + '?render=explicit&onload=' + onHcaptchaLoaded.name;\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'recaptchacompat', 'off');\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'hl', locale);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'host', host);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'sentry', sentry);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'endpoint', endpoint);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'assethost', assethost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'imghost', imghost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'reportapi', reportapi);\n        if (bridgeConfig.customTheme) {\n            scriptSrc = addQueryParamIfDefined(scriptSrc, 'custom', 'true');\n        }\n        var script = document.createElement('script');\n        script.async = true;\n        script.src = scriptSrc;\n        script.onerror = function () {\n            // network issue\n            BridgeObject.onError(7);\n        };\n        document.head.appendChild(script);\n    }\n    var container = document.getElementById(\"hcaptcha-container\");\n    container.addEventListener(\"click\", function () {\n        if (window.hcaptcha) {\n            // Allows dismissal of checkbox view\n            window.hcaptcha.close();\n        } else {\n            BridgeObject.onError(30);\n        }\n    });\n    loadApi();\n</script>\n</body>\n</html>\n";
            case 1:
                ConsumerSession.VerificationSession.SessionType[] values = ConsumerSession.VerificationSession.SessionType.values();
                values.getClass();
                return new EnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", (Enum[]) values);
            case 2:
                ConsumerSession.VerificationSession.SessionState[] values2 = ConsumerSession.VerificationSession.SessionState.values();
                values2.getClass();
                return new EnumSerializer("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", (Enum[]) values2);
            case 3:
                LinkAuthIntent.Status[] values3 = LinkAuthIntent.Status.values();
                values3.getClass();
                return new EnumSerializer("com.stripe.android.model.LinkAuthIntent.Status", (Enum[]) values3);
            case 4:
                return MobileFallbackWebviewParams.WebviewRequirementType.INSTANCE.serializer();
            case 5:
                _init_$_anonymous_ = MobileFallbackWebviewParams.WebviewRequirementType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 6:
                int i2 = StripeBrowserLauncherActivity.$r8$clinit;
                return new StripeBrowserLauncherViewModel.Factory(i);
            case 7:
                return StripeTheme.sectionStyle;
            case 8:
                return StripeTheme.textFieldInsets;
            case 9:
                return StripeTheme.colorsLightMutable;
            case 10:
                return StripeTheme.shapesMutable;
            case 11:
                return StripeTheme.typographyMutable;
            case 12:
                StripeColors stripeColors = StripeTheme.colorsLightMutable;
                return null;
            case 13:
                return StripeTheme.iconStyle;
            case 14:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = StripeThemeKt.LocalColors;
                return Boolean.FALSE;
            case 15:
                return FieldType.Companion.serializer();
            case 16:
                return new HashSetSerializer(StringSerializer.INSTANCE, 1);
            case 17:
                return NameType.Companion.serializer();
            case 18:
                return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.FieldType", FieldType.values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", "postalCode", "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 19:
                return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.address.NameType", NameType.values(), new String[]{"area", "cedex", "city", AdRevenueScheme.COUNTRY, "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 20:
                return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.elements.AddressFieldConfiguration", AddressFieldConfiguration.values(), new String[]{"hidden", "optional", "required"}, new Annotation[][]{null, null, null});
            case 21:
                return new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(ParameterDestination.class), new Annotation[0]);
            case 22:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 23:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 24:
                throw new IllegalStateException("No ImageOptimizer provided");
            case 25:
                throw new IllegalStateException("No ImageLoader provided");
            case 26:
                int i3 = PaymentAuthWebView.$r8$clinit;
                return Unit.INSTANCE;
            case 27:
                return HCaptchaSize.Companion.serializer();
            case 28:
                return HCaptchaOrientation.Companion.serializer();
            default:
                return HCaptchaTheme.Companion.serializer();
        }
    }
}
