package com.unity3d.player;

import android.app.ApplicationExitInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
class ApplicationExitInfoWrapper extends ApplicationExitInfoBase {
    private ApplicationExitInfo mApplicationExitInfo;

    public ApplicationExitInfoWrapper(ApplicationExitInfo applicationExitInfo) {
        this.mApplicationExitInfo = applicationExitInfo;
    }

    protected static Object GetStaticFieldByReflection(Class cls, String str, Object obj, boolean z4) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (z4) {
                declaredField.setAccessible(true);
            }
            return declaredField.get(null);
        } catch (NoSuchFieldException e4) {
            h1.T.a(6, "ApplicationExitInfo: GetStaticFieldByReflection NoSuchFieldException " + e4);
            return obj;
        } catch (Exception e5) {
            h1.T.a(6, "ApplicationExitInfo: GetStaticFieldByReflection exception " + e5);
            return obj;
        }
    }

    private boolean checkSupport() {
        return this.mApplicationExitInfo != null && PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }

    private byte[] readAllBytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e4) {
                h1.T.a(6, "ApplicationExitInfo: readAllBytes exception " + e4);
                throw e4;
            }
        }
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int describeContents() {
        int describeContents;
        if (!checkSupport()) {
            return 0;
        }
        describeContents = this.mApplicationExitInfo.describeContents();
        return describeContents;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getDefiningUid() {
        int definingUid;
        if (!checkSupport()) {
            return 0;
        }
        definingUid = this.mApplicationExitInfo.getDefiningUid();
        return definingUid;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public String getDescription() {
        String description;
        if (!checkSupport()) {
            return null;
        }
        description = this.mApplicationExitInfo.getDescription();
        return description;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getImportance() {
        int importance;
        if (!checkSupport()) {
            return 0;
        }
        importance = this.mApplicationExitInfo.getImportance();
        return importance;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getPackageUid() {
        int packageUid;
        if (!checkSupport()) {
            return 0;
        }
        packageUid = this.mApplicationExitInfo.getPackageUid();
        return packageUid;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getPid() {
        int pid;
        if (!checkSupport()) {
            return 0;
        }
        pid = this.mApplicationExitInfo.getPid();
        return pid;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public String getProcessName() {
        String processName;
        if (!checkSupport()) {
            return null;
        }
        processName = this.mApplicationExitInfo.getProcessName();
        return processName;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public byte[] getProcessStateSummary() {
        byte[] processStateSummary;
        if (!checkSupport()) {
            return new byte[0];
        }
        processStateSummary = this.mApplicationExitInfo.getProcessStateSummary();
        return processStateSummary;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public long getPss() {
        long pss;
        if (!checkSupport()) {
            return 0L;
        }
        pss = this.mApplicationExitInfo.getPss();
        return pss;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getRealUid() {
        int realUid;
        if (!checkSupport()) {
            return 0;
        }
        realUid = this.mApplicationExitInfo.getRealUid();
        return realUid;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getReason() {
        int reason;
        if (!checkSupport()) {
            return 0;
        }
        reason = this.mApplicationExitInfo.getReason();
        return reason;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public long getRss() {
        long rss;
        if (!checkSupport()) {
            return 0L;
        }
        rss = this.mApplicationExitInfo.getRss();
        return rss;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public int getStatus() {
        int status;
        if (!checkSupport()) {
            return 0;
        }
        status = this.mApplicationExitInfo.getStatus();
        return status;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public long getTimestamp() {
        long timestamp;
        if (!checkSupport()) {
            return 0L;
        }
        timestamp = this.mApplicationExitInfo.getTimestamp();
        return timestamp;
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public byte[] getTrace() {
        InputStream traceInputStream;
        if (!checkSupport()) {
            return null;
        }
        try {
            traceInputStream = this.mApplicationExitInfo.getTraceInputStream();
            return readAllBytes(traceInputStream);
        } catch (IOException e4) {
            h1.T.a(6, "ApplicationExitInfo: getTrace exception " + e4);
            return null;
        }
    }

    @Override // com.unity3d.player.ApplicationExitInfoBase
    public String getTraceString() {
        byte[] trace = getTrace();
        return (trace == null || trace.length == 0) ? "" : new String(trace, StandardCharsets.UTF_8);
    }
}
