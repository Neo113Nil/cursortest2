package com.onesignal.core.internal.device;

import com.onesignal.core.BuildConfig;
import io.opentelemetry.semconv.OtelAttributes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: IDeviceService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J\b\u0010\u0016\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0012\u0010\u000f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/onesignal/core/internal/device/IDeviceService;", "", "deviceType", "Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "getDeviceType", "()Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "hasAllHMSLibrariesForPushKit", "", "getHasAllHMSLibrariesForPushKit", "()Z", "hasFCMLibrary", "getHasFCMLibrary", "isAndroidDeviceType", "isFireOSDeviceType", "isGMSInstalledAndEnabled", "isHuaweiDeviceType", "jetpackLibraryStatus", "Lcom/onesignal/core/internal/device/IDeviceService$JetpackLibraryStatus;", "getJetpackLibraryStatus", "()Lcom/onesignal/core/internal/device/IDeviceService$JetpackLibraryStatus;", "supportsHMS", "getSupportsHMS", "supportsGooglePush", "DeviceType", "JetpackLibraryStatus", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IDeviceService {
    DeviceType getDeviceType();

    boolean getHasAllHMSLibrariesForPushKit();

    boolean getHasFCMLibrary();

    JetpackLibraryStatus getJetpackLibraryStatus();

    boolean getSupportsHMS();

    boolean isAndroidDeviceType();

    boolean isFireOSDeviceType();

    boolean isGMSInstalledAndEnabled();

    boolean isHuaweiDeviceType();

    boolean supportsGooglePush();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IDeviceService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onesignal/core/internal/device/IDeviceService$JetpackLibraryStatus;", "", "(Ljava/lang/String;I)V", "MISSING", "OUTDATED", OtelAttributes.OtelStatusCodeValues.OK, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JetpackLibraryStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JetpackLibraryStatus[] $VALUES;
        public static final JetpackLibraryStatus MISSING = new JetpackLibraryStatus("MISSING", 0);
        public static final JetpackLibraryStatus OUTDATED = new JetpackLibraryStatus("OUTDATED", 1);
        public static final JetpackLibraryStatus OK = new JetpackLibraryStatus(OtelAttributes.OtelStatusCodeValues.OK, 2);

        private static final /* synthetic */ JetpackLibraryStatus[] $values() {
            return new JetpackLibraryStatus[]{MISSING, OUTDATED, OK};
        }

        public static EnumEntries<JetpackLibraryStatus> getEntries() {
            return $ENTRIES;
        }

        public static JetpackLibraryStatus valueOf(String str) {
            return (JetpackLibraryStatus) Enum.valueOf(JetpackLibraryStatus.class, str);
        }

        public static JetpackLibraryStatus[] values() {
            return (JetpackLibraryStatus[]) $VALUES.clone();
        }

        private JetpackLibraryStatus(String str, int i) {
        }

        static {
            JetpackLibraryStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IDeviceService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Fire", "Android", "Huawei", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeviceType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeviceType[] $VALUES;
        private final int value;
        public static final DeviceType Fire = new DeviceType("Fire", 0, 2);
        public static final DeviceType Android = new DeviceType("Android", 1, 1);
        public static final DeviceType Huawei = new DeviceType("Huawei", 2, 13);

        private static final /* synthetic */ DeviceType[] $values() {
            return new DeviceType[]{Fire, Android, Huawei};
        }

        public static EnumEntries<DeviceType> getEntries() {
            return $ENTRIES;
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }

        private DeviceType(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            DeviceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
