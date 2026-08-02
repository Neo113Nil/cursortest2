package io.flutter.embedding.engine.systemchannels;

import E.AbstractC0005f;
import android.os.Build;
import android.os.Bundle;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodHandler;
    private TextInputMethodHandler textInputMethodHandler;

    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final Autofill autofill;
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final Configuration[] fields;
        public final Locale[] hintLocales;
        public final Integer inputAction;
        public final InputType inputType;
        public final boolean obscureText;
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(String str, String[] strArr, String str2, TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            public static Autofill fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    strArr[i4] = translateAutofillHint(jSONArray.getString(i4));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String translateAutofillHint(String str) {
                char c4 = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.getClass();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c4 = '\t';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c4 = '\n';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c4 = 11;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c4 = '\f';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c4 = '\r';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c4 = 14;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c4 = 15;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c4 = 16;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c4 = 17;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c4 = 18;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c4 = 19;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c4 = 20;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c4 = 21;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c4 = 22;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c4 = 23;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c4 = 24;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c4 = 25;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 798554127:
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c4 = 27;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c4 = 28;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c4 = 29;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c4 = 30;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c4 = 31;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c4 = ' ';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c4 = '!';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c4 = '\"';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c4 = '#';
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                }
                return str;
            }
        }

        public Configuration(boolean z, boolean z4, boolean z5, boolean z6, boolean z7, TextCapitalization textCapitalization, InputType inputType, Integer num, String str, Autofill autofill, String[] strArr, Configuration[] configurationArr, Locale[] localeArr) {
            this.obscureText = z;
            this.autocorrect = z4;
            this.enableSuggestions = z5;
            this.enableIMEPersonalizedLearning = z6;
            this.enableDeltaModel = z7;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
            this.hintLocales = localeArr;
        }

        public static Configuration fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            Locale[] localeArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i4 = 0; i4 < length; i4++) {
                    configurationArr2[i4] = fromJson(jSONArray.getJSONObject(i4));
                }
                configurationArr = configurationArr2;
            }
            Integer inputActionFromTextInputAction = inputActionFromTextInputAction(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    arrayList.add(jSONArray2.optString(i5));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                Locale[] localeArr2 = new Locale[jSONArray3.length()];
                for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                    localeArr2[i6] = Locale.forLanguageTag(jSONArray3.optString(i6));
                }
                localeArr = localeArr2;
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), inputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr, localeArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x007a, code lost:
        
            if (r11.equals("TextInputAction.unspecified") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static Integer inputActionFromTextInputAction(String str) {
            char c4 = 0;
            str.getClass();
            switch (str.hashCode()) {
                case -810971940:
                    break;
                case -737377923:
                    if (str.equals("TextInputAction.done")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -737089298:
                    if (str.equals("TextInputAction.next")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -737080013:
                    if (str.equals("TextInputAction.none")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -736940669:
                    if (str.equals("TextInputAction.send")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 469250275:
                    if (str.equals("TextInputAction.search")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1241689507:
                    if (str.equals("TextInputAction.go")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1539450297:
                    if (str.equals("TextInputAction.newline")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2110497650:
                    if (str.equals("TextInputAction.previous")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return 0;
                case 1:
                    return 6;
                case 2:
                    return 5;
                case 3:
                case 7:
                    return 1;
                case 4:
                    return 4;
                case 5:
                    return 3;
                case 6:
                    return 2;
                case '\b':
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final TextInputType type;

        public InputType(TextInputType textInputType, boolean z, boolean z4) {
            this.type = textInputType;
            this.isSigned = z;
            this.isDecimal = z4;
        }

        public static InputType fromJson(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");

        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such TextCapitalization: ", str));
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public TextEditState(String str, int i4, int i5, int i6, int i7) throws IndexOutOfBoundsException {
            if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i5 < 0)) {
                throw new IndexOutOfBoundsException(AbstractC0005f.l("invalid selection: (", i4, ", ", i5, ")"));
            }
            if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
                throw new IndexOutOfBoundsException(AbstractC0005f.l("invalid composing range: (", i6, ", ", i7, ")"));
            }
            if (i7 > str.length()) {
                throw new IndexOutOfBoundsException(AbstractC0005f.j(i6, "invalid composing start: "));
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException(AbstractC0005f.j(i4, "invalid selection start: "));
            }
            if (i5 > str.length()) {
                throw new IndexOutOfBoundsException(AbstractC0005f.j(i5, "invalid selection end: "));
            }
            this.text = str;
            this.selectionStart = i4;
            this.selectionEnd = i5;
            this.composingStart = i6;
            this.composingEnd = i7;
        }

        public static TextEditState fromJson(JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i4 = this.composingStart;
            return i4 >= 0 && this.composingEnd > i4;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(String str, Bundle bundle);

        void setClient(int i4, Configuration configuration);

        void setEditableSizeAndTransform(double d4, double d5, double[] dArr);

        void setEditingState(TextEditState textEditState);

        void setPlatformViewClient(int i4, boolean z);

        void show();
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");

        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException(AbstractC0005f.n("No such TextInputType: ", str));
        }
    }

    public TextInputChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                Object obj;
                int i4;
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                obj = methodCall.arguments;
                Log.v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            break;
                        } catch (JSONException e4) {
                            result.error("error", e4.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            break;
                        } catch (JSONException e5) {
                            result.error("error", e5.getMessage(), null);
                            return;
                        }
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e6) {
                            result.error("error", e6.getMessage(), null);
                            return;
                        }
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            break;
                        } catch (JSONException e7) {
                            result.error("error", e7.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d4 = jSONObject3.getDouble("width");
                            double d5 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (i4 = 0; i4 < 16; i4++) {
                                dArr[i4] = jSONArray2.getDouble(i4);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d4, d5, dArr);
                            result.success(null);
                            break;
                        } catch (JSONException e8) {
                            result.error("error", e8.getMessage(), null);
                            return;
                        }
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            TextEditingDelta textEditingDelta = arrayList.get(i4);
            i4++;
            jSONArray.put(textEditingDelta.toJSON());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i4, int i5, int i6, int i7) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        AbstractC0005f.v(i4, hashMap, "selectionBase", i5, "selectionExtent");
        AbstractC0005f.v(i6, hashMap, "composingBase", i7, "composingExtent");
        return hashMap;
    }

    public void commitContent(int i4, Map<String, Object> map) {
        Log.v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.commitContent", map));
    }

    public void done(int i4) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"));
    }

    public void go(int i4) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"));
    }

    public void newline(int i4) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"));
    }

    public void next(int i4) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i4, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i4), hashMap));
    }

    public void previous(int i4) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i4) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"));
    }

    public void send(int i4) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i4) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i4, String str, int i5, int i6, int i7, int i8) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i5 + "\nSelection end: " + i6 + "\nComposing start: " + i7 + "\nComposing end: " + i8);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i4), createEditingStateJSON(str, i5, i6, i7, i8)));
    }

    public void updateEditingStateWithDeltas(int i4, ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i4), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i4, HashMap<String, TextEditState> hashMap) {
        Log.v(TAG, "Sending message to update editing state for " + hashMap.size() + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : hashMap.entrySet()) {
            TextEditState value = entry.getValue();
            hashMap2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), hashMap2));
    }
}
