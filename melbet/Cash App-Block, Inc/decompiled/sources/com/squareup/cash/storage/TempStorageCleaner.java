package com.squareup.cash.storage;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import java.util.List;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.CoroutineScope;
import okio.Path;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class TempStorageCleaner implements IoSetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final Object storage;

    public /* synthetic */ TempStorageCleaner(Object obj, int i) {
        this.$r8$classId = i;
        this.storage = obj;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        int i = this.$r8$classId;
        coroutineScope.getClass();
        switch (i) {
            case 0:
                int i2 = 0;
                Timber.Forest.i("Cleaning temp storage", new Object[0]);
                try {
                    ContextForwardingFileSystem contextForwardingFileSystem = ((RealStorage) ((Storage) this.storage)).temp;
                    String str = Path.DIRECTORY_SEPARATOR;
                    List<Path> listOrNull = contextForwardingFileSystem.listOrNull(Path.Companion.get("/", false));
                    if (listOrNull != null) {
                        for (Path path : listOrNull) {
                            path.getClass();
                            SequenceBuilderIterator it = SequencesKt__SequenceBuilderKt.iterator(new FileSystem$commonDeleteRecursively$sequence$1(contextForwardingFileSystem, path, null, i2));
                            while (it.hasNext()) {
                                contextForwardingFileSystem.delete((Path) it.next(), false);
                            }
                        }
                    }
                } catch (Exception e) {
                    Timber.Forest.e(Boxes$$ExternalSyntheticOutline1.m(e, "Failed to clean temp storage: "), new Object[0]);
                }
                return StateFlowKt.noOpTeardown;
            default:
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 27));
        }
    }
}
