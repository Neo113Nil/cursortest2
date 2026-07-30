package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import com.blankj.utilcode.util.c1;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r {
    public static final int A = 7;
    private static final String ARGS = "args";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_CORNER = "└";
    public static final int D = 3;
    public static final int E = 6;
    private static final int FILE = 16;
    public static final int I = 4;
    private static final int JSON = 32;
    private static final String LEFT_BORDER = "│ ";
    private static final int MAX_LEN = 1100;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String MIDDLE_CORNER = "├";
    private static final String MIDDLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String NOTHING = "log nothing";
    private static final String NULL = "null";
    private static final String PLACEHOLDER = " ";
    private static final String SIDE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String TOP_CORNER = "┌";
    public static final int V = 2;
    public static final int W = 5;
    private static final int XML = 48;
    private static SimpleDateFormat simpleDateFormat;
    private static final char[] T = {'V', 'D', 'I', 'W', 'E', 'A'};
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static final e CONFIG = new e(null);
    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    private static final SimpleArrayMap<Class, g> I_FORMATTER_MAP = new SimpleArrayMap<>();

    static class a implements Runnable {
        final /* synthetic */ String val$body;
        final /* synthetic */ k val$tagHead;
        final /* synthetic */ int val$type_low;

        a(int i8, k kVar, String str) {
            this.val$type_low = i8;
            this.val$tagHead = kVar;
            this.val$body = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.print2File(this.val$type_low, this.val$tagHead.tag, this.val$tagHead.fileHead + this.val$body);
        }
    }

    static class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return r.isMatchLogFileName(str);
        }
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return r.isMatchLogFileName(str);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ File val$aFile;

        d(File file) {
            this.val$aFile = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.val$aFile.delete()) {
                return;
            }
            Log.e("LogUtils", "delete " + this.val$aFile + " failed!");
        }
    }

    public static final class e {
        private int mConsoleFilter;
        private String mDefaultDir;
        private String mDir;
        private String mFileExtension;
        private int mFileFilter;
        private c1.a mFileHead;
        private String mFilePrefix;
        private f mFileWriter;
        private String mGlobalTag;
        private boolean mLog2ConsoleSwitch;
        private boolean mLog2FileSwitch;
        private boolean mLogBorderSwitch;
        private boolean mLogHeadSwitch;
        private boolean mLogSwitch;
        private i mOnConsoleOutputListener;
        private j mOnFileOutputListener;
        private String mProcessName;
        private int mSaveDays;
        private boolean mSingleTagSwitch;
        private int mStackDeep;
        private int mStackOffset;
        private boolean mTagIsSpace;

        /* synthetic */ e(a aVar) {
            this();
        }

        static /* synthetic */ i access$600(e eVar) {
            eVar.getClass();
            return null;
        }

        static /* synthetic */ f access$800(e eVar) {
            eVar.getClass();
            return null;
        }

        static /* synthetic */ j access$900(e eVar) {
            eVar.getClass();
            return null;
        }

        public final e addFileExtraHead(Map<String, String> map) {
            this.mFileHead.append(map);
            return this;
        }

        public final <T> e addFormatter(g gVar) {
            if (gVar != null) {
                r.I_FORMATTER_MAP.put(r.getTypeClassFromParadigm(gVar), gVar);
            }
            return this;
        }

        public final char getConsoleFilter() {
            return r.T[this.mConsoleFilter - 2];
        }

        public final String getDefaultDir() {
            return this.mDefaultDir;
        }

        public final String getDir() {
            String str = this.mDir;
            return str == null ? this.mDefaultDir : str;
        }

        public final String getFileExtension() {
            return this.mFileExtension;
        }

        public final char getFileFilter() {
            return r.T[this.mFileFilter - 2];
        }

        public final String getFilePrefix() {
            return this.mFilePrefix;
        }

        public final String getGlobalTag() {
            return c1.isSpace(this.mGlobalTag) ? "" : this.mGlobalTag;
        }

        public final String getProcessName() {
            String str = this.mProcessName;
            return str == null ? "" : str.replace(":", "_");
        }

        public final int getSaveDays() {
            return this.mSaveDays;
        }

        public final int getStackDeep() {
            return this.mStackDeep;
        }

        public final int getStackOffset() {
            return this.mStackOffset;
        }

        public final boolean haveSetOnConsoleOutputListener() {
            return false;
        }

        public final boolean haveSetOnFileOutputListener() {
            return false;
        }

        public final boolean isLog2ConsoleSwitch() {
            return this.mLog2ConsoleSwitch;
        }

        public final boolean isLog2FileSwitch() {
            return this.mLog2FileSwitch;
        }

        public final boolean isLogBorderSwitch() {
            return this.mLogBorderSwitch;
        }

        public final boolean isLogHeadSwitch() {
            return this.mLogHeadSwitch;
        }

        public final boolean isLogSwitch() {
            return this.mLogSwitch;
        }

        public final boolean isSingleTagSwitch() {
            return this.mSingleTagSwitch;
        }

        public final e setBorderSwitch(boolean z7) {
            this.mLogBorderSwitch = z7;
            return this;
        }

        public final e setConsoleFilter(int i8) {
            this.mConsoleFilter = i8;
            return this;
        }

        public final e setConsoleSwitch(boolean z7) {
            this.mLog2ConsoleSwitch = z7;
            return this;
        }

        public final e setDir(String str) {
            if (c1.isSpace(str)) {
                this.mDir = null;
            } else {
                if (!str.endsWith(r.FILE_SEP)) {
                    str = str + r.FILE_SEP;
                }
                this.mDir = str;
            }
            return this;
        }

        public final e setFileExtension(String str) {
            if (c1.isSpace(str)) {
                this.mFileExtension = ".txt";
            } else if (str.startsWith(".")) {
                this.mFileExtension = str;
            } else {
                this.mFileExtension = "." + str;
            }
            return this;
        }

        public final e setFileFilter(int i8) {
            this.mFileFilter = i8;
            return this;
        }

        public final e setFilePrefix(String str) {
            if (c1.isSpace(str)) {
                this.mFilePrefix = "util";
            } else {
                this.mFilePrefix = str;
            }
            return this;
        }

        public final e setFileWriter(f fVar) {
            return this;
        }

        public final e setGlobalTag(String str) {
            if (c1.isSpace(str)) {
                this.mGlobalTag = "";
                this.mTagIsSpace = true;
            } else {
                this.mGlobalTag = str;
                this.mTagIsSpace = false;
            }
            return this;
        }

        public final e setLog2FileSwitch(boolean z7) {
            this.mLog2FileSwitch = z7;
            return this;
        }

        public final e setLogHeadSwitch(boolean z7) {
            this.mLogHeadSwitch = z7;
            return this;
        }

        public final e setLogSwitch(boolean z7) {
            this.mLogSwitch = z7;
            return this;
        }

        public final e setOnConsoleOutputListener(i iVar) {
            return this;
        }

        public final e setOnFileOutputListener(j jVar) {
            return this;
        }

        public final e setSaveDays(@IntRange(from = 1) int i8) {
            this.mSaveDays = i8;
            return this;
        }

        public final e setSingleTagSwitch(boolean z7) {
            this.mSingleTagSwitch = z7;
            return this;
        }

        public final e setStackDeep(@IntRange(from = 1) int i8) {
            this.mStackDeep = i8;
            return this;
        }

        public final e setStackOffset(@IntRange(from = 0) int i8) {
            this.mStackOffset = i8;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(getProcessName());
            sb.append(r.LINE_SEP);
            sb.append("logSwitch: ");
            sb.append(isLogSwitch());
            sb.append(r.LINE_SEP);
            sb.append("consoleSwitch: ");
            sb.append(isLog2ConsoleSwitch());
            sb.append(r.LINE_SEP);
            sb.append("tag: ");
            sb.append(getGlobalTag().equals("") ? "null" : getGlobalTag());
            sb.append(r.LINE_SEP);
            sb.append("headSwitch: ");
            sb.append(isLogHeadSwitch());
            sb.append(r.LINE_SEP);
            sb.append("fileSwitch: ");
            sb.append(isLog2FileSwitch());
            sb.append(r.LINE_SEP);
            sb.append("dir: ");
            sb.append(getDir());
            sb.append(r.LINE_SEP);
            sb.append("filePrefix: ");
            sb.append(getFilePrefix());
            sb.append(r.LINE_SEP);
            sb.append("borderSwitch: ");
            sb.append(isLogBorderSwitch());
            sb.append(r.LINE_SEP);
            sb.append("singleTagSwitch: ");
            sb.append(isSingleTagSwitch());
            sb.append(r.LINE_SEP);
            sb.append("consoleFilter: ");
            sb.append(getConsoleFilter());
            sb.append(r.LINE_SEP);
            sb.append("fileFilter: ");
            sb.append(getFileFilter());
            sb.append(r.LINE_SEP);
            sb.append("stackDeep: ");
            sb.append(getStackDeep());
            sb.append(r.LINE_SEP);
            sb.append("stackOffset: ");
            sb.append(getStackOffset());
            sb.append(r.LINE_SEP);
            sb.append("saveDays: ");
            sb.append(getSaveDays());
            sb.append(r.LINE_SEP);
            sb.append("formatter: ");
            sb.append(r.I_FORMATTER_MAP);
            sb.append(r.LINE_SEP);
            sb.append("fileWriter: ");
            sb.append((Object) null);
            sb.append(r.LINE_SEP);
            sb.append("onConsoleOutputListener: ");
            sb.append((Object) null);
            sb.append(r.LINE_SEP);
            sb.append("onFileOutputListener: ");
            sb.append((Object) null);
            sb.append(r.LINE_SEP);
            sb.append("fileExtraHeader: ");
            sb.append(this.mFileHead.getAppended());
            return sb.toString();
        }

        private e() {
            this.mFilePrefix = "util";
            this.mFileExtension = ".txt";
            this.mLogSwitch = true;
            this.mLog2ConsoleSwitch = true;
            this.mGlobalTag = "";
            this.mTagIsSpace = true;
            this.mLogHeadSwitch = true;
            this.mLog2FileSwitch = false;
            this.mLogBorderSwitch = true;
            this.mSingleTagSwitch = true;
            this.mConsoleFilter = 2;
            this.mFileFilter = 2;
            this.mStackDeep = 1;
            this.mStackOffset = 0;
            this.mSaveDays = -1;
            this.mProcessName = c1.getCurrentProcessName();
            this.mFileHead = new c1.a("Log");
            if (!c1.isSDCardEnableByEnvironment() || z0.getApp().getExternalFilesDir(null) == null) {
                this.mDefaultDir = z0.getApp().getFilesDir() + r.FILE_SEP + "log" + r.FILE_SEP;
                return;
            }
            this.mDefaultDir = z0.getApp().getExternalFilesDir(null) + r.FILE_SEP + "log" + r.FILE_SEP;
        }

        public final e addFileExtraHead(String str, String str2) {
            this.mFileHead.append(str, str2);
            return this;
        }

        public final e setDir(File file) {
            String str;
            if (file == null) {
                str = null;
            } else {
                str = file.getAbsolutePath() + r.FILE_SEP;
            }
            this.mDir = str;
            return this;
        }
    }

    public interface f {
    }

    public static abstract class g {
        public abstract String format(Object obj);
    }

    private static final class h {
        private h() {
        }

        private static String array2String(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        private static String bundle2String(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                if (obj instanceof Bundle) {
                    sb.append(obj == bundle ? "(this Bundle)" : bundle2String((Bundle) obj));
                } else {
                    sb.append(r.formatObject(obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        @RequiresApi(api = 16)
        private static void clipData2String(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb.append("NULL");
                sb.append("}");
            } else {
                sb.append("I:");
                sb.append(intent2String(intent));
                sb.append("}");
            }
        }

        private static String formatJson(String str) {
            try {
                int length = str.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = str.charAt(i8);
                    if (charAt == '{') {
                        return new JSONObject(str).toString(2);
                    }
                    if (charAt == '[') {
                        return new JSONArray(str).toString(2);
                    }
                    if (!Character.isWhitespace(charAt)) {
                        return str;
                    }
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            return str;
        }

        private static String formatXml(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                newTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + r.LINE_SEP);
            } catch (Exception e8) {
                e8.printStackTrace();
                return str;
            }
        }

        private static String intent2String(Intent intent) {
            boolean z7;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z8 = false;
            boolean z9 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z7 = false;
            } else {
                z7 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z9) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z9 = false;
                }
                sb.append("]");
                z7 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z7 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z7 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z7 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z7 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z7 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z7 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z7) {
                    sb.append(' ');
                }
                clipData2String(clipData, sb);
                z7 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z7) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(bundle2String(extras));
                sb.append('}');
            } else {
                z8 = z7;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z8) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : intent2String(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        private static String object2Json(Object obj) {
            if (obj instanceof CharSequence) {
                return c1.formatJson(obj.toString());
            }
            try {
                return c1.getGson4LogUtils().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        static String object2String(Object obj) {
            return object2String(obj, -1);
        }

        static String object2String(Object obj, int i8) {
            return obj.getClass().isArray() ? array2String(obj) : obj instanceof Throwable ? c1.getFullStackTrace((Throwable) obj) : obj instanceof Bundle ? bundle2String((Bundle) obj) : obj instanceof Intent ? intent2String((Intent) obj) : i8 == 32 ? object2Json(obj) : i8 == 48 ? formatXml(obj.toString()) : obj.toString();
        }
    }

    public interface i {
    }

    public interface j {
    }

    private static final class k {
        String[] consoleHead;
        String fileHead;
        String tag;

        k(String str, String[] strArr, String str2) {
            this.tag = str;
            this.consoleHead = strArr;
            this.fileHead = str2;
        }
    }

    private r() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(Object... objArr) {
        log(7, CONFIG.getGlobalTag(), objArr);
    }

    public static void aTag(String str, Object... objArr) {
        log(7, str, objArr);
    }

    private static boolean createOrExistsFile(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!c1.createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            deleteDueLogs(str, str2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                printDeviceInfo(str, str2);
            }
            return createNewFile;
        } catch (IOException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static void d(Object... objArr) {
        log(3, CONFIG.getGlobalTag(), objArr);
    }

    public static void dTag(String str, Object... objArr) {
        log(3, str, objArr);
    }

    private static void deleteDueLogs(String str, String str2) {
        File[] listFiles;
        if (CONFIG.getSaveDays() > 0 && (listFiles = new File(str).getParentFile().listFiles(new c())) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat2.parse(str2).getTime() - (r0.getSaveDays() * 86400000);
                for (File file : listFiles) {
                    String name = file.getName();
                    name.length();
                    if (simpleDateFormat2.parse(findDate(name)).getTime() <= time) {
                        EXECUTOR.execute(new d(file));
                    }
                }
            } catch (ParseException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static void e(Object... objArr) {
        log(6, CONFIG.getGlobalTag(), objArr);
    }

    public static void eTag(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public static void file(Object obj) {
        log(19, CONFIG.getGlobalTag(), obj);
    }

    private static String findDate(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    private static String formatObject(int i8, Object obj) {
        return obj == null ? "null" : i8 == 32 ? h.object2String(obj, 32) : i8 == 48 ? h.object2String(obj, 48) : formatObject(obj);
    }

    private static Class getClassFromObject(Object obj) {
        String obj2;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type type = genericInterfaces[0];
                while (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                obj2 = type.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                obj2 = genericSuperclass.toString();
            }
            if (obj2.startsWith("class ")) {
                obj2 = obj2.substring(6);
            } else if (obj2.startsWith("interface ")) {
                obj2 = obj2.substring(10);
            }
            try {
                return Class.forName(obj2);
            } catch (ClassNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return cls;
    }

    public static e getConfig() {
        return CONFIG;
    }

    public static String getCurrentLogFilePath() {
        return getCurrentLogFilePath(new Date());
    }

    private static String getFileName(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return className + cn.hutool.core.io.file.c.EXT_JAVA;
    }

    public static List<File> getLogFiles() {
        File file = new File(CONFIG.getDir());
        if (!file.exists()) {
            return new ArrayList();
        }
        File[] listFiles = file.listFiles(new b());
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, listFiles);
        return arrayList;
    }

    private static SimpleDateFormat getSdf() {
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Class getTypeClassFromParadigm(g gVar) {
        Type[] genericInterfaces = gVar.getClass().getGenericInterfaces();
        Type type = ((ParameterizedType) (genericInterfaces.length == 1 ? genericInterfaces[0] : gVar.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
        while (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        String obj = type.toString();
        if (obj.startsWith("class ")) {
            obj = obj.substring(6);
        } else if (obj.startsWith("interface ")) {
            obj = obj.substring(10);
        }
        try {
            return Class.forName(obj);
        } catch (ClassNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static void i(Object... objArr) {
        log(4, CONFIG.getGlobalTag(), objArr);
    }

    public static void iTag(String str, Object... objArr) {
        log(4, str, objArr);
    }

    private static void input2File(String str, String str2) {
        e eVar = CONFIG;
        e.access$800(eVar);
        c1.writeFileFromString(str, str2, true);
        e.access$900(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMatchLogFileName(String str) {
        return str.matches("^" + CONFIG.getFilePrefix() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    public static void json(Object obj) {
        log(35, CONFIG.getGlobalTag(), obj);
    }

    public static void log(int i8, String str, Object... objArr) {
        e eVar = CONFIG;
        if (eVar.isLogSwitch()) {
            int i9 = i8 & 15;
            int i10 = i8 & 240;
            if (eVar.isLog2ConsoleSwitch() || eVar.isLog2FileSwitch() || i10 == 16) {
                if (i9 >= eVar.mConsoleFilter || i9 >= eVar.mFileFilter) {
                    k processTagAndHead = processTagAndHead(str);
                    String processBody = processBody(i10, objArr);
                    if (eVar.isLog2ConsoleSwitch() && i10 != 16 && i9 >= eVar.mConsoleFilter) {
                        print2Console(i9, processTagAndHead.tag, processTagAndHead.consoleHead, processBody);
                    }
                    if ((eVar.isLog2FileSwitch() || i10 == 16) && i9 >= eVar.mFileFilter) {
                        EXECUTOR.execute(new a(i9, processTagAndHead, processBody));
                    }
                }
            }
        }
    }

    private static void print2Console(int i8, String str, String[] strArr, String str2) {
        if (CONFIG.isSingleTagSwitch()) {
            printSingleTagMsg(i8, str, processSingleTagMsg(i8, str, strArr, str2));
            return;
        }
        printBorder(i8, str, true);
        printHead(i8, str, strArr);
        printMsg(i8, str, str2);
        printBorder(i8, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print2File(int i8, String str, String str2) {
        Date date = new Date();
        String format = getSdf().format(date);
        String substring = format.substring(0, 10);
        String currentLogFilePath = getCurrentLogFilePath(date);
        if (!createOrExistsFile(currentLogFilePath, substring)) {
            Log.e("LogUtils", "create " + currentLogFilePath + " failed!");
            return;
        }
        input2File(currentLogFilePath, format.substring(11) + T[i8 - 2] + "/" + str + str2 + LINE_SEP);
    }

    private static void printBorder(int i8, String str, boolean z7) {
        if (CONFIG.isLogBorderSwitch()) {
            print2Console(i8, str, z7 ? TOP_BORDER : BOTTOM_BORDER);
        }
    }

    private static void printDeviceInfo(String str, String str2) {
        e eVar = CONFIG;
        eVar.mFileHead.addFirst("Date of Log", str2);
        input2File(str, eVar.mFileHead.toString());
    }

    private static void printHead(int i8, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (CONFIG.isLogBorderSwitch()) {
                    str2 = LEFT_BORDER + str2;
                }
                print2Console(i8, str, str2);
            }
            if (CONFIG.isLogBorderSwitch()) {
                print2Console(i8, str, MIDDLE_BORDER);
            }
        }
    }

    private static void printMsg(int i8, String str, String str2) {
        int length = str2.length();
        int i9 = length / 1100;
        if (i9 <= 0) {
            printSubMsg(i8, str, str2);
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i11 + 1100;
            printSubMsg(i8, str, str2.substring(i11, i12));
            i10++;
            i11 = i12;
        }
        if (i11 != length) {
            printSubMsg(i8, str, str2.substring(i11, length));
        }
    }

    private static void printSingleTagMsg(int i8, String str, String str2) {
        int length = str2.length();
        e eVar = CONFIG;
        int i9 = 1100;
        int i10 = eVar.isLogBorderSwitch() ? (length - 113) / 1100 : length / 1100;
        if (i10 <= 0) {
            print2Console(i8, str, str2);
            return;
        }
        int i11 = 1;
        if (!eVar.isLogBorderSwitch()) {
            print2Console(i8, str, str2.substring(0, 1100));
            while (i11 < i10) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(LINE_SEP);
                int i12 = i9 + 1100;
                sb.append(str2.substring(i9, i12));
                print2Console(i8, str, sb.toString());
                i11++;
                i9 = i12;
            }
            if (i9 != length) {
                print2Console(i8, str, " " + LINE_SEP + str2.substring(i9, length));
                return;
            }
            return;
        }
        print2Console(i8, str, str2.substring(0, 1100) + LINE_SEP + BOTTOM_BORDER);
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String str3 = LINE_SEP;
            sb2.append(str3);
            sb2.append(TOP_BORDER);
            sb2.append(str3);
            sb2.append(LEFT_BORDER);
            int i13 = i9 + 1100;
            sb2.append(str2.substring(i9, i13));
            sb2.append(str3);
            sb2.append(BOTTOM_BORDER);
            print2Console(i8, str, sb2.toString());
            i11++;
            i9 = i13;
        }
        if (i9 != length - 113) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" ");
            String str4 = LINE_SEP;
            sb3.append(str4);
            sb3.append(TOP_BORDER);
            sb3.append(str4);
            sb3.append(LEFT_BORDER);
            sb3.append(str2.substring(i9, length));
            print2Console(i8, str, sb3.toString());
        }
    }

    private static void printSubMsg(int i8, String str, String str2) {
        if (!CONFIG.isLogBorderSwitch()) {
            print2Console(i8, str, str2);
            return;
        }
        for (String str3 : str2.split(LINE_SEP)) {
            print2Console(i8, str, LEFT_BORDER + str3);
        }
    }

    private static String processBody(int i8, Object... objArr) {
        String str;
        if (objArr != null) {
            if (objArr.length == 1) {
                str = formatObject(i8, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    Object obj = objArr[i9];
                    sb.append(ARGS);
                    sb.append("[");
                    sb.append(i9);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(formatObject(obj));
                    sb.append(LINE_SEP);
                }
                str = sb.toString();
            }
        } else {
            str = "null";
        }
        return str.length() == 0 ? NOTHING : str;
    }

    private static String processSingleTagMsg(int i8, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        if (CONFIG.isLogBorderSwitch()) {
            sb.append(" ");
            String str3 = LINE_SEP;
            sb.append(str3);
            sb.append(TOP_BORDER);
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append(LEFT_BORDER);
                    sb.append(str4);
                    sb.append(LINE_SEP);
                }
                sb.append(MIDDLE_BORDER);
                sb.append(LINE_SEP);
            }
            String[] split = str2.split(LINE_SEP);
            int length = split.length;
            while (i9 < length) {
                String str5 = split[i9];
                sb.append(LEFT_BORDER);
                sb.append(str5);
                sb.append(LINE_SEP);
                i9++;
            }
            sb.append(BOTTOM_BORDER);
        } else {
            if (strArr != null) {
                sb.append(" ");
                sb.append(LINE_SEP);
                int length2 = strArr.length;
                while (i9 < length2) {
                    sb.append(strArr[i9]);
                    sb.append(LINE_SEP);
                    i9++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static k processTagAndHead(String str) {
        String str2;
        String str3;
        String str4;
        e eVar = CONFIG;
        if (eVar.mTagIsSpace || eVar.isLogHeadSwitch()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int stackOffset = eVar.getStackOffset() + 3;
            if (stackOffset >= stackTrace.length) {
                String fileName = getFileName(stackTrace[3]);
                if (eVar.mTagIsSpace && c1.isSpace(str)) {
                    int indexOf = fileName.indexOf(46);
                    str4 = indexOf == -1 ? fileName : fileName.substring(0, indexOf);
                } else {
                    str4 = str;
                }
                return new k(str4, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[stackOffset];
            String fileName2 = getFileName(stackTraceElement);
            if (eVar.mTagIsSpace && c1.isSpace(str)) {
                int indexOf2 = fileName2.indexOf(46);
                str2 = indexOf2 == -1 ? fileName2 : fileName2.substring(0, indexOf2);
            } else {
                str2 = str;
            }
            if (eVar.isLogHeadSwitch()) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), fileName2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str5 = " [" + formatter + "]: ";
                if (eVar.getStackDeep() <= 1) {
                    return new k(str2, new String[]{formatter}, str5);
                }
                int min = Math.min(eVar.getStackDeep(), stackTrace.length - stackOffset);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                int length = name.length() + 2;
                String formatter2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i8 = 1; i8 < min; i8++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i8 + stackOffset];
                    strArr[i8] = new Formatter().format("%s%s.%s(%s:%d)", formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), getFileName(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new k(str2, strArr, str5);
            }
            str3 = str2;
        } else {
            str3 = eVar.getGlobalTag();
        }
        return new k(str3, null, ": ");
    }

    public static void v(Object... objArr) {
        log(2, CONFIG.getGlobalTag(), objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    public static void w(Object... objArr) {
        log(5, CONFIG.getGlobalTag(), objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void xml(String str) {
        log(51, CONFIG.getGlobalTag(), str);
    }

    public static void file(int i8, Object obj) {
        log(i8 | 16, CONFIG.getGlobalTag(), obj);
    }

    private static String getCurrentLogFilePath(Date date) {
        String substring = getSdf().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        e eVar = CONFIG;
        sb.append(eVar.getDir());
        sb.append(eVar.getFilePrefix());
        sb.append("_");
        sb.append(substring);
        sb.append("_");
        sb.append(eVar.getProcessName());
        sb.append(eVar.getFileExtension());
        return sb.toString();
    }

    public static void json(int i8, Object obj) {
        log(i8 | 32, CONFIG.getGlobalTag(), obj);
    }

    public static void xml(int i8, String str) {
        log(i8 | 48, CONFIG.getGlobalTag(), str);
    }

    public static void file(String str, Object obj) {
        log(19, str, obj);
    }

    public static void json(String str, Object obj) {
        log(35, str, obj);
    }

    public static void xml(String str, String str2) {
        log(51, str, str2);
    }

    public static void file(int i8, String str, Object obj) {
        log(i8 | 16, str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatObject(Object obj) {
        g gVar;
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap<Class, g> simpleArrayMap = I_FORMATTER_MAP;
        if (!simpleArrayMap.isEmpty() && (gVar = simpleArrayMap.get(getClassFromObject(obj))) != null) {
            return gVar.format(obj);
        }
        return h.object2String(obj);
    }

    public static void json(int i8, String str, Object obj) {
        log(i8 | 32, str, obj);
    }

    public static void xml(int i8, String str, String str2) {
        log(i8 | 48, str, str2);
    }

    private static void print2Console(int i8, String str, String str2) {
        Log.println(i8, str, str2);
        e.access$600(CONFIG);
    }
}
