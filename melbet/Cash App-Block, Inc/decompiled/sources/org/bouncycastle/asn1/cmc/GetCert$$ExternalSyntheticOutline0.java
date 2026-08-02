package org.bouncycastle.asn1.cmc;

import java.io.PrintWriter;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeTaskQueue;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class GetCert$$ExternalSyntheticOutline0 {
    public static String m(StringBuilder sb, String str, String str2, TiffField tiffField) {
        sb.append(str);
        sb.append(str2);
        sb.append(tiffField.getFieldType().getName());
        return sb.toString();
    }

    public static String m(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String m(IllegalArgumentException illegalArgumentException, StringBuilder sb) {
        sb.append(illegalArgumentException.getMessage());
        return sb.toString();
    }

    public static String m(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return str + algorithmParameterSpec;
    }

    public static String m(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String m(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String m(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static int m(ASN1Sequence aSN1Sequence, int i) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i)).intValueExact();
    }

    public static String m(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    public static String m(ASN1TaggedObject aSN1TaggedObject, StringBuilder sb) {
        sb.append(aSN1TaggedObject.getTagNo());
        return sb.toString();
    }

    public static StringBuilder m(StringBuilder sb, int i, PrintWriter printWriter, String str) {
        sb.append(i);
        printWriter.println(sb.toString());
        return new StringBuilder(str);
    }

    public static StringBuilder m(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    public static ASN1ObjectIdentifier m(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static DERSequence m(ASN1EncodableVector aSN1EncodableVector, ASN1Integer aSN1Integer, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(aSN1Integer);
        return new DERSequence(aSN1EncodableVector2);
    }

    public static DERSequence m(ASN1EncodableVector aSN1EncodableVector, ASN1OctetString aSN1OctetString, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(aSN1OctetString);
        return new DERSequence(aSN1EncodableVector2);
    }

    public static DERSequence m(ASN1EncodableVector aSN1EncodableVector, DEROctetString dEROctetString, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(dEROctetString);
        return new DERSequence(aSN1EncodableVector2);
    }

    public static /* synthetic */ void m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeTaskQueue lockFreeTaskQueue, LockFreeTaskQueueCore lockFreeTaskQueueCore, LockFreeTaskQueueCore lockFreeTaskQueueCore2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeTaskQueue, lockFreeTaskQueueCore, lockFreeTaskQueueCore2) && atomicReferenceFieldUpdater.get(lockFreeTaskQueue) == lockFreeTaskQueueCore) {
        }
    }

    public static /* synthetic */ boolean m(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, SelectImplementation selectImplementation, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(selectImplementation, obj, SelectKt.STATE_CANCELLED)) {
            if (atomicReferenceFieldUpdater.get(selectImplementation) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, SemaphoreAndMutexImpl semaphoreAndMutexImpl, Segment segment, Segment segment2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(semaphoreAndMutexImpl, segment, segment2)) {
            if (atomicReferenceFieldUpdater.get(semaphoreAndMutexImpl) != segment) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static byte[] m4360m(ASN1Sequence aSN1Sequence, int i) {
        return ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }
}
