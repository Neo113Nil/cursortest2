package papa.internal;

import android.app.Application;
import androidx.work.impl.WorkManagerImpl;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.zipline.loader.LoaderJniKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.session.backend.DoubleWriteExperimentForwarder;
import com.squareup.cash.storage.RealSessionedLinkStore;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService$$ExternalSyntheticLambda0;
import com.squareup.cash.treehouse.android.LazyZiplineHttpClient;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.RealConnectionPool;
import okio.Buffer;
import okio.FileSystem;
import okio.Path;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppUpdateDetector$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AppUpdateDetector$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int lastIndexOf$default;
        Pair pair;
        Pair pair2;
        int i = this.$r8$classId;
        ActivitiesManager.ActivityPageHandler activityPageHandler = null;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ((Application) ((OkHttpCall.AnonymousClass1) obj).val$callback).getSharedPreferences("AppUpgradeDetector", 0);
            case 1:
                ((DoubleWriteExperimentForwarder) obj).currentReader.set(null);
                return Unit.INSTANCE;
            case 2:
                ((RealSessionedLinkStore) obj).getClass();
                return Boolean.FALSE;
            case 3:
                return new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default((RealActivityTokenFactory) obj, ActivityTokenType.CUSTOMER_TOKEN), ActivityScope.SUPPORT_TRANSACTION, activityPageHandler, 12);
            case 4:
                try {
                    try {
                        new RealThreeDsService$$ExternalSyntheticLambda0((RealThreeDsService) ((RealSignatureManager) obj).logger, 1).invoke();
                    } catch (Exception e) {
                        throw RealThreeDsService.asCashType(e);
                    }
                } catch (Exception e2) {
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("3DSInitializer");
                    forest.e("Failed to cleanup 3DS SDK", new Object[0], e2);
                }
                return Unit.INSTANCE;
            case 5:
                return LoaderJniKt.asZiplineHttpClient((OkHttpClient) ((LazyZiplineHttpClient) obj).okHttpClientProvider.invoke());
            case 6:
                String str = (String) ((Function0) ((RealConnectionPool) obj).cleanupTask).invoke();
                if (str == null) {
                    str = "1970-01-01T00:00:00Z";
                }
                if (new Regex("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z").matches(str)) {
                    return str;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            case 7:
                return (String) FlowKt.asStateFlow(((AndroidSessionIdProvider) obj).sessionId).$$delegate_0.getValue();
            case 8:
                return ((KeyValue) obj).blockingGet();
            case 9:
                return WorkManagerImpl.getInstance$1(((AndroidWorkManager) obj).context);
            case 10:
                return new ProtoWriter((Buffer) ((ReverseProtoWriter) obj).forwardBuffer$delegate.getValue());
            case 11:
                return ArrayIteratorKt.iterator((Object[]) obj);
            case 12:
                return obj;
            case 13:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj;
                return Integer.valueOf(TuplesKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors));
            case 14:
                ResourceFileSystem resourceFileSystem = (ResourceFileSystem) obj;
                ClassLoader classLoader = resourceFileSystem.classLoader;
                FileSystem fileSystem = resourceFileSystem.systemFileSystem;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (Intrinsics.areEqual(url.getProtocol(), "file")) {
                        String str2 = Path.DIRECTORY_SEPARATOR;
                        pair2 = new Pair(fileSystem, Path.Companion.get(new File(url.toURI()), false));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (StringsKt__StringsJVMKt.startsWith(url3, "jar:file:", false) && (lastIndexOf$default = StringsKt.lastIndexOf$default(url3, "!", 0, 6)) != -1) {
                        String str3 = Path.DIRECTORY_SEPARATOR;
                        pair = new Pair(ZipFilesKt.openZip(Path.Companion.get(new File(URI.create(url3.substring(4, lastIndexOf$default))), false), fileSystem, new ZipFilesKt$$ExternalSyntheticLambda4(3)), ResourceFileSystem.ROOT);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList);
            default:
                ((OkHttpCall.AnonymousClass1) obj).this$0 = null;
                return Unit.INSTANCE;
        }
    }
}
