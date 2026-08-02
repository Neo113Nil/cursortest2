package papa;

import android.view.Window;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import curtains.WindowsKt;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonImpl;
import kotlinx.serialization.json.internal.JsonSerializersModuleValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;
import papa.internal.OnPreDrawListenerWrapper;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public abstract class AppUpdateData {

    /* loaded from: classes9.dex */
    public final class ErrorRetrievingAppUpdateData extends AppUpdateData {
        public final Throwable throwable;

        public ErrorRetrievingAppUpdateData(Throwable th) {
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorRetrievingAppUpdateData) && this.throwable.equals(((ErrorRetrievingAppUpdateData) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return "ErrorRetrievingAppUpdateData(throwable=" + this.throwable + ')';
        }
    }

    public final class NoAppUpdateDataYet extends AppUpdateData {
        public static final NoAppUpdateDataYet INSTANCE = new NoAppUpdateDataYet();
    }

    public final class RealAppUpdateData extends AppUpdateData {
        public final ArrayList allInstalledVersionCodes;
        public final List allInstalledVersionNames;
        public final Boolean crashedInLastProcess;
        public final Long elapsedRealtimeSinceCrash;
        public final long firstInstallTimeMillis;
        public final long lastUpdateTimeMillis;
        public final Boolean rebootedSinceLastStart;
        public final AppUpdateStartStatus status;
        public final Boolean updatedOsSinceLastStart;

        public RealAppUpdateData(AppUpdateStartStatus appUpdateStartStatus, long j, long j2, List list, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, Long l) {
            list.getClass();
            this.status = appUpdateStartStatus;
            this.firstInstallTimeMillis = j;
            this.lastUpdateTimeMillis = j2;
            this.allInstalledVersionNames = list;
            this.allInstalledVersionCodes = arrayList;
            this.updatedOsSinceLastStart = bool;
            this.rebootedSinceLastStart = bool2;
            this.crashedInLastProcess = bool3;
            this.elapsedRealtimeSinceCrash = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealAppUpdateData)) {
                return false;
            }
            RealAppUpdateData realAppUpdateData = (RealAppUpdateData) obj;
            return this.status == realAppUpdateData.status && this.firstInstallTimeMillis == realAppUpdateData.firstInstallTimeMillis && this.lastUpdateTimeMillis == realAppUpdateData.lastUpdateTimeMillis && Intrinsics.areEqual(this.allInstalledVersionNames, realAppUpdateData.allInstalledVersionNames) && this.allInstalledVersionCodes.equals(realAppUpdateData.allInstalledVersionCodes) && Intrinsics.areEqual(this.updatedOsSinceLastStart, realAppUpdateData.updatedOsSinceLastStart) && Intrinsics.areEqual(this.rebootedSinceLastStart, realAppUpdateData.rebootedSinceLastStart) && Intrinsics.areEqual(this.crashedInLastProcess, realAppUpdateData.crashedInLastProcess) && Intrinsics.areEqual(this.elapsedRealtimeSinceCrash, realAppUpdateData.elapsedRealtimeSinceCrash);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.allInstalledVersionCodes, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.status.hashCode() * 31, 31, this.firstInstallTimeMillis), 31, this.lastUpdateTimeMillis), 31, this.allInstalledVersionNames), 31);
            Boolean bool = this.updatedOsSinceLastStart;
            int hashCode = (m + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.rebootedSinceLastStart;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.crashedInLastProcess;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Long l = this.elapsedRealtimeSinceCrash;
            return hashCode3 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            return "RealAppUpdateData(status=" + this.status + ", firstInstallTimeMillis=" + this.firstInstallTimeMillis + ", lastUpdateTimeMillis=" + this.lastUpdateTimeMillis + ", allInstalledVersionNames=" + this.allInstalledVersionNames + ", allInstalledVersionCodes=" + this.allInstalledVersionCodes + ", updatedOsSinceLastStart=" + this.updatedOsSinceLastStart + ", rebootedSinceLastStart=" + this.rebootedSinceLastStart + ", crashedInLastProcess=" + this.crashedInLastProcess + ", elapsedRealtimeSinceCrash=" + this.elapsedRealtimeSinceCrash + ')';
        }
    }

    public static JsonImpl Json$default(Function1 function1) {
        Json.Default r0 = Json.Default;
        r0.getClass();
        function1.getClass();
        JsonBuilder jsonBuilder = new JsonBuilder();
        JsonConfiguration jsonConfiguration = r0.configuration;
        jsonBuilder.encodeDefaults = jsonConfiguration.encodeDefaults;
        jsonBuilder.explicitNulls = jsonConfiguration.explicitNulls;
        jsonBuilder.ignoreUnknownKeys = jsonConfiguration.ignoreUnknownKeys;
        jsonBuilder.isLenient = jsonConfiguration.isLenient;
        String str = jsonConfiguration.prettyPrintIndent;
        jsonBuilder.coerceInputValues = jsonConfiguration.coerceInputValues;
        String str2 = jsonConfiguration.classDiscriminator;
        ClassDiscriminatorMode classDiscriminatorMode = jsonConfiguration.classDiscriminatorMode;
        boolean z = jsonConfiguration.useAlternativeNames;
        jsonBuilder.allowStructuredMapKeys = jsonConfiguration.allowStructuredMapKeys;
        jsonBuilder.useArrayPolymorphism = jsonConfiguration.useArrayPolymorphism;
        jsonBuilder.serializersModule = r0.serializersModule;
        boolean z2 = jsonConfiguration.exceptionsWithDebugInfo;
        function1.invoke(jsonBuilder);
        if (jsonBuilder.useArrayPolymorphism) {
            if (!Intrinsics.areEqual(str2, "type")) {
                a$$ExternalSyntheticBUOutline0.m$3("Class discriminator should not be specified when array polymorphism is specified");
                return null;
            }
            if (classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
                a$$ExternalSyntheticBUOutline0.m$3("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                return null;
            }
        }
        if (!Intrinsics.areEqual(str, "    ")) {
            a$$ExternalSyntheticBUOutline0.m$3("Indent should not be specified when default printing mode is used");
            return null;
        }
        JsonConfiguration jsonConfiguration2 = new JsonConfiguration(jsonBuilder.encodeDefaults, jsonBuilder.ignoreUnknownKeys, jsonBuilder.isLenient, jsonBuilder.allowStructuredMapKeys, jsonBuilder.explicitNulls, str, jsonBuilder.coerceInputValues, jsonBuilder.useArrayPolymorphism, str2, z, classDiscriminatorMode, z2);
        SerializersModule serializersModule = jsonBuilder.serializersModule;
        serializersModule.getClass();
        JsonImpl jsonImpl = new JsonImpl(jsonConfiguration2, serializersModule);
        if (serializersModule.equals(SerializersModuleKt.EmptySerializersModule)) {
            return jsonImpl;
        }
        serializersModule.dumpTo(new JsonSerializersModuleValidator(jsonConfiguration2));
        return jsonImpl;
    }

    public static final Object[] access$insertEntryAtIndex(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] access$removeEntryAtIndex(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ArraysKt___ArraysJvmKt.copyInto$default(0, i, 6, objArr, objArr2);
        ArraysKt___ArraysJvmKt.copyInto(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void commonAddLenient(Headers.Builder builder, String str, String str2) {
        builder.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = builder.namesAndValues;
        arrayList.add(str);
        arrayList.add(StringsKt.trim(str2).toString());
    }

    public static final void forEachLine(BufferedReader bufferedReader, Function1 function1) {
        try {
            Iterator it = new ConstrainedOnceSequence(new LinesSequence(bufferedReader, 0)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final void headersCheckName(String str) {
        str.getClass();
        if (str.length() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                Boxes$$ExternalSyntheticOutline1.m(sb, num, " at ", i, " in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void headersCheckValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                Boxes$$ExternalSyntheticOutline1.m(sb, num, " at ", i, " in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(_UtilCommonKt.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void onNextPreDraw(Window window, Function0 function0) {
        window.getClass();
        WindowsKt.onDecorViewReady(window, new Perfs$$ExternalSyntheticLambda2(new LaunchTracker$$ExternalSyntheticLambda0(8, window, new OnPreDrawListenerWrapper(0), function0), 12));
    }

    public static final String readText(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[PKIFailureInfo.certRevoked];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }
}
