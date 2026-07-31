package E;

import A.h;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1286d;

/* loaded from: classes.dex */
public abstract class c {

    class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z4, b bVar) {
            super(inputConnection, z4);
            this.f490a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
            if (this.f490a.a(d.f(inputContentInfo), i4, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i4, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i4, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, d dVar, int i4, Bundle bundle) {
        if ((i4 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
                return false;
            }
        }
        return AbstractC1281a0.e0(view, new C1286d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }

    private static b b(final View view) {
        h.f(view);
        return new b() { // from class: E.b
            @Override // E.c.b
            public final boolean a(d dVar, int i4, Bundle bundle) {
                return c.a(view, dVar, i4, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        A.c.d(inputConnection, "inputConnection must be non-null");
        A.c.d(editorInfo, "editorInfo must be non-null");
        A.c.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
