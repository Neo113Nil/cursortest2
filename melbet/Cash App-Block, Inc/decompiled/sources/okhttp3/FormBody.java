package okhttp3;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMap$SingleFlatMapCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.CacheEntry;
import kotlinx.serialization.internal.SerializerCache;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import okio.Buffer;
import okio.BufferedSink;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.MarkdownTokenTypes$Companion$WHITE_SPACE$1;
import org.intellij.markdown.ast.CompositeASTNode;
import org.intellij.markdown.ast.LeafASTNode;
import org.intellij.markdown.ast.impl.ListCompositeNode;
import org.intellij.markdown.ast.impl.ListItemCompositeNode;
import org.intellij.markdown.parser.CancellationToken$NonCancellable;
import papa.PapaEvent;
import retrofit2.DefaultCallAdapterFactory;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class FormBody extends RequestBody {
    public static final MediaType CONTENT_TYPE;
    public final List encodedNames;
    public final List encodedValues;

    static {
        Regex regex = MediaType.TYPE_SUBTYPE;
        CONTENT_TYPE = UnsignedKt.get("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.encodedNames = _UtilJvmKt.toImmutableList(arrayList);
        this.encodedValues = _UtilJvmKt.toImmutableList(arrayList2);
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final long writeOrCountBytes(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            bufferedSink.getClass();
            buffer = bufferedSink.getBuffer();
        }
        List list = this.encodedNames;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.m4335writeByte(38);
            }
            buffer.m4339writeUtf8((String) list.get(i));
            buffer.m4335writeByte(61);
            buffer.m4339writeUtf8((String) this.encodedValues.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = buffer.size;
        buffer.clear();
        return j;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        writeOrCountBytes(bufferedSink, false);
    }

    public class Builder implements SingleObserver, SerializerCache, retrofit2.Callback {
        public Object names;
        public Object values;

        public Builder() {
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public void add(String str, String str2) {
            str.getClass();
            ((ArrayList) this.names).add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            ((ArrayList) this.values).add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        }

        public void addEncoded(String str, String str2) {
            str.getClass();
            ((ArrayList) this.names).add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) this.values).add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        }

        public FormBody build() {
            return new FormBody((ArrayList) this.names, (ArrayList) this.values);
        }

        public CompositeASTNode createCompositeNode(MarkdownElementType markdownElementType, ArrayList arrayList) {
            markdownElementType.getClass();
            ((CancellationToken$NonCancellable) this.values).getClass();
            if (markdownElementType.equals(MarkdownTokenTypes.UNORDERED_LIST) ? true : markdownElementType.equals(MarkdownTokenTypes.ORDERED_LIST)) {
                return new ListCompositeNode(markdownElementType, arrayList);
            }
            MarkdownElementType markdownElementType2 = MarkdownTokenTypes.LIST_ITEM;
            return markdownElementType.equals(markdownElementType2) ? new ListItemCompositeNode(arrayList, markdownElementType2) : new CompositeASTNode(arrayList, markdownElementType);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[EDGE_INSN: B:20:0x0050->B:21:0x0050 BREAK  A[LOOP:0: B:4:0x0010->B:18:0x0042], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public List createLeafNodes(MarkdownElementType markdownElementType, int i, int i2) {
            int i3;
            markdownElementType.getClass();
            MarkdownTokenTypes$Companion$WHITE_SPACE$1 markdownTokenTypes$Companion$WHITE_SPACE$1 = MarkdownTokenTypes.WHITE_SPACE;
            if (!markdownElementType.equals(markdownTokenTypes$Companion$WHITE_SPACE$1)) {
                return CollectionsKt__CollectionsJVMKt.listOf(new LeafASTNode(markdownElementType, i, i2));
            }
            ArrayList arrayList = new ArrayList();
            while (i < i2) {
                ((CancellationToken$NonCancellable) this.values).getClass();
                CharSequence charSequence = (CharSequence) this.names;
                charSequence.getClass();
                int i4 = i2 - 1;
                if (i <= i4) {
                    i3 = i;
                    while (charSequence.charAt(i3) != '\n') {
                        if (i3 != i4) {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        break;
                    }
                    if (i3 > i) {
                        arrayList.add(new LeafASTNode(markdownTokenTypes$Companion$WHITE_SPACE$1, i, i3));
                    }
                    int i5 = i3 + 1;
                    arrayList.add(new LeafASTNode(MarkdownTokenTypes.EOL, i3, i5));
                    i = i5;
                }
                i3 = -1;
                if (i3 != -1) {
                }
            }
            if (i2 > i) {
                arrayList.add(new LeafASTNode(markdownTokenTypes$Companion$WHITE_SPACE$1, i, i2));
            }
            return arrayList;
        }

        @Override // kotlinx.serialization.internal.SerializerCache
        public KSerializer get(KClass kClass) {
            Object putIfAbsent;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.values;
            Class javaClass = PapaEvent.getJavaClass(kClass);
            Object obj = concurrentHashMap.get(javaClass);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj = new CacheEntry((KSerializer) ((Function1) this.names).invoke(kClass))))) != null) {
                obj = putIfAbsent;
            }
            return ((CacheEntry) obj).serializer;
        }

        public int getCount() {
            RecyclerView.Adapter adapter = ((ViewPager2) this.names).mRecyclerView.mAdapter;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public List getParameters() {
            return (ArrayList) this.names;
        }

        public Class getReturnType() {
            return (Class) this.values;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onError(Throwable th) {
            ((SingleObserver) this.values).onError(th);
        }

        @Override // retrofit2.Callback
        public void onFailure(retrofit2.Call call, Throwable th) {
            ((Executor) ((DefaultCallAdapterFactory.ExecutorCallbackCall) this.values).callbackExecutor).execute(new CardEntryActivityController$$ExternalSyntheticLambda1(21, this, (retrofit2.Callback) this.names, th));
        }

        @Override // retrofit2.Callback
        public void onResponse(retrofit2.Call call, retrofit2.Response response) {
            ((Executor) ((DefaultCallAdapterFactory.ExecutorCallbackCall) this.values).callbackExecutor).execute(new CardEntryActivityController$$ExternalSyntheticLambda1(20, this, (retrofit2.Callback) this.names, response));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace((SingleFlatMap$SingleFlatMapCallback) this.names, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(Object obj) {
            ((SingleObserver) this.values).onSuccess(obj);
        }

        public Builder(int i, CharSequence charSequence) {
            charSequence.getClass();
            this.names = charSequence;
            this.values = CancellationToken$NonCancellable.INSTANCE;
        }

        public Builder(DefaultCallAdapterFactory.ExecutorCallbackCall executorCallbackCall, retrofit2.Callback callback) {
            this.values = executorCallbackCall;
            this.names = callback;
        }

        public /* synthetic */ Builder(Object obj, Object obj2) {
            this.names = obj;
            this.values = obj2;
        }

        public Builder(Function1 function1) {
            this.names = function1;
            this.values = new ConcurrentHashMap();
        }
    }
}
