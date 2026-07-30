package com.facebook.appevents.ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.a;
import defpackage.bs1;
import defpackage.k4;
import defpackage.lv;
import defpackage.m;
import defpackage.o31;
import defpackage.pv;
import defpackage.qv;
import defpackage.rv;
import defpackage.tp2;
import defpackage.up2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ModelManager {
    private static final String ASSET_URI_KEY = "asset_uri";
    private static final String CACHE_KEY_MODELS = "models";
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    public static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final String MTML_USE_CASE = "MTML";
    private static final String RULES_URI_KEY = "rules_uri";
    private static final String THRESHOLD_KEY = "thresholds";
    private static final String USE_CASE_KEY = "use_case";
    private static final String VERSION_ID_KEY = "version_id";
    public static final ModelManager INSTANCE = new ModelManager();
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = qv.g("other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = qv.g(IntegrityManager.INTEGRITY_TYPE_NONE, IntegrityManager.INTEGRITY_TYPE_ADDRESS, IntegrityManager.INTEGRITY_TYPE_HEALTH);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Task.values().length];
                try {
                    iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String toKey() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            a.b();
            return null;
        }

        public final String toUseCase() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            a.b();
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            try {
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    TaskHandler build = TaskHandler.Companion.build(jSONObject.getJSONObject(keys.next()));
                    if (build != null) {
                        taskHandlers.put(build.getUseCase(), build);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(new m(15));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: all -> 0x002c, Exception -> 0x007b, TryCatch #2 {Exception -> 0x007b, all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001f, B:9:0x0026, B:10:0x0033, B:12:0x0041, B:14:0x0047, B:16:0x006f, B:20:0x004f, B:24:0x0058, B:25:0x002e), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void enable$lambda$0() {
        JSONObject jSONObject;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(MODEL_ASSERT_STORE, 0);
            String string = sharedPreferences.getString(CACHE_KEY_MODELS, null);
            if (string != null && string.length() != 0) {
                jSONObject = new JSONObject(string);
                long j = sharedPreferences.getLong(CACHE_KEY_REQUEST_TIMESTAMP, 0L);
                if (FeatureManager.isEnabled(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !INSTANCE.isValidTimestamp(j)) {
                    jSONObject = INSTANCE.fetchModels();
                    if (jSONObject != null) {
                        return;
                    } else {
                        sharedPreferences.edit().putString(CACHE_KEY_MODELS, jSONObject.toString()).putLong(CACHE_KEY_REQUEST_TIMESTAMP, System.currentTimeMillis()).apply();
                    }
                }
                ModelManager modelManager = INSTANCE;
                modelManager.addModels(jSONObject);
                modelManager.enableMTML();
                return;
            }
            jSONObject = new JSONObject();
            long j2 = sharedPreferences.getLong(CACHE_KEY_REQUEST_TIMESTAMP, 0L);
            if (FeatureManager.isEnabled(FeatureManager.Feature.ModelRequest)) {
            }
            jSONObject = INSTANCE.fetchModels();
            if (jSONObject != null) {
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final void enableMTML() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                TaskHandler value = entry.getValue();
                if (Intrinsics.b(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri = value.getAssetUri();
                    int max = Math.max(i, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                        arrayList.add(value.setOnPostExecute(new m(13)));
                    }
                    str = assetUri;
                    i = max;
                }
                if (Intrinsics.b(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = value.getAssetUri();
                    i = Math.max(i, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.setOnPostExecute(new m(14)));
                    }
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, str, null, i, null), arrayList);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableMTML$lambda$1() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            SuggestedEventsManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableMTML$lambda$2() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            IntegrityManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app/model_asset", null);
            newGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = newGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject == null) {
                return null;
            }
            return parseRawJsonObject(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final File getRuleFile(Task task) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final boolean isLocaleEnglish() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Locale resourceLocale = Utility.getResourceLocale();
                if (resourceLocale == null) {
                    return true;
                }
                String language = resourceLocale.getLanguage();
                language.getClass();
                if (up2.q(language, "en")) {
                    return true;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }

    private final boolean isValidTimestamp(long j) {
        if (CrashShieldHandler.isObjectCrashing(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < 259200000;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    string.getClass();
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final JSONObject parseRawJsonObject(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(VERSION_ID_KEY, jSONObject3.getString(VERSION_ID_KEY));
                    jSONObject4.put(USE_CASE_KEY, jSONObject3.getString(USE_CASE_KEY));
                    jSONObject4.put(THRESHOLD_KEY, jSONObject3.getJSONArray(THRESHOLD_KEY));
                    jSONObject4.put(ASSET_URI_KEY, jSONObject3.getString(ASSET_URI_KEY));
                    if (jSONObject3.has(RULES_URI_KEY)) {
                        jSONObject4.put(RULES_URI_KEY, jSONObject3.getString(RULES_URI_KEY));
                    }
                    jSONObject2.put(jSONObject3.getString(USE_CASE_KEY), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final String[] predict(Task task, float[][] fArr, String[] strArr) {
        Model model;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            task.getClass();
            fArr.getClass();
            strArr.getClass();
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null && (model = taskHandler.getModel()) != null) {
                float[] thresholds = taskHandler.getThresholds();
                int length = strArr.length;
                int length2 = fArr[0].length;
                MTensor mTensor = new MTensor(new int[]{length, length2});
                for (int i = 0; i < length; i++) {
                    System.arraycopy(fArr[i], 0, mTensor.getData(), i * length2, length2);
                }
                MTensor predictOnMTML = model.predictOnMTML(mTensor, strArr, task.toKey());
                if (predictOnMTML != null && thresholds != null && predictOnMTML.getData().length != 0 && thresholds.length != 0) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                    if (i2 == 1) {
                        return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                    }
                    if (i2 == 2) {
                        return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                    }
                    throw new bs1();
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            IntRange f = d.f(0, shape);
            ArrayList arrayList = new ArrayList(rv.l(f, 10));
            Iterator<Integer> it = f.iterator();
            while (it.hasNext()) {
                int nextInt = ((o31) it).nextInt();
                String str = IntegrityManager.INTEGRITY_TYPE_NONE;
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            IntRange f = d.f(0, shape);
            ArrayList arrayList = new ArrayList(rv.l(f, 10));
            Iterator<Integer> it = f.iterator();
            while (it.hasNext()) {
                int nextInt = ((o31) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= fArr[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class TaskHandler {
        public static final Companion Companion = new Companion(null);
        private String assetUri;
        private Model model;
        private Runnable onPostExecute;
        private File ruleFile;
        private String ruleUri;
        private float[] thresholds;
        private String useCase;
        private int versionId;

        public TaskHandler(String str, String str2, String str3, int i, float[] fArr) {
            str.getClass();
            str2.getClass();
            this.useCase = str;
            this.assetUri = str2;
            this.ruleUri = str3;
            this.versionId = i;
            this.thresholds = fArr;
        }

        public final String getAssetUri() {
            return this.assetUri;
        }

        public final Model getModel() {
            return this.model;
        }

        public final File getRuleFile() {
            return this.ruleFile;
        }

        public final String getRuleUri() {
            return this.ruleUri;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final String getUseCase() {
            return this.useCase;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setAssetUri(String str) {
            str.getClass();
            this.assetUri = str;
        }

        public final void setModel(Model model) {
            this.model = model;
        }

        public final TaskHandler setOnPostExecute(Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        public final void setRuleFile(File file) {
            this.ruleFile = file;
        }

        public final void setRuleUri(String str) {
            this.ruleUri = str;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final void setUseCase(String str) {
            str.getClass();
            this.useCase = str;
        }

        public final void setVersionId(int i) {
            this.versionId = i;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void deleteOldFiles(String str, int i) {
                File[] listFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir == null || (listFiles = mlDir.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i;
                for (File file : listFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (tp2.o(name, str, false) && !tp2.o(name, str2, false)) {
                        file.delete();
                    }
                }
            }

            private final void download(String str, String str2, FileDownloadTask.Callback callback) {
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void execute$lambda$1(List list, File file) {
                list.getClass();
                file.getClass();
                Model build = Model.Companion.build(file);
                if (build != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TaskHandler taskHandler = (TaskHandler) it.next();
                        TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new lv(3, taskHandler, build));
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void execute$lambda$1$lambda$0(TaskHandler taskHandler, Model model, File file) {
                taskHandler.getClass();
                file.getClass();
                taskHandler.setModel(model);
                taskHandler.setRuleFile(file);
                Runnable runnable = taskHandler.onPostExecute;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final TaskHandler build(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString(ModelManager.USE_CASE_KEY);
                    String string2 = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                    String optString = jSONObject.optString(ModelManager.RULES_URI_KEY, null);
                    int i = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                    float[] access$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                    string.getClass();
                    string2.getClass();
                    return new TaskHandler(string, string2, optString, i, access$parseJsonArray);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(TaskHandler taskHandler, List<TaskHandler> list) {
                taskHandler.getClass();
                list.getClass();
                deleteOldFiles(taskHandler.getUseCase(), taskHandler.getVersionId());
                download(taskHandler.getAssetUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId(), new k4(10, list));
            }

            private Companion() {
            }

            public final void execute(TaskHandler taskHandler) {
                taskHandler.getClass();
                execute(taskHandler, pv.c(taskHandler));
            }
        }
    }
}
