package com.moyoung.lib.photopicker;

import android.net.Uri;
import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class g implements d {
    private i callback;
    private boolean isMultipleWithOneItem = false;
    private final int maxSelectCount;
    private ActivityResultLauncher<PickVisualMediaRequest> pickMedia;
    private ActivityResultLauncher<PickVisualMediaRequest> pickMultipleMedia;

    public g(Fragment fragment, int i8) {
        this.maxSelectCount = i8;
        if (i8 <= 1) {
            this.pickMedia = fragment.registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: com.moyoung.lib.photopicker.e
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    g.this.lambda$new$0((Uri) obj);
                }
            });
        } else {
            this.pickMultipleMedia = fragment.registerForActivityResult(new ActivityResultContracts.PickMultipleVisualMedia(i8), new ActivityResultCallback() { // from class: com.moyoung.lib.photopicker.f
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    g.this.handleOnPicked((List<Uri>) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnPicked(List<Uri> list) {
        if (list.isEmpty()) {
            i iVar = this.callback;
            if (iVar != null) {
                iVar.onCanceled("callback == null");
            }
            Log.d("PhotoPicker", "No media selected");
            return;
        }
        if (this.callback != null) {
            int size = list.size();
            int i8 = this.maxSelectCount;
            boolean z7 = false;
            if (size > i8) {
                list = list.subList(0, i8);
                z7 = true;
            }
            this.callback.onPicked(list, z7);
        }
        Log.d("PhotoPicker", "Number of items selected: " + list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Uri uri) {
        if (!this.isMultipleWithOneItem) {
            handleOnPicked(uri);
        } else if (uri == null) {
            handleOnPicked(new ArrayList());
        } else {
            handleOnPicked(Collections.singletonList(uri));
        }
    }

    private void pickMultipleWithMediaType(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.pickMultipleMedia;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(new PickVisualMediaRequest.Builder().setMediaType(visualMediaType).build());
        } else {
            this.isMultipleWithOneItem = true;
            pickSingleWithMediaType(visualMediaType);
        }
    }

    private void pickSingleWithMediaType(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.pickMedia;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(new PickVisualMediaRequest.Builder().setMediaType(visualMediaType).build());
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleImage() {
        pickMultipleWithMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleImageAndVideo() {
        pickMultipleWithMediaType(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleVideo() {
        pickMultipleWithMediaType(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleImage() {
        pickSingleWithMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleImageAndVideo() {
        pickSingleWithMediaType(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleVideo() {
        pickSingleWithMediaType(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void setCallback(i iVar) {
        this.callback = iVar;
    }

    private void pickSingleWithMediaType(String str) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.pickMedia;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(new PickVisualMediaRequest.Builder().setMediaType(new ActivityResultContracts.PickVisualMedia.SingleMimeType(str)).build());
    }

    private void pickMultipleWithMediaType(String str) {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.pickMultipleMedia;
        if (activityResultLauncher == null) {
            this.isMultipleWithOneItem = true;
            pickSingleWithMediaType(str);
        } else {
            activityResultLauncher.launch(new PickVisualMediaRequest.Builder().setMediaType(new ActivityResultContracts.PickVisualMedia.SingleMimeType(str)).build());
        }
    }

    private void handleOnPicked(Uri uri) {
        if (uri != null) {
            i iVar = this.callback;
            if (iVar != null) {
                iVar.onPicked(uri);
            }
            Log.d("PhotoPicker", "Selected URI: " + uri);
            return;
        }
        i iVar2 = this.callback;
        if (iVar2 != null) {
            iVar2.onCanceled("uri == null");
        }
        Log.d("PhotoPicker", "No media selected");
    }
}
