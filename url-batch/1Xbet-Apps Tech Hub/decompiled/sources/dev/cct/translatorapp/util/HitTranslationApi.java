package dev.cct.translatorapp.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.net.HttpHeaders;
import io.ktor.http.LinkHeader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: HitTranslationApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002J\"\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J,\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ \u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u001e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ\u0010\u0010\"\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Ldev/cct/translatorapp/util/HitTranslationApi;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "language", "", "translationComplete", "Ldev/cct/translatorapp/util/HitTranslationApi$TranslationComplete;", "apiCall", ImagesContract.URL, "isAuto", "", "callUrlAndParseResult", "word", "outputLanguageCode", "inputLanguageCode", "clearString", "execute", LinkHeader.Parameters.Type, "inputText", "outputCode", "inputCode", "forResult", "", "result", "parseResult", "inputJson", "context", "Landroid/content/Context;", "runTranslation", "text", "setTranslationComplete", "TranslationComplete", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HitTranslationApi {
    private final Activity activity;
    private String language;
    private TranslationComplete translationComplete;

    /* compiled from: HitTranslationApi.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Ldev/cct/translatorapp/util/HitTranslationApi$TranslationComplete;", "", "translationCompleted", "", "translation", "", "language", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TranslationComplete {
        void translationCompleted(String translation, String language);
    }

    public HitTranslationApi(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.language = "";
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final void setTranslationComplete(TranslationComplete translationComplete) {
        this.translationComplete = translationComplete;
    }

    public final void runTranslation(String text, String outputCode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(outputCode, "outputCode");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new HitTranslationApi$runTranslation$1(this, text, outputCode, null), 3, null);
    }

    public final void runTranslation(String text, String outputCode, String inputCode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(outputCode, "outputCode");
        Intrinsics.checkNotNullParameter(inputCode, "inputCode");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new HitTranslationApi$runTranslation$2(this, text, outputCode, inputCode, null), 3, null);
    }

    public final void forResult(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new HitTranslationApi$forResult$1(this, result, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String execute(String type, String inputText, String outputCode, String inputCode) {
        if (Intrinsics.areEqual(type, DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            return callUrlAndParseResult(inputText, outputCode);
        }
        Intrinsics.checkNotNull(inputCode);
        return callUrlAndParseResult(inputText, outputCode, inputCode);
    }

    private final String clearString(String word) {
        String str = word;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "&", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "\n", false, 2, (Object) null)) {
            return word;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String replace$default = StringsKt.replace$default(str.subSequence(i, length + 1).toString(), "&", "^~^", false, 4, (Object) null);
        int length2 = replace$default.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.compare((int) replace$default.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                }
                length2--;
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        String replace$default2 = StringsKt.replace$default(replace$default.subSequence(i2, length2 + 1).toString(), "%", "!^", false, 4, (Object) null);
        int length3 = replace$default2.length() - 1;
        int i3 = 0;
        boolean z5 = false;
        while (i3 <= length3) {
            boolean z6 = Intrinsics.compare((int) replace$default2.charAt(!z5 ? i3 : length3), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length3--;
            } else if (z6) {
                i3++;
            } else {
                z5 = true;
            }
        }
        String replace$default3 = StringsKt.replace$default(replace$default2.subSequence(i3, length3 + 1).toString(), "\n", "~~", false, 4, (Object) null);
        int length4 = replace$default3.length() - 1;
        int i4 = 0;
        boolean z7 = false;
        while (i4 <= length4) {
            boolean z8 = Intrinsics.compare((int) replace$default3.charAt(!z7 ? i4 : length4), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                }
                length4--;
            } else if (z8) {
                i4++;
            } else {
                z7 = true;
            }
        }
        String replace$default4 = StringsKt.replace$default(replace$default3.subSequence(i4, length4 + 1).toString(), "-", "", false, 4, (Object) null);
        int length5 = replace$default4.length() - 1;
        int i5 = 0;
        boolean z9 = false;
        while (i5 <= length5) {
            boolean z10 = Intrinsics.compare((int) replace$default4.charAt(!z9 ? i5 : length5), 32) <= 0;
            if (z9) {
                if (!z10) {
                    break;
                }
                length5--;
            } else if (z10) {
                i5++;
            } else {
                z9 = true;
            }
        }
        return StringsKt.replace$default(replace$default4.subSequence(i5, length5 + 1).toString(), "#", "", false, 4, (Object) null);
    }

    private final String apiCall(String url, boolean isAuto) {
        try {
            URLConnection openConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "Mozilla/5.0");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "response.toString()");
            String parseResult = parseResult(stringBuffer2, this.activity, isAuto);
            return parseResult.length() == 0 ? "Fail to Translate" : parseResult;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "Oops. There was an error";
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.d("apiCall", String.valueOf(e2.getCause()));
            return "There seems to be a network issue!";
        }
    }

    private final String callUrlAndParseResult(String word, String outputLanguageCode) {
        String clearString = clearString(word);
        int length = clearString.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) clearString.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String str = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=auto&tl=" + outputLanguageCode + "&dt=t&q=" + StringsKt.replace$default(clearString.subSequence(i, length + 1).toString(), " ", "%20", false, 4, (Object) null) + "&ie=UTF-8&oe=UTF-8";
        Log.e("for_translation", str);
        return apiCall(str, true);
    }

    private final String callUrlAndParseResult(String word, String outputLanguageCode, String inputLanguageCode) {
        String clearString = clearString(word);
        int length = clearString.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) clearString.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String str = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + inputLanguageCode + "&tl=" + outputLanguageCode + "&dt=t&q=" + StringsKt.replace$default(clearString.subSequence(i, length + 1).toString(), " ", "%20", false, 4, (Object) null) + "&ie=UTF-8&oe=UTF-8";
        Log.d("uri", str);
        return apiCall(str, false);
    }

    private final String parseResult(String inputJson, final Context context, boolean isAuto) {
        String str;
        Log.e("result", inputJson);
        StringBuilder sb = new StringBuilder();
        try {
            JSONArray jSONArray = new JSONArray(inputJson);
            Object obj = jSONArray.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            if (isAuto) {
                Object obj2 = jSONArray.get(jSONArray.length() - 1);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONArray");
                Object obj3 = ((JSONArray) obj2).get(0);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONArray");
                this.language = ((JSONArray) obj3).get(0).toString();
            }
            Log.d("Language_", this.language);
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                Object obj4 = jSONArray2.get(i);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONArray");
                sb.append(((JSONArray) obj4).get(0).toString());
            }
            str = sb.toString();
            Intrinsics.checkNotNullExpressionValue(str, "tempData.toString()");
        } catch (JSONException e) {
            Log.e("error_", e.toString());
            str = "";
            return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "~~ ", "\n", false, 4, (Object) null), "~ ~ ", "\n", false, 4, (Object) null), "~ ~", "\n", false, 4, (Object) null), "~~", "\n", false, 4, (Object) null), " !^ ", "%", false, 4, (Object) null), " ! ^ ", "%", false, 4, (Object) null), "! ^", "%", false, 4, (Object) null), " ^ ~ ^ ", "&", false, 4, (Object) null), "^ ~ ^", "&", false, 4, (Object) null), " ^~^ ", "&", false, 4, (Object) null), "^~^", "&", false, 4, (Object) null);
        } catch (Exception e2) {
            Log.e("error_s", e2.toString());
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new Runnable() { // from class: dev.cct.translatorapp.util.HitTranslationApi$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HitTranslationApi.parseResult$lambda$8(context);
                }
            });
            str = "";
            return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "~~ ", "\n", false, 4, (Object) null), "~ ~ ", "\n", false, 4, (Object) null), "~ ~", "\n", false, 4, (Object) null), "~~", "\n", false, 4, (Object) null), " !^ ", "%", false, 4, (Object) null), " ! ^ ", "%", false, 4, (Object) null), "! ^", "%", false, 4, (Object) null), " ^ ~ ^ ", "&", false, 4, (Object) null), "^ ~ ^", "&", false, 4, (Object) null), " ^~^ ", "&", false, 4, (Object) null), "^~^", "&", false, 4, (Object) null);
        }
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "~~ ", "\n", false, 4, (Object) null), "~ ~ ", "\n", false, 4, (Object) null), "~ ~", "\n", false, 4, (Object) null), "~~", "\n", false, 4, (Object) null), " !^ ", "%", false, 4, (Object) null), " ! ^ ", "%", false, 4, (Object) null), "! ^", "%", false, 4, (Object) null), " ^ ~ ^ ", "&", false, 4, (Object) null), "^ ~ ^", "&", false, 4, (Object) null), " ^~^ ", "&", false, 4, (Object) null), "^~^", "&", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void parseResult$lambda$8(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Toast.makeText(context, "Something went wrong", 0).show();
    }
}
