package com.squareup.ecr;

/* loaded from: classes7.dex */
public interface EmbeddedCardReaderEventHandler {
    void deactivateCard();

    void declinePayment();

    void detectCard();

    void generateRandomNumber(int i);

    void logEvent(String str, String str2);

    void playAlertTone();

    void playSuccessTone();

    void removeCard();

    void sendAuthRequest(byte[] bArr);

    void sendCommandApdu(byte[] bArr);
}
