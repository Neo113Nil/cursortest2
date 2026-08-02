package com.squareup.cash.support.backend.real.articles;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.glance.layout.SizeModifiersKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.supportarticles.app.v1.AppSupportArticleService;
import com.squareup.cash.supportarticles.app.v1.Color;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleForTransactionRequest;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleForTransactionResponse;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleRequest;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleResponse;
import com.squareup.cash.supportarticles.app.v1.Glyph;
import com.squareup.cash.supportarticles.app.v1.Icon;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.HttpUrl;
import okio.ByteString;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealArticlesService {
    public String cssCache;
    public final AppSupportArticleService service;
    public final RealSupportViewedArticlesStore supportViewedArticlesStore;
    public final LinkedHashMap articleCache = new LinkedHashMap();
    public final LinkedHashMap linkCache = new LinkedHashMap();

    /* loaded from: classes7.dex */
    public interface CssResult {

        public final class Failure implements CssResult {
            public final boolean isRetryable;

            public Failure(boolean z) {
                this.isRetryable = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && this.isRetryable == ((Failure) obj).isRetryable;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.isRetryable);
            }

            public final boolean isRetryable() {
                return this.isRetryable;
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Failure(isRetryable=", ")", this.isRetryable);
            }
        }

        public final class Success implements CssResult {
            public final String css;

            public Success(String str) {
                str.getClass();
                this.css = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.css, ((Success) obj).css);
            }

            public final String getCss() {
                return this.css;
            }

            public final int hashCode() {
                return this.css.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(css=", this.css, ")");
            }
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SupportArticle.Channel.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkCookieJar workCookieJar = SupportArticle.Channel.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkCookieJar workCookieJar2 = SupportArticle.Channel.Companion;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SupportArticle.Appearance.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Error.Code.Companion companion = SupportArticle.Appearance.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Error.Code.Companion companion2 = SupportArticle.Appearance.Companion;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Error.Code.Companion companion3 = SupportArticle.Appearance.Companion;
                iArr2[0] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Error.Code.Companion companion4 = SupportArticle.Appearance.Companion;
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Glyph.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                CardProduct.Companion companion5 = Glyph.Companion;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                CardProduct.Companion companion6 = Glyph.Companion;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                CardProduct.Companion companion7 = Glyph.Companion;
                iArr3[4] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                CardProduct.Companion companion8 = Glyph.Companion;
                iArr3[5] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                CardProduct.Companion companion9 = Glyph.Companion;
                iArr3[6] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                CardProduct.Companion companion10 = Glyph.Companion;
                iArr3[7] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                CardProduct.Companion companion11 = Glyph.Companion;
                iArr3[8] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                CardProduct.Companion companion12 = Glyph.Companion;
                iArr3[9] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                CardProduct.Companion companion13 = Glyph.Companion;
                iArr3[10] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                CardProduct.Companion companion14 = Glyph.Companion;
                iArr3[11] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                CardProduct.Companion companion15 = Glyph.Companion;
                iArr3[12] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                CardProduct.Companion companion16 = Glyph.Companion;
                iArr3[13] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                CardProduct.Companion companion17 = Glyph.Companion;
                iArr3[14] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                CardProduct.Companion companion18 = Glyph.Companion;
                iArr3[15] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                CardProduct.Companion companion19 = Glyph.Companion;
                iArr3[16] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                CardProduct.Companion companion20 = Glyph.Companion;
                iArr3[17] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                CardProduct.Companion companion21 = Glyph.Companion;
                iArr3[18] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                CardProduct.Companion companion22 = Glyph.Companion;
                iArr3[19] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                CardProduct.Companion companion23 = Glyph.Companion;
                iArr3[20] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Color.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                Op.Companion companion24 = Color.Companion;
                iArr4[2] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                Op.Companion companion25 = Color.Companion;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                Op.Companion companion26 = Color.Companion;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                Op.Companion companion27 = Color.Companion;
                iArr4[5] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                Op.Companion companion28 = Color.Companion;
                iArr4[6] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                Op.Companion companion29 = Color.Companion;
                iArr4[7] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                Op.Companion companion30 = Color.Companion;
                iArr4[8] = 8;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                Op.Companion companion31 = Color.Companion;
                iArr4[9] = 9;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                Op.Companion companion32 = Color.Companion;
                iArr4[10] = 10;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                Op.Companion companion33 = Color.Companion;
                iArr4[11] = 11;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                Op.Companion companion34 = Color.Companion;
                iArr4[12] = 12;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                Op.Companion companion35 = Color.Companion;
                iArr4[13] = 13;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public RealArticlesService(AppSupportArticleService appSupportArticleService, ResourceFileSystem.Companion companion, RealSupportViewedArticlesStore realSupportViewedArticlesStore) {
        this.service = appSupportArticleService;
        this.supportViewedArticlesStore = realSupportViewedArticlesStore;
    }

    public static String getFinalHtml(Article article, String str) {
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default("\n      <!DOCTYPE html>\n      <html lang=\"{{language}}\">\n        <head>\n          <meta charset=\"utf-8\">\n          <style>\n            {{css}}\n          </style>\n        </head>\n        <body>\n          {{html_body}}\n        </body>\n      </html>\n    ", "{{css}}", str), "{{language}}", article.getLanguage()), "{{html_body}}", article.getHtmlBody());
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Article toArticle(SupportArticle supportArticle) {
        Article.Appearance appearance;
        Icon icon;
        Article.Icon icon2;
        Iterator it;
        Iterator it2;
        char c;
        Article.ContactOption contactOption;
        Article.Glyph glyph;
        Article.Color color;
        String str = supportArticle.article_token;
        str.getClass();
        String str2 = supportArticle.title_text;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = supportArticle.preview_text;
        String str4 = supportArticle.body_html;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = supportArticle.body_language;
        String str6 = str5 != null ? str5 : "";
        SupportArticle.Appearance appearance2 = supportArticle.appearance;
        int i = appearance2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[appearance2.ordinal()];
        int i2 = 2;
        if (i != -1) {
            if (i == 1) {
                appearance = Article.Appearance.CATEGORY;
            } else if (i == 2) {
                appearance = Article.Appearance.SUBCATEGORY;
            } else if (i == 3) {
                appearance = Article.Appearance.ISSUE;
            } else if (i != 4 && i != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Boolean bool = supportArticle.include_in_recently_viewed;
            boolean booleanValue = bool == null ? bool.booleanValue() : false;
            Boolean bool2 = supportArticle.include_issue_description;
            boolean booleanValue2 = bool2 == null ? bool2.booleanValue() : true;
            Boolean bool3 = supportArticle.select_payment_for_case_creation;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            icon = supportArticle.icon;
            if (icon == null) {
                Glyph glyph2 = icon.glyph;
                switch (glyph2 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[glyph2.ordinal()]) {
                    case 1:
                        glyph = Article.Glyph.CARD;
                        break;
                    case 2:
                        glyph = Article.Glyph.BITCOIN;
                        break;
                    case 3:
                        glyph = Article.Glyph.INVESTING;
                        break;
                    case 4:
                        glyph = Article.Glyph.STAR;
                        break;
                    case 5:
                        glyph = Article.Glyph.DEPOSIT;
                        break;
                    case 6:
                        glyph = Article.Glyph.LIMITS;
                        break;
                    case 7:
                        glyph = Article.Glyph.PERSONAL;
                        break;
                    case 8:
                        glyph = Article.Glyph.BOOST;
                        break;
                    case 9:
                        glyph = Article.Glyph.BORROW;
                        break;
                    case 10:
                        glyph = Article.Glyph.PAY_WITH_CASH;
                        break;
                    case 11:
                        glyph = Article.Glyph.BUSINESS_ACCOUNT;
                        break;
                    case 12:
                        glyph = Article.Glyph.TAXES;
                        break;
                    case 13:
                        glyph = Article.Glyph.ADD;
                        break;
                    case 14:
                        glyph = Article.Glyph.WITHDRAW;
                        break;
                    case 15:
                        glyph = Article.Glyph.PEOPLE;
                        break;
                    case 16:
                        glyph = Article.Glyph.DEFAULT;
                        break;
                    case 17:
                        glyph = Article.Glyph.INFO;
                        break;
                    case 18:
                        glyph = Article.Glyph.PAYMENT_PLAN;
                        break;
                    case 19:
                        glyph = Article.Glyph.SAVINGS;
                        break;
                    case 20:
                        glyph = Article.Glyph.AFTERPAY;
                        break;
                    default:
                        glyph = Article.Glyph.UNSPECIFIED;
                        break;
                }
                Color color2 = icon.color;
                switch (color2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[color2.ordinal()]) {
                    case 1:
                        color = Article.Color.GREEN;
                        break;
                    case 2:
                        color = Article.Color.TURQUOISE;
                        break;
                    case 3:
                        color = Article.Color.SKY;
                        break;
                    case 4:
                        color = Article.Color.OCEAN;
                        break;
                    case 5:
                        color = Article.Color.ROYAL;
                        break;
                    case 6:
                        color = Article.Color.PURPLE;
                        break;
                    case 7:
                        color = Article.Color.PINK;
                        break;
                    case 8:
                        color = Article.Color.SCARLET;
                        break;
                    case 9:
                        color = Article.Color.AMBER;
                        break;
                    case 10:
                        color = Article.Color.SUNSHINE;
                        break;
                    case 11:
                        color = Article.Color.GRAY;
                        break;
                    case 12:
                        color = Article.Color.INVESTING;
                        break;
                    case 13:
                        color = Article.Color.BITCOIN;
                        break;
                    default:
                        color = Article.Color.UNSPECIFIED;
                        break;
                }
                icon2 = new Article.Icon(glyph, color);
            } else {
                icon2 = null;
            }
            List list = supportArticle.contact_options;
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                int ordinal = ((SupportArticle.ContactOption) it.next()).channel.ordinal();
                if (ordinal == 1) {
                    c = 4;
                    contactOption = Article.ContactOption.CHAT;
                } else if (ordinal != i2) {
                    c = 4;
                    contactOption = ordinal != 4 ? null : Article.ContactOption.PHONE;
                } else {
                    c = 4;
                    contactOption = Article.ContactOption.EMAIL;
                }
                if (contactOption != null) {
                    arrayList.add(contactOption);
                }
                i2 = 2;
            }
            List list2 = supportArticle.links;
            boolean z = booleanValue;
            ArrayList arrayList2 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
                Link link = SizeModifiersKt.toLink((SupportLink) it2.next());
                if (link != null) {
                    arrayList2.add(link);
                }
            }
            SupportLink supportLink = supportArticle.call_to_action;
            return new Article(str, str2, str4, str6, str3, appearance, z, booleanValue3, booleanValue2, icon2, arrayList, arrayList2, supportLink == null ? SizeModifiersKt.toLink(supportLink) : null);
        }
        appearance = Article.Appearance.ARTICLE;
        Boolean bool4 = supportArticle.include_in_recently_viewed;
        if (bool4 == null) {
        }
        Boolean bool22 = supportArticle.include_issue_description;
        if (bool22 == null) {
        }
        Boolean bool32 = supportArticle.select_payment_for_case_creation;
        if (bool32 != null) {
        }
        icon = supportArticle.icon;
        if (icon == null) {
        }
        List list3 = supportArticle.contact_options;
        ArrayList arrayList3 = new ArrayList();
        it = list3.iterator();
        while (it.hasNext()) {
        }
        List list22 = supportArticle.links;
        boolean z2 = booleanValue;
        ArrayList arrayList22 = new ArrayList();
        it2 = list22.iterator();
        while (it2.hasNext()) {
        }
        SupportLink supportLink2 = supportArticle.call_to_action;
        return new Article(str, str2, str4, str6, str3, appearance, z2, booleanValue3, booleanValue2, icon2, arrayList3, arrayList22, supportLink2 == null ? SizeModifiersKt.toLink(supportLink2) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getArticle(String str, String str2, ContinuationImpl continuationImpl) {
        RealArticlesService$getArticle$1 realArticlesService$getArticle$1;
        int i;
        ApiResult apiResult;
        Article article;
        CssResult cssResult;
        if (continuationImpl instanceof RealArticlesService$getArticle$1) {
            realArticlesService$getArticle$1 = (RealArticlesService$getArticle$1) continuationImpl;
            int i2 = realArticlesService$getArticle$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realArticlesService$getArticle$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realArticlesService$getArticle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realArticlesService$getArticle$1.label;
                LinkedHashMap linkedHashMap = this.articleCache;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Article article2 = (Article) linkedHashMap.get(str2);
                    String str3 = this.cssCache;
                    if (article2 != null && str3 != null) {
                        return new ArticlesService$ArticleResult.Success(article2, getFinalHtml(article2, str3));
                    }
                    GetSupportArticleRequest getSupportArticleRequest = new GetSupportArticleRequest(str2, (String) (objArr == true ? 1 : 0), 6);
                    realArticlesService$getArticle$1.L$1 = str2;
                    realArticlesService$getArticle$1.label = 1;
                    obj = this.service.getSupportArticle(str, getSupportArticleRequest, realArticlesService$getArticle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        article = realArticlesService$getArticle$1.L$5;
                        SafeTrace.throwOnFailure(obj);
                        cssResult = (CssResult) obj;
                        if (!(cssResult instanceof CssResult.Success)) {
                            return new ArticlesService$ArticleResult.Success(article, getFinalHtml(article, ((CssResult.Success) cssResult).getCss()));
                        }
                        if (cssResult instanceof CssResult.Failure) {
                            return new ArticlesService$ArticleResult.Failure(((CssResult.Failure) cssResult).isRetryable());
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = realArticlesService$getArticle$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ApiResult.Failure.NetworkFailure networkFailure = apiResult instanceof ApiResult.Failure.NetworkFailure ? (ApiResult.Failure.NetworkFailure) apiResult : null;
                    Timber.Forest.w("Failed to retrieve support article for token: %s", new Object[]{str2}, networkFailure != null ? networkFailure.error : null);
                    return new ArticlesService$ArticleResult.Failure(BundleKt.isRetryable((ApiResult.Failure) apiResult));
                }
                apiResult.getClass();
                GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) ((ApiResult.Success) apiResult).response;
                SupportArticle supportArticle = getSupportArticleResponse.article;
                Article article3 = supportArticle != null ? toArticle(supportArticle) : null;
                if (article3 == null) {
                    Timber.Forest.w("getSupportArticle() returned null article for token: %s", str2);
                    return new ArticlesService$ArticleResult.Failure(false);
                }
                linkedHashMap.put(str2, article3);
                String str4 = getSupportArticleResponse.stylesheet_url;
                if (str4 == null) {
                    str4 = "";
                }
                realArticlesService$getArticle$1.L$1 = null;
                realArticlesService$getArticle$1.L$5 = article3;
                realArticlesService$getArticle$1.label = 2;
                Object articleCss = getArticleCss(str4, realArticlesService$getArticle$1);
                if (articleCss != obj2) {
                    Article article4 = article3;
                    obj = articleCss;
                    article = article4;
                    cssResult = (CssResult) obj;
                    if (!(cssResult instanceof CssResult.Success)) {
                    }
                }
                return obj2;
            }
        }
        realArticlesService$getArticle$1 = new RealArticlesService$getArticle$1(this, continuationImpl);
        Object obj3 = realArticlesService$getArticle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realArticlesService$getArticle$1.label;
        LinkedHashMap linkedHashMap2 = this.articleCache;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getArticleCss(String str, ContinuationImpl continuationImpl) {
        RealArticlesService$getArticleCss$1 realArticlesService$getArticleCss$1;
        int i;
        HttpUrl httpUrl;
        ApiResult apiResult;
        if (continuationImpl instanceof RealArticlesService$getArticleCss$1) {
            realArticlesService$getArticleCss$1 = (RealArticlesService$getArticleCss$1) continuationImpl;
            int i2 = realArticlesService$getArticleCss$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realArticlesService$getArticleCss$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realArticlesService$getArticleCss$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realArticlesService$getArticleCss$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str.getClass();
                    try {
                        HttpUrl.Builder builder = new HttpUrl.Builder();
                        builder.parse$okhttp(null, str);
                        httpUrl = builder.build();
                    } catch (IllegalArgumentException unused) {
                        httpUrl = null;
                    }
                    if (httpUrl == null) {
                        Timber.Forest.w("Invalid CSS URL %s", str);
                        return new CssResult.Failure(false);
                    }
                    String str2 = this.cssCache;
                    if (str2 != null) {
                        return new CssResult.Success(str2);
                    }
                    realArticlesService$getArticleCss$1.label = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new ChatInputView$Content$1$1$1(httpUrl, continuation, 12), realArticlesService$getArticleCss$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new CssResult.Failure(BundleKt.isRetryable((ApiResult.Failure) apiResult));
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str3 = (String) ((ApiResult.Success) apiResult).response;
                this.cssCache = str3;
                return new CssResult.Success(str3);
            }
        }
        realArticlesService$getArticleCss$1 = new RealArticlesService$getArticleCss$1(this, continuationImpl);
        Object obj2 = realArticlesService$getArticleCss$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realArticlesService$getArticleCss$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005c, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0072, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getArticleForTransaction(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RealArticlesService$getArticleForTransaction$1 realArticlesService$getArticleForTransaction$1;
        int i;
        ApiResult apiResult;
        Pair pair;
        if (continuationImpl instanceof RealArticlesService$getArticleForTransaction$1) {
            realArticlesService$getArticleForTransaction$1 = (RealArticlesService$getArticleForTransaction$1) continuationImpl;
            int i2 = realArticlesService$getArticleForTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realArticlesService$getArticleForTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realArticlesService$getArticleForTransaction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realArticlesService$getArticleForTransaction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppSupportArticleService appSupportArticleService = this.service;
                    if (str3 == null) {
                        GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest = new GetSupportArticleForTransactionRequest(str2, ByteString.EMPTY);
                        realArticlesService$getArticleForTransaction$1.L$1 = str2;
                        realArticlesService$getArticleForTransaction$1.L$2 = str3;
                        realArticlesService$getArticleForTransaction$1.label = 1;
                        obj = appSupportArticleService.getSupportArticleForTransaction(str, getSupportArticleForTransactionRequest, realArticlesService$getArticleForTransaction$1);
                    } else {
                        GetSupportArticleRequest getSupportArticleRequest = new GetSupportArticleRequest(str3, str2, 4);
                        realArticlesService$getArticleForTransaction$1.L$1 = str2;
                        realArticlesService$getArticleForTransaction$1.L$2 = str3;
                        realArticlesService$getArticleForTransaction$1.label = 2;
                        obj = appSupportArticleService.getSupportArticle(str, getSupportArticleRequest, realArticlesService$getArticleForTransaction$1);
                    }
                }
                if (i == 1) {
                    str3 = realArticlesService$getArticleForTransaction$1.L$2;
                    str2 = realArticlesService$getArticleForTransaction$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = realArticlesService$getArticleForTransaction$1.L$2;
                    str2 = realArticlesService$getArticleForTransaction$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                }
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure.NetworkFailure networkFailure = apiResult instanceof ApiResult.Failure.NetworkFailure ? (ApiResult.Failure.NetworkFailure) apiResult : null;
                    Timber.Forest.w(CameraSelector$$ExternalSyntheticOutline0.m("Failed to retrieve support article for ", str3 != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("article token: ", str3, " and ") : null, "entity token: ", str2), new Object[0], networkFailure != null ? networkFailure.error : null);
                    return new ArticlesService$ArticleResult.Failure(BundleKt.isRetryable((ApiResult.Failure) apiResult));
                }
                AndroidMessage androidMessage = (AndroidMessage) ((ApiResult.Success) apiResult).response;
                if (androidMessage instanceof GetSupportArticleForTransactionResponse) {
                    GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) androidMessage;
                    SupportArticle supportArticle = getSupportArticleForTransactionResponse.article;
                    pair = new Pair(supportArticle != null ? toArticle(supportArticle) : null, getSupportArticleForTransactionResponse.stylesheet_url);
                } else {
                    if (!(androidMessage instanceof GetSupportArticleResponse)) {
                        a$$ExternalSyntheticBUOutline0.m$3("GetSupportArticleForTransactionResponse or GetSupportArticleResponse expected");
                        return null;
                    }
                    GetSupportArticleResponse getSupportArticleResponse = (GetSupportArticleResponse) androidMessage;
                    SupportArticle supportArticle2 = getSupportArticleResponse.article;
                    pair = new Pair(supportArticle2 != null ? toArticle(supportArticle2) : null, getSupportArticleResponse.stylesheet_url);
                }
                Article article = (Article) pair.first;
                String str4 = (String) pair.second;
                realArticlesService$getArticleForTransaction$1.L$1 = null;
                realArticlesService$getArticleForTransaction$1.L$2 = null;
                realArticlesService$getArticleForTransaction$1.label = 3;
                Object handleSuccess = handleSuccess(article, str4, str2, realArticlesService$getArticleForTransaction$1);
                return handleSuccess == obj2 ? obj2 : handleSuccess;
            }
        }
        realArticlesService$getArticleForTransaction$1 = new RealArticlesService$getArticleForTransaction$1(this, continuationImpl);
        Object obj3 = realArticlesService$getArticleForTransaction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realArticlesService$getArticleForTransaction$1.label;
        if (i != 0) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSuccess(Article article, String str, String str2, ContinuationImpl continuationImpl) {
        RealArticlesService$handleSuccess$1 realArticlesService$handleSuccess$1;
        int i;
        CssResult cssResult;
        if (continuationImpl instanceof RealArticlesService$handleSuccess$1) {
            realArticlesService$handleSuccess$1 = (RealArticlesService$handleSuccess$1) continuationImpl;
            int i2 = realArticlesService$handleSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realArticlesService$handleSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realArticlesService$handleSuccess$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realArticlesService$handleSuccess$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (article == null) {
                        Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Null article for token: ", str2), new Object[0]);
                        return new ArticlesService$ArticleResult.Failure(false);
                    }
                    if (str == null) {
                        str = "";
                    }
                    realArticlesService$handleSuccess$1.L$0 = article;
                    realArticlesService$handleSuccess$1.label = 1;
                    obj = getArticleCss(str, realArticlesService$handleSuccess$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    article = realArticlesService$handleSuccess$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                cssResult = (CssResult) obj;
                if (!(cssResult instanceof CssResult.Success)) {
                    return new ArticlesService$ArticleResult.Success(article, getFinalHtml(article, ((CssResult.Success) cssResult).getCss()));
                }
                if (cssResult instanceof CssResult.Failure) {
                    return new ArticlesService$ArticleResult.Failure(((CssResult.Failure) cssResult).isRetryable());
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realArticlesService$handleSuccess$1 = new RealArticlesService$handleSuccess$1(this, continuationImpl);
        Object obj3 = realArticlesService$handleSuccess$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realArticlesService$handleSuccess$1.label;
        if (i != 0) {
        }
        cssResult = (CssResult) obj3;
        if (!(cssResult instanceof CssResult.Success)) {
        }
    }
}
