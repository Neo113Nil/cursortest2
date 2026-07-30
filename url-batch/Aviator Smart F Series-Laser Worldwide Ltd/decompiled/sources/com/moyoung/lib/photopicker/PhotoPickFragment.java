package com.moyoung.lib.photopicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.moyoung.lib.photopicker.PhotoPickHelper;

/* loaded from: classes4.dex */
public class PhotoPickFragment extends Fragment {
    private final i callback;
    private final int maxSelectCount;
    private d photoPicker;
    private final PhotoPickHelper.PickerType pickerType;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType;

        static {
            int[] iArr = new int[PhotoPickHelper.PickerType.values().length];
            $SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType = iArr;
            try {
                iArr[PhotoPickHelper.PickerType.MULTIPLE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType[PhotoPickHelper.PickerType.MULTIPLE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType[PhotoPickHelper.PickerType.SINGLE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType[PhotoPickHelper.PickerType.SINGLE_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PhotoPickFragment(int i8, PhotoPickHelper.PickerType pickerType, i iVar) {
        this.maxSelectCount = i8;
        this.pickerType = pickerType;
        this.callback = iVar;
    }

    private void executePick() {
        int i8 = a.$SwitchMap$com$moyoung$lib$photopicker$PhotoPickHelper$PickerType[this.pickerType.ordinal()];
        if (i8 == 1) {
            this.photoPicker.pickMultipleImage();
            return;
        }
        if (i8 == 2) {
            this.photoPicker.pickMultipleVideo();
        } else if (i8 == 3) {
            this.photoPicker.pickSingleImage();
        } else {
            if (i8 != 4) {
                return;
            }
            this.photoPicker.pickSingleVideo();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (ActivityResultContracts.PickVisualMedia.isPhotoPickerAvailable()) {
            this.photoPicker = new g(this, this.maxSelectCount);
        } else {
            this.photoPicker = new c(this, this.maxSelectCount);
        }
        this.photoPicker.setCallback(this.callback);
        executePick();
    }
}
