package com.squareup.ecr;

import android.content.Context;
import java.io.InputStream;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public class EmbeddedCardReader {
    static final int INVALID_HANDLE = -1;
    static final String TAG = "EmbeddedCardReader";
    private Context context;
    private EmbeddedCardReaderEventHandler embeddedCardReaderEventHandler;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    private volatile long handle = -1;

    static {
        System.loadLibrary("ecr-c4b");
    }

    public EmbeddedCardReader(Context context, EmbeddedCardReaderEventHandler embeddedCardReaderEventHandler) {
        this.context = context;
        this.embeddedCardReaderEventHandler = embeddedCardReaderEventHandler;
    }

    private native long create_reader(byte[] bArr, byte[] bArr2);

    private void deactivateCard() {
        this.embeddedCardReaderEventHandler.deactivateCard();
    }

    private void declinePayment() {
        this.embeddedCardReaderEventHandler.declinePayment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void destroy_reader(long j);

    private void detectCard() {
        this.embeddedCardReaderEventHandler.detectCard();
    }

    private void generateRandomNumber(int i) {
        this.embeddedCardReaderEventHandler.generateRandomNumber(i);
    }

    private void logEvent(String str, String str2) {
        this.embeddedCardReaderEventHandler.logEvent(str, str2);
    }

    private void playAlertTone() {
        this.embeddedCardReaderEventHandler.playAlertTone();
    }

    private void playSuccessTone() {
        this.embeddedCardReaderEventHandler.playSuccessTone();
    }

    private void removeCard() {
        this.embeddedCardReaderEventHandler.removeCard();
    }

    private void sendAuthRequest(byte[] bArr) {
        this.embeddedCardReaderEventHandler.sendAuthRequest(bArr);
    }

    private void sendCommandApdu(byte[] bArr) {
        this.embeddedCardReaderEventHandler.sendCommandApdu(bArr);
    }

    private native void send_card_deactivated(long j);

    private native void send_card_detected(long j);

    private native void send_card_error(long j);

    private native void send_card_removed(long j);

    private native void send_no_card(long j);

    private native void send_random_number(long j, byte[] bArr);

    private native void send_response_apdu(long j, byte[] bArr);

    private native void start_payment(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void start_reader(long j);

    private native void stop_reader(long j);

    public boolean isReaderStopped() {
        return this.handle == -1;
    }

    public void sendCardDeactivated() {
        send_card_deactivated(this.handle);
    }

    public void sendCardDetected() {
        send_card_detected(this.handle);
    }

    public void sendCardError() {
        send_card_error(this.handle);
    }

    public void sendCardRemoved() {
        send_card_removed(this.handle);
    }

    public void sendNoCard() {
        send_no_card(this.handle);
    }

    public void sendRandomNumber(byte[] bArr) {
        send_random_number(this.handle, bArr);
    }

    public void sendResponseApdu(byte[] bArr) {
        send_response_apdu(this.handle, bArr);
    }

    public void startPayment(long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        start_payment(this.handle, j, 840, calendar.get(1) % 100, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), z);
    }

    public void startReader(byte[] bArr, boolean z) {
        InputStream open = this.context.getAssets().open(z ? "ecr-tms+capks_us_prod.bin" : "ecr-tms+capks_us_test.bin");
        byte[] bArr2 = new byte[open.available()];
        open.read(bArr2);
        open.close();
        this.handle = create_reader(bArr2, bArr);
        this.executorService.submit(new Runnable() { // from class: com.squareup.ecr.EmbeddedCardReader.1
            @Override // java.lang.Runnable
            public void run() {
                EmbeddedCardReader embeddedCardReader = EmbeddedCardReader.this;
                embeddedCardReader.start_reader(embeddedCardReader.handle);
                EmbeddedCardReader embeddedCardReader2 = EmbeddedCardReader.this;
                embeddedCardReader2.destroy_reader(embeddedCardReader2.handle);
                EmbeddedCardReader.this.handle = -1L;
            }
        });
    }

    public void stopReader() {
        if (this.handle != -1) {
            stop_reader(this.handle);
        }
    }
}
