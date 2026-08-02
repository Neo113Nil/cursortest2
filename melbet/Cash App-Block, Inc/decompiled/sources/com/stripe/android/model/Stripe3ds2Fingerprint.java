package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.StripeIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes8.dex */
public final class Stripe3ds2Fingerprint implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new SourceParams.Creator(13);
    public final DirectoryServerEncryption directoryServerEncryption;
    public final String directoryServerName;
    public final String serverTransactionId;
    public final String source;

    public final class DirectoryServerEncryption implements Parcelable {
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new SourceParams.Creator(14);
        public final String directoryServerId;
        public final PublicKey directoryServerPublicKey;
        public final String keyId;
        public final ArrayList rootCerts;

        public DirectoryServerEncryption(String str, PublicKey publicKey, ArrayList arrayList, String str2) {
            str.getClass();
            publicKey.getClass();
            this.directoryServerId = str;
            this.directoryServerPublicKey = publicKey;
            this.rootCerts = arrayList;
            this.keyId = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectoryServerEncryption)) {
                return false;
            }
            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
            return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && this.rootCerts.equals(directoryServerEncryption.rootCerts) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.rootCerts, (this.directoryServerPublicKey.hashCode() + (this.directoryServerId.hashCode() * 31)) * 31, 31);
            String str = this.keyId;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", directoryServerPublicKey=" + this.directoryServerPublicKey + ", rootCerts=" + this.rootCerts + ", keyId=" + this.keyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.directoryServerId);
            parcel.writeSerializable(this.directoryServerPublicKey);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.rootCerts, parcel);
            while (m.hasNext()) {
                parcel.writeSerializable((Serializable) m.next());
            }
            parcel.writeString(this.keyId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2) {
        this(r0, r1, r2, new DirectoryServerEncryption(r4, r5, r8, r14));
        use3DS2.getClass();
        String str = use3DS2.source;
        String str2 = use3DS2.serverName;
        String str3 = use3DS2.transactionId;
        StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption directoryServerEncryption = use3DS2.serverEncryption;
        String str4 = directoryServerEncryption.directoryServerId;
        String str5 = directoryServerEncryption.dsCertificateData;
        List list = directoryServerEncryption.rootCertsData;
        String str6 = directoryServerEncryption.keyId;
        str4.getClass();
        str5.getClass();
        list.getClass();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] bytes = str5.getBytes(Charsets.UTF_8);
        bytes.getClass();
        Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
        generateCertificate.getClass();
        PublicKey publicKey = ((X509Certificate) generateCertificate).getPublicKey();
        publicKey.getClass();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (String str7 : list2) {
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
            byte[] bytes2 = str7.getBytes(Charsets.UTF_8);
            bytes2.getClass();
            Certificate generateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
            generateCertificate2.getClass();
            arrayList.add((X509Certificate) generateCertificate2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2Fingerprint)) {
            return false;
        }
        Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) obj;
        return Intrinsics.areEqual(this.source, stripe3ds2Fingerprint.source) && Intrinsics.areEqual(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && Intrinsics.areEqual(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && Intrinsics.areEqual(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
    }

    public final int hashCode() {
        return this.directoryServerEncryption.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.source.hashCode() * 31, 31, this.directoryServerName), 31, this.serverTransactionId);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Stripe3ds2Fingerprint(source=", this.source, ", directoryServerName=", this.directoryServerName, ", serverTransactionId=");
        m.append(this.serverTransactionId);
        m.append(", directoryServerEncryption=");
        m.append(this.directoryServerEncryption);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.source);
        parcel.writeString(this.directoryServerName);
        parcel.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(parcel, i);
    }

    public Stripe3ds2Fingerprint(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        directoryServerEncryption.getClass();
        this.source = str;
        this.directoryServerName = str2;
        this.serverTransactionId = str3;
        this.directoryServerEncryption = directoryServerEncryption;
    }
}
