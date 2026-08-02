package org.bouncycastle.est;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes9.dex */
public class HttpAuth implements ESTAuth {
    private static final DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
    private static final Set<String> validParts;
    private final DigestCalculatorProvider digestCalculatorProvider;
    private final SecureRandom nonceGenerator;
    private final char[] password;
    private final String realm;
    private final String username;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("realm");
        hashSet.add("nonce");
        hashSet.add("opaque");
        hashSet.add("algorithm");
        hashSet.add("qop");
        validParts = Collections.unmodifiableSet(hashSet);
    }

    public HttpAuth(String str, String str2, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this.realm = str;
        this.username = str2;
        this.password = cArr;
        this.nonceGenerator = secureRandom;
        this.digestCalculatorProvider = digestCalculatorProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ESTResponse doDigestFunction(ESTResponse eSTResponse) {
        String m;
        eSTResponse.close();
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        try {
            Map<String, String> splitCSL = HttpUtil.splitCSL("Digest", eSTResponse.getHeader("WWW-Authenticate"));
            try {
                String path = originalRequest.getURL().toURI().getPath();
                for (String str : splitCSL.keySet()) {
                    if (!validParts.contains(str)) {
                        throw new ESTException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unrecognised entry in WWW-Authenticate header: '", "'", (Object) str));
                    }
                }
                String method = originalRequest.getMethod();
                String str2 = splitCSL.get("realm");
                String str3 = splitCSL.get("nonce");
                String str4 = splitCSL.get("opaque");
                String str5 = "algorithm";
                String str6 = splitCSL.get("algorithm");
                String str7 = splitCSL.get("qop");
                ArrayList arrayList = new ArrayList();
                String str8 = this.realm;
                if (str8 != null && !str8.equals(str2)) {
                    throw new ESTException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Supplied realm '"), this.realm, "' does not match server realm '", str2, "'"), null, HttpStatusCode.UNAUTHORIZED_401, null);
                }
                if (str6 == null) {
                    str6 = "MD5";
                }
                if (str6.length() == 0) {
                    throw new ESTException("WWW-Authenticate no algorithm defined.");
                }
                String upperCase = Strings.toUpperCase(str6);
                if (str7 == null) {
                    throw new ESTException("Qop is not defined in WWW-Authenticate header.");
                }
                if (str7.length() == 0) {
                    throw new ESTException("QoP value is empty.");
                }
                String[] split = Strings.toLowerCase(str7).split(",");
                int i = 0;
                while (true) {
                    String[] strArr = split;
                    String str9 = str5;
                    if (i == split.length) {
                        AlgorithmIdentifier lookupDigest = lookupDigest(upperCase);
                        if (lookupDigest != null && lookupDigest.getAlgorithm() != null) {
                            DigestCalculator digestCalculator = getDigestCalculator(upperCase, lookupDigest);
                            OutputStream outputStream = digestCalculator.getOutputStream();
                            String makeNonce = makeNonce(10);
                            update(outputStream, this.username);
                            update(outputStream, ":");
                            update(outputStream, str2);
                            update(outputStream, ":");
                            update(outputStream, this.password);
                            outputStream.close();
                            byte[] digest = digestCalculator.getDigest();
                            if (upperCase.endsWith("-SESS")) {
                                DigestCalculator digestCalculator2 = getDigestCalculator(upperCase, lookupDigest);
                                OutputStream outputStream2 = digestCalculator2.getOutputStream();
                                update(outputStream2, Hex.toHexString(digest));
                                update(outputStream2, ":");
                                update(outputStream2, str3);
                                update(outputStream2, ":");
                                update(outputStream2, makeNonce);
                                outputStream2.close();
                                digest = digestCalculator2.getDigest();
                            }
                            String hexString = Hex.toHexString(digest);
                            DigestCalculator digestCalculator3 = getDigestCalculator(upperCase, lookupDigest);
                            OutputStream outputStream3 = digestCalculator3.getOutputStream();
                            if (((String) arrayList.get(0)).equals("auth-int")) {
                                DigestCalculator digestCalculator4 = getDigestCalculator(upperCase, lookupDigest);
                                OutputStream outputStream4 = digestCalculator4.getOutputStream();
                                originalRequest.writeData(outputStream4);
                                outputStream4.close();
                                byte[] digest2 = digestCalculator4.getDigest();
                                update(outputStream3, method);
                                update(outputStream3, ":");
                                update(outputStream3, path);
                                update(outputStream3, ":");
                                update(outputStream3, Hex.toHexString(digest2));
                            } else if (((String) arrayList.get(0)).equals("auth")) {
                                update(outputStream3, method);
                                update(outputStream3, ":");
                                update(outputStream3, path);
                            }
                            outputStream3.close();
                            String hexString2 = Hex.toHexString(digestCalculator3.getDigest());
                            DigestCalculator digestCalculator5 = getDigestCalculator(upperCase, lookupDigest);
                            OutputStream outputStream5 = digestCalculator5.getOutputStream();
                            boolean contains = arrayList.contains("missing");
                            update(outputStream5, hexString);
                            update(outputStream5, ":");
                            update(outputStream5, str3);
                            update(outputStream5, ":");
                            if (!contains) {
                                update(outputStream5, "00000001");
                                update(outputStream5, ":");
                                update(outputStream5, makeNonce);
                                update(outputStream5, ":");
                                if (((String) arrayList.get(0)).equals("auth-int")) {
                                    update(outputStream5, "auth-int");
                                } else {
                                    update(outputStream5, "auth");
                                }
                                update(outputStream5, ":");
                            }
                            update(outputStream5, hexString2);
                            outputStream5.close();
                            String hexString3 = Hex.toHexString(digestCalculator5.getDigest());
                            HashMap hashMap = new HashMap();
                            hashMap.put("username", this.username);
                            hashMap.put("realm", str2);
                            hashMap.put("nonce", str3);
                            hashMap.put("uri", path);
                            hashMap.put("response", hexString3);
                            if (!((String) arrayList.get(0)).equals("auth-int")) {
                                if (((String) arrayList.get(0)).equals("auth")) {
                                    hashMap.put("qop", "auth");
                                }
                                hashMap.put(str9, upperCase);
                                if (str4 != null || str4.length() == 0) {
                                    hashMap.put("opaque", makeNonce(20));
                                }
                                ESTRequestBuilder withHijacker = new ESTRequestBuilder(originalRequest).withHijacker(null);
                                withHijacker.setHeader("Authorization", HttpUtil.mergeCSL("Digest", hashMap));
                                return originalRequest.getClient().doRequest(withHijacker.build());
                            }
                            hashMap.put("qop", "auth-int");
                            hashMap.put("nc", "00000001");
                            hashMap.put("cnonce", makeNonce);
                            hashMap.put(str9, upperCase);
                            if (str4 != null) {
                            }
                            hashMap.put("opaque", makeNonce(20));
                            ESTRequestBuilder withHijacker2 = new ESTRequestBuilder(originalRequest).withHijacker(null);
                            withHijacker2.setHeader("Authorization", HttpUtil.mergeCSL("Digest", hashMap));
                            return originalRequest.getClient().doRequest(withHijacker2.build());
                        }
                        m = Recorder$$ExternalSyntheticOutline2.m("auth digest algorithm unknown: ", upperCase);
                    } else {
                        if (!strArr[i].equals("auth") && !strArr[i].equals("auth-int")) {
                            throw new ESTException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "QoP value unknown: '", "'"));
                        }
                        String trim = strArr[i].trim();
                        if (!arrayList.contains(trim)) {
                            arrayList.add(trim);
                        }
                        i++;
                        split = strArr;
                        str5 = str9;
                    }
                }
            } catch (Exception e) {
                m = Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to process URL in request: "));
            }
            a$$ExternalSyntheticBUOutline0.m$4(m);
            return null;
        } catch (Throwable th) {
            throw new ESTException("Parsing WWW-Authentication header: " + th.getMessage(), th, eSTResponse.getStatusCode(), new ByteArrayInputStream(eSTResponse.getHeader("WWW-Authenticate").getBytes()));
        }
    }

    private DigestCalculator getDigestCalculator(String str, AlgorithmIdentifier algorithmIdentifier) {
        try {
            return this.digestCalculatorProvider.get(algorithmIdentifier);
        } catch (OperatorCreationException e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("cannot create digest calculator for ", str, ": ");
            m3m.append(e.getMessage());
            throw new IOException(m3m.toString());
        }
    }

    private AlgorithmIdentifier lookupDigest(String str) {
        if (str.endsWith("-SESS")) {
            str = Boxes$$ExternalSyntheticOutline1.m1148m(5, 0, str);
        }
        return str.equals("SHA-512-256") ? digestAlgorithmIdentifierFinder.find(NISTObjectIdentifiers.id_sha512_256) : digestAlgorithmIdentifierFinder.find(str);
    }

    private String makeNonce(int i) {
        byte[] bArr = new byte[i];
        this.nonceGenerator.nextBytes(bArr);
        return Hex.toHexString(bArr);
    }

    private void update(OutputStream outputStream, String str) {
        outputStream.write(Strings.toUTF8ByteArray(str));
    }

    @Override // org.bouncycastle.est.ESTAuth
    public void applyAuth(ESTRequestBuilder eSTRequestBuilder) {
        eSTRequestBuilder.withHijacker(new ESTHijacker() { // from class: org.bouncycastle.est.HttpAuth.1
            @Override // org.bouncycastle.est.ESTHijacker
            public ESTResponse hijack(ESTRequest eSTRequest, Source source) {
                ESTResponse eSTResponse = new ESTResponse(eSTRequest, source);
                if (eSTResponse.getStatusCode() != 401) {
                    return eSTResponse;
                }
                String header = eSTResponse.getHeader("WWW-Authenticate");
                if (header == null) {
                    throw new ESTException("Status of 401 but no WWW-Authenticate header");
                }
                String lowerCase = Strings.toLowerCase(header);
                if (lowerCase.startsWith(CMSAttributeTableGenerator.DIGEST)) {
                    return HttpAuth.this.doDigestFunction(eSTResponse);
                }
                if (!lowerCase.startsWith("basic")) {
                    throw new ESTException("Unknown auth mode: ".concat(lowerCase));
                }
                eSTResponse.close();
                Map<String, String> splitCSL = HttpUtil.splitCSL("Basic", eSTResponse.getHeader("WWW-Authenticate"));
                if (HttpAuth.this.realm != null && !HttpAuth.this.realm.equals(splitCSL.get("realm"))) {
                    StringBuilder sb = new StringBuilder("Supplied realm '");
                    sb.append(HttpAuth.this.realm);
                    sb.append("' does not match server realm '");
                    throw new ESTException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, splitCSL.get("realm"), "'"), null, HttpStatusCode.UNAUTHORIZED_401, null);
                }
                ESTRequestBuilder withHijacker = new ESTRequestBuilder(eSTRequest).withHijacker(null);
                if (HttpAuth.this.realm != null && HttpAuth.this.realm.length() > 0) {
                    withHijacker.setHeader("WWW-Authenticate", "Basic realm=\"" + HttpAuth.this.realm + "\"");
                }
                if (HttpAuth.this.username.contains(":")) {
                    a$$ExternalSyntheticBUOutline0.m$3("User must not contain a ':'");
                    return null;
                }
                char[] cArr = new char[HttpAuth.this.username.length() + 1 + HttpAuth.this.password.length];
                System.arraycopy(HttpAuth.this.username.toCharArray(), 0, cArr, 0, HttpAuth.this.username.length());
                cArr[HttpAuth.this.username.length()] = ':';
                System.arraycopy(HttpAuth.this.password, 0, cArr, HttpAuth.this.username.length() + 1, HttpAuth.this.password.length);
                withHijacker.setHeader("Authorization", "Basic " + Base64.toBase64String(Strings.toByteArray(cArr)));
                ESTResponse doRequest = eSTRequest.getClient().doRequest(withHijacker.build());
                Arrays.fill(cArr, (char) 0);
                return doRequest;
            }
        });
    }

    private void update(OutputStream outputStream, char[] cArr) {
        outputStream.write(Strings.toUTF8ByteArray(cArr));
    }

    public HttpAuth(String str, String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    public HttpAuth(String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public HttpAuth(String str, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this(null, str, cArr, secureRandom, digestCalculatorProvider);
    }
}
