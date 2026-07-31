package com.yandex.div.storage;

import com.yandex.div.storage.DivStorageImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$CursorDrivenRawJson$data$2 extends s implements Function0<JSONObject> {
    final /* synthetic */ DivStorageImpl.CursorDrivenRawJson this$0;
    final /* synthetic */ DivStorageImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageImpl$CursorDrivenRawJson$data$2(DivStorageImpl.CursorDrivenRawJson cursorDrivenRawJson, DivStorageImpl divStorageImpl) {
        super(0);
        this.this$0 = cursorDrivenRawJson;
        this.this$1 = divStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final JSONObject invoke() {
        boolean z4;
        JSONObject jSONObject;
        z4 = this.this$0.cursorInvalid;
        if (z4) {
            throw new IllegalStateException("Data no longer valid!");
        }
        DivStorageImpl divStorageImpl = this.this$1;
        byte[] blob = this.this$0.getCursor().getBlob(this.this$1.indexOf(this.this$0.getCursor(), "raw_json_data"));
        Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(cursor.in…Of(COLUMN_RAW_JSON_DATA))");
        jSONObject = divStorageImpl.toJSONObject(blob);
        return jSONObject;
    }
}
