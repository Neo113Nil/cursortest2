package com.moyoung.classes.coach.model.net;

import com.moyoung.classes.ClassesLanguageBean;
import java.util.List;

/* loaded from: classes4.dex */
public class ActionDetailResp {
    private List<AudioLanguage> audio_of_language;
    private List<String> body_parts;
    private String description;
    private List<ClassesLanguageBean> description_language;
    private int id;
    private String instrument;
    private String name;
    private List<ClassesLanguageBean> name_language;
    private String picture;
    private int sequence;
    private int status;
    private String video;
    private int video_time;

    private static class AudioLanguage {
        private String file_0;
        private String file_1;
        private String file_2;
        private String language;

        private AudioLanguage() {
        }

        public String getFile_0() {
            return this.file_0;
        }

        public String getFile_1() {
            return this.file_1;
        }

        public String getFile_2() {
            return this.file_2;
        }

        public String getLanguage() {
            return this.language;
        }
    }

    public List<AudioLanguage> getAudio_of_language() {
        return this.audio_of_language;
    }

    public List<String> getBody_parts() {
        return this.body_parts;
    }

    public String getDescription() {
        return this.description;
    }

    public List<ClassesLanguageBean> getDescription_language() {
        return this.description_language;
    }

    public int getId() {
        return this.id;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public String getName() {
        return this.name;
    }

    public List<ClassesLanguageBean> getName_language() {
        return this.name_language;
    }

    public String getPicture() {
        return this.picture;
    }

    public int getSequence() {
        return this.sequence;
    }

    public int getStatus() {
        return this.status;
    }

    public String getVideo() {
        return this.video;
    }

    public int getVideo_time() {
        return this.video_time;
    }
}
