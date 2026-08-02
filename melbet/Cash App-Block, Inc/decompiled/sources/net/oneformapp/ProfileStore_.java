package net.oneformapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.AuthenticatorUtils;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda1;
import androidx.camera.core.SingleCloseImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.source.MediaSource$Factory;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.CoroutinesRoom;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.EventListener;
import coil3.intercept.Interceptor;
import coil3.intercept.RealInterceptorChain$proceed$1;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.request.NullRequestData;
import coil3.size.Size;
import com.fillr.m1;
import com.google.common.base.Supplier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.Pool;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.idrnd.misnap.iad.Payload;
import net.oneformapp.ProfileStore_;
import net.oneformapp.encryptionlib.AES256JNCryptor;
import net.oneformapp.encryptionlib.AES256JNCryptorInputStream;
import net.oneformapp.encryptionlib.AES256JNCryptorOutputStream;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class ProfileStore_ implements ImageReaderProxy {
    public static String cipherInstallationId;
    public static String cipherPasscode;
    public static Cipher decryptionCipher;
    public static Cipher encryptionCipher;
    public static ProfileStore_ instance_;
    public Object authStore;
    public Object context;
    public boolean hasLoaded;
    public Object passcode;
    public Object profileData;
    public int runningVersion;
    public Object schema;

    public ProfileStore_(ImageReaderProxy imageReaderProxy) {
        this.passcode = new Object();
        this.runningVersion = 0;
        this.hasLoaded = false;
        this.profileData = new SafeCloseImageReaderProxy$$ExternalSyntheticLambda1(this, 0);
        this.authStore = imageReaderProxy;
        this.context = imageReaderProxy.getSurface();
    }

    public static String SHA1(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
        messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02X", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static ProfileStore_ copy$default(ProfileStore_ profileStore_, int i, ImageRequest imageRequest, int i2) {
        if ((i2 & 1) != 0) {
            i = profileStore_.runningVersion;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            imageRequest = (ImageRequest) profileStore_.context;
        }
        Size size = (Size) profileStore_.schema;
        return new ProfileStore_((ImageRequest) profileStore_.passcode, (List) profileStore_.authStore, i3, imageRequest, size, (EventListener) profileStore_.profileData, profileStore_.hasLoaded);
    }

    public static ProfileStore_ getInstance_(Context context) {
        if (instance_ == null) {
            Context applicationContext = context.getApplicationContext();
            ProfileStore_ profileStore_ = new ProfileStore_();
            profileStore_.hasLoaded = false;
            profileStore_.passcode = null;
            profileStore_.runningVersion = 2;
            profileStore_.profileData = new Properties();
            instance_ = profileStore_;
            Pool pool = new Pool();
            pool.pool = new Payload(applicationContext);
            profileStore_.authStore = pool;
            profileStore_.schema = Schema_.getInstance_(applicationContext);
            profileStore_.context = applicationContext;
        }
        return instance_;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        SingleCloseImageProxy singleCloseImageProxy;
        synchronized (this.passcode) {
            ImageProxy acquireLatestImage = ((ImageReaderProxy) this.authStore).acquireLatestImage();
            if (acquireLatestImage != null) {
                this.runningVersion++;
                singleCloseImageProxy = new SingleCloseImageProxy(acquireLatestImage);
                singleCloseImageProxy.addOnImageCloseListener((SafeCloseImageReaderProxy$$ExternalSyntheticLambda1) this.profileData);
            } else {
                singleCloseImageProxy = null;
            }
        }
        return singleCloseImageProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        SingleCloseImageProxy singleCloseImageProxy;
        synchronized (this.passcode) {
            ImageProxy acquireNextImage = ((ImageReaderProxy) this.authStore).acquireNextImage();
            if (acquireNextImage != null) {
                this.runningVersion++;
                singleCloseImageProxy = new SingleCloseImageProxy(acquireNextImage);
                singleCloseImageProxy.addOnImageCloseListener((SafeCloseImageReaderProxy$$ExternalSyntheticLambda1) this.profileData);
            } else {
                singleCloseImageProxy = null;
            }
        }
        return singleCloseImageProxy;
    }

    public void checkRequest(ImageRequest imageRequest, Interceptor interceptor) {
        Context context = imageRequest.context;
        ImageRequest imageRequest2 = (ImageRequest) this.passcode;
        if (context != imageRequest2.context) {
            Handlers$$ExternalSyntheticBUOutline0.m("Interceptor '", interceptor, "' cannot modify the request's context.");
            return;
        }
        if (imageRequest.data == NullRequestData.INSTANCE) {
            Handlers$$ExternalSyntheticBUOutline0.m("Interceptor '", interceptor, "' cannot set the request's data to null.");
        } else if (imageRequest.target != imageRequest2.target) {
            Handlers$$ExternalSyntheticBUOutline0.m("Interceptor '", interceptor, "' cannot modify the request's target.");
        } else {
            if (imageRequest.sizeResolver == imageRequest2.sizeResolver) {
                return;
            }
            Handlers$$ExternalSyntheticBUOutline0.m("Interceptor '", interceptor, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.passcode) {
            ((ImageReaderProxy) this.authStore).clearOnImageAvailableListener();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.passcode) {
            try {
                Surface surface = (Surface) this.context;
                if (surface != null) {
                    surface.release();
                }
                ((ImageReaderProxy) this.authStore).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cipher createCipher(int i, String str) {
        boolean z;
        SecretKey secretKey = null;
        if (!str.equals(cipherPasscode) || !((Pool) this.authStore).getInstallationID().equals(cipherInstallationId)) {
            encryptionCipher = null;
            decryptionCipher = null;
            cipherPasscode = str;
            cipherInstallationId = ((Pool) this.authStore).getInstallationID();
        }
        Cipher cipher = i == 1 ? encryptionCipher : decryptionCipher;
        if (cipher != null) {
            try {
                cipher.doFinal();
                z = false;
            } catch (Exception unused) {
            }
            if (z) {
                byte[] bytes = ((Pool) this.authStore).getInstallationID().getBytes();
                try {
                    System.currentTimeMillis();
                    SecretKey generateSecret = SecretKeyFactory.getInstance("PBEWITHSHA256AND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((((Pool) this.authStore).getInstallationID() + "|" + SHA1(str)).toCharArray(), bytes, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 256));
                    System.currentTimeMillis();
                    secretKey = generateSecret;
                } catch (Exception unused2) {
                }
                cipher.init(i, secretKey, new PBEParameterSpec(bytes, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO));
            }
            if (i != 1) {
                encryptionCipher = cipher;
            } else {
                decryptionCipher = cipher;
            }
            return cipher;
        }
        cipher = Cipher.getInstance("AES/CFB8/NoPadding");
        z = true;
        if (z) {
        }
        if (i != 1) {
        }
        return cipher;
    }

    public void deleteData(String str) {
        ((Properties) this.profileData).remove(str);
    }

    public String getData(String str) {
        if (str.endsWith(".")) {
            str = Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, str);
        }
        return ((Properties) this.profileData).getProperty(str);
    }

    public EventListener getEventListener() {
        return (EventListener) this.profileData;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.passcode) {
            height = ((ImageReaderProxy) this.authStore).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.passcode) {
            imageFormat = ((ImageReaderProxy) this.authStore).getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.passcode) {
            maxImages = ((ImageReaderProxy) this.authStore).getMaxImages();
        }
        return maxImages;
    }

    public MediaSource$Factory getMediaSourceFactory(int i) {
        Supplier supplier;
        Supplier exoPlayer$Builder$$ExternalSyntheticLambda0;
        HashMap hashMap = (HashMap) this.context;
        MediaSource$Factory mediaSource$Factory = (MediaSource$Factory) hashMap.get(Integer.valueOf(i));
        if (mediaSource$Factory != null) {
            return mediaSource$Factory;
        }
        HashMap hashMap2 = (HashMap) this.authStore;
        Supplier supplier2 = (Supplier) hashMap2.get(Integer.valueOf(i));
        if (supplier2 == null) {
            final CallResult callResult = (CallResult) this.schema;
            callResult.getClass();
            if (i != 0) {
                final int i2 = 1;
                if (i != 1) {
                    final int i3 = 2;
                    if (i != 2) {
                        final int i4 = 3;
                        if (i == 3) {
                            exoPlayer$Builder$$ExternalSyntheticLambda0 = new ExoPlayer$Builder$$ExternalSyntheticLambda0(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource$Factory.class), 5);
                        } else if (i == 4) {
                            exoPlayer$Builder$$ExternalSyntheticLambda0 = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                                @Override // com.google.common.base.Supplier
                                public final Object get() {
                                    int i5 = i4;
                                    DataSource.Factory factory = callResult;
                                    Object obj = this;
                                    switch (i5) {
                                        case 0:
                                            return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                        case 1:
                                            return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                        case 2:
                                            return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                        default:
                                            return new ProgressiveMediaSource.Factory(factory, (DefaultExtractorsFactory) ((ProfileStore_) obj).passcode);
                                    }
                                }
                            };
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unrecognized contentType: "));
                            supplier2 = null;
                        }
                        supplier2 = exoPlayer$Builder$$ExternalSyntheticLambda0;
                    } else {
                        final GenericDeclaration asSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(MediaSource$Factory.class);
                        supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                int i5 = i3;
                                DataSource.Factory factory = callResult;
                                Object obj = asSubclass;
                                switch (i5) {
                                    case 0:
                                        return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                    case 1:
                                        return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                    case 2:
                                        return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                    default:
                                        return new ProgressiveMediaSource.Factory(factory, (DefaultExtractorsFactory) ((ProfileStore_) obj).passcode);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource$Factory.class);
                    supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            int i5 = i2;
                            DataSource.Factory factory = callResult;
                            Object obj = asSubclass2;
                            switch (i5) {
                                case 0:
                                    return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                case 1:
                                    return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                case 2:
                                    return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                                default:
                                    return new ProgressiveMediaSource.Factory(factory, (DefaultExtractorsFactory) ((ProfileStore_) obj).passcode);
                            }
                        }
                    };
                }
                supplier2 = supplier;
            } else {
                final GenericDeclaration asSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(MediaSource$Factory.class);
                final int i5 = 0;
                supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.DefaultMediaSourceFactory$DelegateFactoryLoader$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        int i52 = i5;
                        DataSource.Factory factory = callResult;
                        Object obj = asSubclass3;
                        switch (i52) {
                            case 0:
                                return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                            case 1:
                                return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                            case 2:
                                return DefaultMediaSourceFactory.access$300((Class) obj, factory);
                            default:
                                return new ProgressiveMediaSource.Factory(factory, (DefaultExtractorsFactory) ((ProfileStore_) obj).passcode);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i), supplier2);
        }
        MediaSource$Factory mediaSource$Factory2 = (MediaSource$Factory) supplier2.get();
        mediaSource$Factory2.setSubtitleParserFactory((CoroutinesRoom.Companion) this.profileData);
        mediaSource$Factory2.experimentalParseSubtitlesDuringExtraction(this.hasLoaded);
        mediaSource$Factory2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.runningVersion);
        hashMap.put(Integer.valueOf(i), mediaSource$Factory2);
        return mediaSource$Factory2;
    }

    public void getProfileCompletePercentage(Schema_ schema_) {
        int i;
        int size;
        String property;
        if (schema_ == null) {
            return;
        }
        synchronized (schema_) {
            try {
                Iterator it = new ArrayList(((LinkedHashMap) schema_.mappedElements).values()).iterator();
                i = 0;
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    Element element2 = schema_.getElement(element.getFormattedParentPathKey());
                    if (!element.hasChildElements() && !ElementType.isNonRecursiveType(element.actingElement().elementTypeName)) {
                        if (element.actingElement().dashboardStat && element2 != null && element2.actingElement().dashboardStat) {
                            i++;
                        }
                    }
                    if (ElementType.isNonRecursiveType(element.actingElement().elementTypeName)) {
                        if (element.actingElement().dashboardStat) {
                            i++;
                        }
                    }
                }
            } finally {
            }
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it2 = ((Properties) this.profileData).keySet().iterator();
                while (it2.hasNext()) {
                    String obj = it2.next().toString();
                    String formattedPathKey = Toolbar.AnonymousClass1.getFormattedPathKey(obj);
                    if (schema_.getElement(formattedPathKey) != null) {
                        Element element3 = schema_.getElement(formattedPathKey);
                        Element element4 = schema_.getElement(element3.getFormattedParentPathKey());
                        if (element3.actingElement().dashboardStat && !arrayList.contains(formattedPathKey) && element4 != null && element4.actingElement().dashboardStat && (property = ((Properties) this.profileData).getProperty(obj)) != null && !property.trim().equals("")) {
                            arrayList.add(formattedPathKey);
                        }
                    }
                }
            } catch (ConcurrentModificationException unused) {
            }
            size = arrayList.size();
        }
        Math.round((size * 100) / i);
    }

    public ImageRequest getRequest() {
        return (ImageRequest) this.context;
    }

    public Size getSize() {
        return (Size) this.schema;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.passcode) {
            surface = ((ImageReaderProxy) this.authStore).getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.passcode) {
            width = ((ImageReaderProxy) this.authStore).getWidth();
        }
        return width;
    }

    public boolean isPlaceholderCached() {
        return this.hasLoaded;
    }

    public boolean isValidProfileElement(String str) {
        if (str != null) {
            return ((Schema_) this.schema).getElement(str.replaceAll("\\[\\d+\\]|\\.$|", "")) != null || str.endsWith(".Count") || str.endsWith(".All") || str.startsWith("AddressDetails") || str.endsWith(".Id");
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:59:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db A[Catch: Exception -> 0x00f5, TryCatch #6 {Exception -> 0x00f5, blocks: (B:25:0x00cd, B:27:0x00db, B:28:0x00e4, B:30:0x00ee, B:31:0x00ef, B:32:0x00f4), top: B:24:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[Catch: Exception -> 0x00f5, TryCatch #6 {Exception -> 0x00f5, blocks: (B:25:0x00cd, B:27:0x00db, B:28:0x00e4, B:30:0x00ee, B:31:0x00ef, B:32:0x00f4), top: B:24:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[Catch: Exception -> 0x00f5, TryCatch #6 {Exception -> 0x00f5, blocks: (B:25:0x00cd, B:27:0x00db, B:28:0x00e4, B:30:0x00ee, B:31:0x00ef, B:32:0x00f4), top: B:24:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void load() {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Properties properties = (Properties) this.profileData;
        if (((String) this.passcode) == null) {
            return;
        }
        FileInputStream fileInputStream3 = null;
        try {
            try {
                try {
                    fileInputStream = ((Context) this.context).openFileInput("profile.data");
                    try {
                        if (this.runningVersion == 1) {
                            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, createCipher(2, (String) this.passcode));
                            properties.clear();
                            properties.load(cipherInputStream);
                        } else {
                            int i = 13;
                            boolean z = false;
                            if (m1.mInstance == null) {
                                m1.mInstance = new m1(i, z);
                            }
                            m1 m1Var = m1.mInstance;
                            PopEncryptorV2_ popEncryptorV2_ = (PopEncryptorV2_) m1Var.a;
                            if (popEncryptorV2_ != null) {
                                popEncryptorV2_.isInit = false;
                            }
                            if (m1Var == null) {
                                m1.mInstance = new m1(i, z);
                            }
                            PopEncryptorV2_ popEncryptor = m1.mInstance.getPopEncryptor((Context) this.context, ((String) this.passcode).toCharArray());
                            AES256JNCryptorInputStream aES256JNCryptorInputStream = new AES256JNCryptorInputStream(fileInputStream, (SecretKeySpec) popEncryptor.encryptionKey, (SecretKeySpec) popEncryptor.hmacKey);
                            properties.clear();
                            properties.load(aES256JNCryptorInputStream);
                        }
                        String property = properties.getProperty("_id_");
                        if (property != null) {
                            String[] split = property.split("\\|");
                            if (split.length == 2) {
                                split[1].equals(SHA1((String) this.passcode));
                            }
                        }
                        this.hasLoaded = true;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (("com.fillr".equals(((Context) this.context).getApplicationInfo().packageName) ? Class.forName("com.fillr.core.migrations.SchemaV4ExtendedMigration") : AuthenticatorUtils.class).getConstructor(null).newInstance(null) != null) {
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("net.oneformapp.ProfileStore", "Error reading encrypted file", e);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (("com.fillr".equals(((Context) this.context).getApplicationInfo().packageName) ? Class.forName("com.fillr.core.migrations.SchemaV4ExtendedMigration") : AuthenticatorUtils.class).getConstructor(null).newInstance(null) != null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream3 = fileInputStream2;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileInputStream = null;
            } catch (Exception e5) {
                e = e5;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream3 != null) {
                }
                throw th;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        try {
            if (("com.fillr".equals(((Context) this.context).getApplicationInfo().packageName) ? Class.forName("com.fillr.core.migrations.SchemaV4ExtendedMigration") : AuthenticatorUtils.class).getConstructor(null).newInstance(null) != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public void loadStoredPin() {
        try {
            String string2 = ((SharedPreferences) ((Payload) ((Pool) this.authStore).pool).a).getString("encryptedPin", null);
            if (string2 != null) {
                AES256JNCryptor aES256JNCryptor = new AES256JNCryptor();
                byte[] decode = Base64.decode(((Pool) this.authStore).getEncryptionSalt(), 2);
                byte[] decode2 = Base64.decode(((Pool) this.authStore).getEncryptionhmac(), 2);
                byte[] decryptData = AES256JNCryptor.decryptData(Base64.decode(string2, 2), aES256JNCryptor.keyForPassword(((Pool) this.authStore).getInstallationID().toCharArray(), decode), aES256JNCryptor.keyForPassword(((Pool) this.authStore).getInstallationID().toCharArray(), decode2));
                if (decryptData != null) {
                    this.passcode = new String(decryptData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object proceed(ContinuationImpl continuationImpl) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        Interceptor interceptor;
        int i2 = this.runningVersion;
        if (continuationImpl instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuationImpl;
            int i3 = realInterceptorChain$proceed$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realInterceptorChain$proceed$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realInterceptorChain$proceed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInterceptorChain$proceed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Interceptor interceptor2 = (Interceptor) ((List) this.authStore).get(i2);
                    ProfileStore_ copy$default = copy$default(this, i2 + 1, null, 6);
                    realInterceptorChain$proceed$1.L$0 = interceptor2;
                    realInterceptorChain$proceed$1.label = 1;
                    Object intercept = interceptor2.intercept(copy$default, realInterceptorChain$proceed$1);
                    if (intercept == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interceptor = interceptor2;
                    obj = intercept;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interceptor = realInterceptorChain$proceed$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ImageResult imageResult = (ImageResult) obj;
                checkRequest(imageResult.getRequest(), interceptor);
                return imageResult;
            }
        }
        realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
        Object obj2 = realInterceptorChain$proceed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        ImageResult imageResult2 = (ImageResult) obj2;
        checkRequest(imageResult2.getRequest(), interceptor);
        return imageResult2;
    }

    public void safeClose() {
        synchronized (this.passcode) {
            try {
                this.hasLoaded = true;
                ((ImageReaderProxy) this.authStore).clearOnImageAvailableListener();
                if (this.runningVersion == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setData(Map map) {
        if (map != null) {
            for (String str : map.keySet()) {
                String str2 = (String) map.get(str);
                if (str != null && str2 != null && isValidProfileElement(str)) {
                    ((Properties) this.profileData).put(str, str2);
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.passcode) {
            ((ImageReaderProxy) this.authStore).setOnImageAvailableListener(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(1, this, onImageAvailableListener), executor);
        }
    }

    public void store() {
        Properties properties = (Properties) this.profileData;
        String str = (String) this.passcode;
        if (str == null || str.length() != 4) {
            Context context = (Context) this.context;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
        String str2 = (String) this.passcode;
        if (str2 == null || str2.length() != 4) {
            return;
        }
        try {
            properties.setProperty("_id_", ((Pool) this.authStore).getInstallationID() + "|" + SHA1((String) this.passcode));
            boolean z = false;
            if (this.runningVersion == 1) {
                properties.store(new CipherOutputStream(((Context) this.context).openFileOutput("profile.data", 0), createCipher(1, (String) this.passcode)), "Written " + System.currentTimeMillis());
                return;
            }
            if (m1.mInstance == null) {
                m1.mInstance = new m1(13, z);
            }
            PopEncryptorV2_ popEncryptor = m1.mInstance.getPopEncryptor((Context) this.context, ((String) this.passcode).toCharArray());
            AES256JNCryptorOutputStream aES256JNCryptorOutputStream = new AES256JNCryptorOutputStream(((Context) this.context).openFileOutput("profile.data", 0), (SecretKeySpec) popEncryptor.encryptionKey, (SecretKeySpec) popEncryptor.hmacKey);
            properties.store(aES256JNCryptorOutputStream, "Written " + System.currentTimeMillis());
            aES256JNCryptorOutputStream.flush();
            aES256JNCryptorOutputStream.close();
        } catch (Exception e) {
            Log.w("net.oneformapp.ProfileStore", "Error writting encrypted file", e);
        }
    }

    public ProfileStore_ withRequest(ImageRequest imageRequest) {
        int i = this.runningVersion;
        if (i > 0) {
            checkRequest(imageRequest, (Interceptor) ((List) this.authStore).get(i - 1));
        }
        return copy$default(this, 0, imageRequest, 5);
    }

    public ProfileStore_(ImageRequest imageRequest, List list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.passcode = imageRequest;
        this.authStore = list;
        this.runningVersion = i;
        this.context = imageRequest2;
        this.schema = size;
        this.profileData = eventListener;
        this.hasLoaded = z;
    }

    public void setData(String str, String str2) {
        if (str == null || str2 == null || !isValidProfileElement(str)) {
            return;
        }
        ((Properties) this.profileData).setProperty(str, str2);
    }
}
