package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import coil3.size.SizeKt;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "nfc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PassportNfcReaderContract extends ActivityResultContract<PassportNfcReaderConfig, PassportNfcReaderOutput> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Class<?> cls;
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) obj;
        passportNfcReaderConfig.getClass();
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.nfc.impl.NfcReaderActivity");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("EXTRA_NFC_READER_CONFIG", passportNfcReaderConfig);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Bundle extras;
        PassportNfcReaderOutput passportNfcReaderOutput;
        return (intent == null || (extras = intent.getExtras()) == null || (passportNfcReaderOutput = (PassportNfcReaderOutput) SizeKt.getParcelable(extras, "EXTRA_RESULT", PassportNfcReaderOutput.class)) == null) ? new PassportNfcReaderOutput.Error("Unable to extract output from result intent.", PassportNfcReaderOutput.ErrorType.Unknown) : passportNfcReaderOutput;
    }
}
