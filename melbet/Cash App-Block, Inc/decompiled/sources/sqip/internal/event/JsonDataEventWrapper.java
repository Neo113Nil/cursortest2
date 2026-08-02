package sqip.internal.event;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lsqip/internal/event/JsonDataEventWrapper;", "", "catalog_name", "", "recorded_at_usec", "", "json_data", "app_name", "uuid", "secret_token", "es2_debug_trace_id", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApp_name", "()Ljava/lang/String;", "getCatalog_name", "getEs2_debug_trace_id", "getJson_data", "getRecorded_at_usec", "()J", "getSecret_token", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JsonDataEventWrapper {
    private final String app_name;
    private final String catalog_name;
    private final String es2_debug_trace_id;
    private final String json_data;
    private final long recorded_at_usec;
    private final String secret_token;
    private final String uuid;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ JsonDataEventWrapper(java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L6
            java.lang.String r14 = "in-app-payments-sdk-android"
        L6:
            r5 = r14
            r14 = r18 & 16
            if (r14 == 0) goto L11
            java.lang.String r14 = androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m()
            r6 = r14
            goto L12
        L11:
            r6 = r15
        L12:
            r14 = r18 & 32
            java.lang.String r0 = ""
            if (r14 == 0) goto L1a
            r7 = r0
            goto L1c
        L1a:
            r7 = r16
        L1c:
            r14 = r18 & 64
            if (r14 == 0) goto L26
            r8 = r0
            r1 = r10
            r2 = r11
            r4 = r13
            r0 = r9
            goto L2c
        L26:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r13
        L2c:
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sqip.internal.event.JsonDataEventWrapper.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ JsonDataEventWrapper copy$default(JsonDataEventWrapper jsonDataEventWrapper, String str, long j, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonDataEventWrapper.catalog_name;
        }
        if ((i & 2) != 0) {
            j = jsonDataEventWrapper.recorded_at_usec;
        }
        if ((i & 4) != 0) {
            str2 = jsonDataEventWrapper.json_data;
        }
        if ((i & 8) != 0) {
            str3 = jsonDataEventWrapper.app_name;
        }
        if ((i & 16) != 0) {
            str4 = jsonDataEventWrapper.uuid;
        }
        if ((i & 32) != 0) {
            str5 = jsonDataEventWrapper.secret_token;
        }
        if ((i & 64) != 0) {
            str6 = jsonDataEventWrapper.es2_debug_trace_id;
        }
        String str7 = str6;
        String str8 = str4;
        String str9 = str2;
        return jsonDataEventWrapper.copy(str, j, str9, str3, str8, str5, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCatalog_name() {
        return this.catalog_name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRecorded_at_usec() {
        return this.recorded_at_usec;
    }

    /* renamed from: component3, reason: from getter */
    public final String getJson_data() {
        return this.json_data;
    }

    /* renamed from: component4, reason: from getter */
    public final String getApp_name() {
        return this.app_name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecret_token() {
        return this.secret_token;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEs2_debug_trace_id() {
        return this.es2_debug_trace_id;
    }

    public final JsonDataEventWrapper copy(String catalog_name, long recorded_at_usec, String json_data, String app_name, String uuid, String secret_token, String es2_debug_trace_id) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(catalog_name, json_data, app_name, uuid, secret_token);
        es2_debug_trace_id.getClass();
        return new JsonDataEventWrapper(catalog_name, recorded_at_usec, json_data, app_name, uuid, secret_token, es2_debug_trace_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonDataEventWrapper)) {
            return false;
        }
        JsonDataEventWrapper jsonDataEventWrapper = (JsonDataEventWrapper) other;
        return Intrinsics.areEqual(this.catalog_name, jsonDataEventWrapper.catalog_name) && this.recorded_at_usec == jsonDataEventWrapper.recorded_at_usec && Intrinsics.areEqual(this.json_data, jsonDataEventWrapper.json_data) && Intrinsics.areEqual(this.app_name, jsonDataEventWrapper.app_name) && Intrinsics.areEqual(this.uuid, jsonDataEventWrapper.uuid) && Intrinsics.areEqual(this.secret_token, jsonDataEventWrapper.secret_token) && Intrinsics.areEqual(this.es2_debug_trace_id, jsonDataEventWrapper.es2_debug_trace_id);
    }

    public final String getApp_name() {
        return this.app_name;
    }

    public final String getCatalog_name() {
        return this.catalog_name;
    }

    public final String getEs2_debug_trace_id() {
        return this.es2_debug_trace_id;
    }

    public final String getJson_data() {
        return this.json_data;
    }

    public final long getRecorded_at_usec() {
        return this.recorded_at_usec;
    }

    public final String getSecret_token() {
        return this.secret_token;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.es2_debug_trace_id.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.catalog_name.hashCode() * 31, 31, this.recorded_at_usec), 31, this.json_data), 31, this.app_name), 31, this.uuid), 31, this.secret_token);
    }

    public String toString() {
        String str = this.catalog_name;
        long j = this.recorded_at_usec;
        String str2 = this.json_data;
        String str3 = this.app_name;
        String str4 = this.uuid;
        String str5 = this.secret_token;
        String str6 = this.es2_debug_trace_id;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("JsonDataEventWrapper(catalog_name=", str, ", recorded_at_usec=", j);
        Boxes$$ExternalSyntheticOutline1.m(m, ", json_data=", str2, ", app_name=", str3);
        Boxes$$ExternalSyntheticOutline1.m(m, ", uuid=", str4, ", secret_token=", str5);
        return Recorder$$ExternalSyntheticOutline2.m(m, ", es2_debug_trace_id=", str6, ")");
    }

    public JsonDataEventWrapper(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.catalog_name = str;
        this.recorded_at_usec = j;
        this.json_data = str2;
        this.app_name = str3;
        this.uuid = str4;
        this.secret_token = str5;
        this.es2_debug_trace_id = str6;
    }
}
