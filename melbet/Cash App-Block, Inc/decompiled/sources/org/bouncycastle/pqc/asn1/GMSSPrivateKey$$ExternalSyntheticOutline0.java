package org.bouncycastle.pqc.asn1;

import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.NcaBouncyCastleProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class GMSSPrivateKey$$ExternalSyntheticOutline0 {
    public static void _dispatch_doAction(int i, BlockContent blockContent, MarkdownElementType markdownElementType) {
        if (i == 1) {
            markdownElementType.getClass();
            BlockContent blockContent2 = (BlockContent) blockContent.sb;
            ((ArrayList) blockContent2.sb).add(new SequentialParser.Node(new IntRange(blockContent.lineCount, blockContent2.lineCount, 1), markdownElementType));
        } else {
            if (i == 2) {
                markdownElementType.getClass();
                return;
            }
            markdownElementType.getClass();
            if (i == 3) {
                throw new UnsupportedOperationException("Should not be invoked");
            }
        }
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m4361m(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static String m(KeySpec keySpec, StringBuilder sb, String str) {
        sb.append(keySpec.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static String m(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    public static String m(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static StringBuilder m(StringBuilder sb, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2, String str3) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder m(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static StringBuilder m(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m4362m(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static Map m4363m(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static ASN1EncodableVector m(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static ECFieldElement m(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static void m(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap hashMap, Integer num) {
        hashMap.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m4364m(StringBuilder sb, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        configurableProvider.addAlgorithm(str3, sb.toString());
    }

    public static void m(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static void m(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m4365m(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    public static void m(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    public static void m(NcaBouncyCastleProvider ncaBouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ncaBouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    public static void m(LMSigParameters lMSigParameters, LMSigParameters.AnonymousClass1 anonymousClass1, LMSigParameters lMSigParameters2) {
        int i;
        i = lMSigParameters.f1616type;
        anonymousClass1.put(Integer.valueOf(i), lMSigParameters2);
    }
}
